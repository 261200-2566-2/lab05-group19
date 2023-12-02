public class Archer extends Character{
    private int speed = 20;

    public Archer(String name){
        super(name,120,70,30,"Archer");
    }

    @Override
    public void checkStatus(){
        super.checkStatus();
        System.out.println("Speed: " + speed);
        System.out.println("-------------------------");
    }

    @Override
    public void skill(){
        if(!skillok && hp != 0){
            System.out.println(name + " uses a skill: Rain From Paradise");
            skillok = true;
        }
        else System.out.println(name + " has already used this skill or died");
    }
    @Override
    public void attack(Character opp){
        super.attack(opp);
        if(opp.hp > 0 && hp != 0){
            System.out.println("Special Ability: Eye of Precision: Gain Bonus ATK +" + speed / 2);
            if (skillok) {
                System.out.println("Skill: Rain From Paradise: Critical ATK +20");
                atk += 20;
                opp.receiveDmg(atk + speed / 2);
                skillok = false;
                atk -= 20;
            } else {
                opp.receiveDmg(atk + speed / 2);
            }
        }
    }


}
