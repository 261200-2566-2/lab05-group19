public class Shirt  implements Body{
   private String name;
   private int level;
   private double defAddition;
   private double spdBonus;
   private double weight;

   public Shirt(String name){
      this.name = name;
      this.level = 1;
      this.defAddition = 20;
      this.spdBonus = 10;
      this.weight = 5;
   }

   public Shirt(){
      this("White Shirt");
   }

   @Override
   public void upBody(){
      this.level++;
      this.defAddition = this.defAddition*(1+0.05*level);
      this.spdBonus = this.spdBonus*(1+0.05*level);
      System.out.println("Now " + name + "'s levels is " + level); 
   }
   
   @Override
   public void checkBodyStatus(){
      System.out.println("-------------------------");
      System.out.println(" " + this.name + "'s Status ");
      System.out.println("Level: " + this.level);
      System.out.println("Defense Addition: " + this.defAddition);
      System.out.println("Speed Bonus: " + this.spdBonus);
      System.out.println("Shirt's Weight: " + this.weight);
      System.out.println("-------------------------");
   }

   @Override
   public void checkType(){
      System.out.println("This Body type is Shirt");
   }

   public void checkShirtBonus(){
    System.out.println("This Shirt give "+ this.spdBonus + " SpeedBonus ");
   }
}
