public class Mask implements Head{
    protected String name;
    protected int level;
    protected int hpAddition;
    protected int atkBonus;

    public Mask(String name){
        this.name = name;
        this.level = 1;
        this.hpAddition = 30;
        this.atkBonus = 10;
    }

    public Mask(){
        this("Common Mask");
    }

    @Override
    public void upHead() {
        this.level++;
        this.hpAddition += 10;
        this.atkBonus += 10;
        System.out.println("Now " + name + "'s levels is " + level);
    }

    @Override
    public void checkHeadStatus() {
        System.out.println("-------------------------");
        System.out.println(" " + this.name + "'s Status ");
        System.out.println("Level: " + this.level);
        System.out.println("HP Addition: " + this.hpAddition);
        System.out.println("Attack Bonus: " + this.atkBonus);
        System.out.println("-------------------------");
    }

    public String headName(){return name;}

    public int hpAdd(){return hpAddition;}
    public int atkAdd(){return atkBonus;}
    public int defAdd(){return 0;}

}
