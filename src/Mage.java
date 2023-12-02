public class Mage extends Character{
    protected int mana = 100;

    public Mage(String name){
        super(name,180,50,40,"Mage");
    }
    @Override
    public void checkStatus(){
        super.checkStatus();
        System.out.println("Mana: " + mana);
        System.out.println("-------------------------");
    }

    @Override
    public void skill(){
        if(!skillok && hp != 0){
            System.out.println(name + " uses a skill: Enlightenment From The Future: Mana -20");
            skillok = true;
            mana -= 20;
        }
        else System.out.println(name + " has already used this skill or died");
    }

    @Override
    public void attack(Character opp){
        super.attack(opp);
        if(opp.hp > 0 && hp != 0){
            System.out.println(name + " uses a magic UMBRACADABRA!!! MANA -20 --> ATK +10");
            mana -= 20;
            opp.receiveDmg(atk + 10);
        }
    }


    @Override
    protected void receiveDmg(int dmg){
        if(skillok){
            skillok = false;
            System.out.println("Skill Activated: Enlightenment From The Future: Barrier DEF +20");
            super.receiveDmg(dmg-20);
        }else super.receiveDmg(dmg);
        if(dmg > 0 && hp != 0){
            mana += 20;
            System.out.println("Special Ability: Revenge Absorption: MANA +20 when be damaged");
        }
    }
}
