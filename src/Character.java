public abstract class Character {
    protected int level;
    protected String name,job;
    protected int hp,atk,def;
    protected boolean hok,skillok;
    protected Head h;

    protected Character(String name, int h, int a, int d, String job){
        this.name = name;
        level = 1;
        hp = h;
        atk = a;
        def =d;
        hok = false;
        skillok = false;
        this.job = job;
    }

    protected void checkStatus(){
        System.out.println("-------------------------");
        System.out.println("  " + name + "'s status  ");
        System.out.println("Level: " + level);
        System.out.println("Health: " + hp);
        System.out.println("Attack: " + atk);
        System.out.println("Defense: " + def);
        System.out.println("Job: " + job);
    }

    public void lvUp(){
        System.out.println(name + " LEVEL UP !!!");
        level++;
        hp += 20;
    }
    protected abstract void skill();

    public void headAdd(Head h){
        if(!hok){
            this.h = h;
            hok = true;
            System.out.println(name + " equips " + h.headName());
            hp += h.hpAdd();
            atk += h.atkAdd();
            def += h.defAdd();
        }else{
            headDrop();
            this.headAdd(h);
        }
    }

    public void headDrop(){
        if(!hok){
            System.out.println(name + " doesn't have any head armor!");
        }else{
            System.out.println(name + " removes " + h.headName());
            hok = false;
            hp -= h.hpAdd();
            atk -= h.atkAdd();
            def -= h.defAdd();
            this.h = null;
        }
    }
    protected void attack(Character opp){
        if(opp.hp == 0){
            System.out.println(opp.name + " already has died!");
        }else if(this.hp == 0){
            System.out.println(this.name + " can't fight because of death!");
        }else{
            System.out.println(this.name + " attacks " + opp.name + " +" + atk + " !!!" );
            }
    }

    protected void receiveDmg(int dmg){
        this.hp = this.hp - dmg + def;
        System.out.println(this.name + " receives DMG -" + (dmg-def));
        if(this.hp < 0) this.hp = 0;
        if(this.hp == 0) System.out.println(this.name + " is death...");
    }

}
