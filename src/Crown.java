public class Crown implements Head{
    private String name;
    private int level;
    private double hpAddition;
    private double spdBonus;
    private double weight;

    public Crown(String name){
        this.name = name;
        this.level = 1;
        this.hpAddition = 20;
        this.spdBonus = 10;
        this.weight = 5;
    }

    public Crown(){
        this("Commom Crown");
    }

    @Override
    public void checkHeadStatus() {
        System.out.println("-------------------------");
        System.out.println(" " + this.name + "'s Status ");
        System.out.println("Level: " + this.level);
        System.out.println("HP Addition: " + this.hpAddition);
        System.out.println("Speed Bonus: " + this.spdBonus);
        System.out.println("Crown's Weight: " + this.weight);
        System.out.println("-------------------------");
    }

    @Override
    public void upHead() {
        this.level++;
        this.hpAddition = this.hpAddition*(1+0.05*level);
        this.spdBonus = this.spdBonus*(1+0.05*level);
        System.out.println("Now " + name + "'s levels is " + level);   
    }

    @Override
    public void checkType(){
       System.out.println("This Head type is Crown");
    }

    public void checkCrownBonus(){
        System.out.println("This Crown give "+ this.spdBonus + " SpeedBonus");
    }
    
}
