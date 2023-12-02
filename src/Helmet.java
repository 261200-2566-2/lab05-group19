public class Helmet implements Head{
    private String name;
    private int level;
    private double hpAddition;
    private double defBonus;
    private double weight;

    public Helmet(String name){
        this.name = name;
        this.level = 1;
        this.hpAddition = 40;
        this.defBonus = 20;
        this.weight = 10;
    }

    public Helmet(){
        this("Common Helmet");
    }

    @Override
    public void checkHeadStatus() {
        System.out.println("-------------------------");
        System.out.println(" " + this.name + "'s Status ");
        System.out.println("Level: " + this.level);
        System.out.println("HP Addition: " + this.hpAddition);
        System.out.println("Defense Bonus: " + this.defBonus);
        System.out.println("Helmet's Weight: " + this.weight);
        System.out.println("-------------------------");
        
    }

    @Override
    public void upHead() {
        this.level++;
        this.hpAddition = this.hpAddition*(1+0.05*level);
        this.defBonus = this.defBonus*(1+0.05*level);
        System.out.println("Now " + name + "'s levels is " + level);      
    }
    
    @Override
    public void checkType(){
       System.out.println("This Head type is Helmet");
    }

    public void checkHelmetBonus(){
        System.out.println("This Helmet give "+ this.defBonus +" DefenseBonus");
    }
}
