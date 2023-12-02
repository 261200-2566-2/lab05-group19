public class Mask implements Head{
    private String name;
    private int level;
    private double hpAddition;
    private double atkBonus;

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
    public void checkHeadStatus() { 
        System.out.println("-------------------------");
        System.out.println(" " + this.name + "'s Status ");
        System.out.println("Level: " + this.level);
        System.out.println("HP Addition: " + this.hpAddition);
        System.out.println("Attack Bonus: " + this.atkBonus);
        System.out.println("-------------------------"); 
    }

    @Override
    public void upHead() {
        this.level++;
        this.hpAddition = this.hpAddition*(1+0.05*level);
        this.atkBonus = this.atkBonus*(1+0.05*level);
        System.out.println("Now " + name + "'s levels is " + level);   
    }

    @Override
    public void checkType(){
       System.out.println("This Head type is Mask");
    }

    public void checkMaskBonus(){
        System.out.println("This Mask give "+ this.atkBonus+ " AttackBonus");
    }
    
}
