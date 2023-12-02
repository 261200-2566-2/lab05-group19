public class Armor implements Body{
   private String name;
   private int level;
   private double defAddition;
   private double hpBonus;
   private double weight;

   public Armor(String name){
      this.name = name;
      this.level = 1;
      this.defAddition = 40;
      this.hpBonus = 30;
      this.weight = 20;
   }

   public Armor(){
      this("Common Aromr");
   }

   @Override
   public void upBody(){
      this.level++;
      this.defAddition = this.defAddition*(1+0.05*level);
      this.hpBonus = this.hpBonus*(1+0.05*level);
      System.out.println("Now " + name + "'s levels is " + level); 
   }
   
   @Override
   public void checkBodyStatus(){
      System.out.println("-------------------------");
      System.out.println(" " + this.name + "'s Status ");
      System.out.println("Level: " + this.level);
      System.out.println("Defense Addition: " + this.defAddition);
      System.out.println("Hp Bonus: " + this.hpBonus);
      System.out.println("Armor's Weight: " + this.weight);
      System.out.println("-------------------------");
   }

   @Override
   public void checkType(){
      System.out.println("This Body type is Armor");
   }

   public void checkAromrBonus(){
      System.out.println("This Armor give "+ this.hpBonus + " HpBonus ");
   }
}
