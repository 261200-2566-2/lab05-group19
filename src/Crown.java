public class Crown implements Head{
    protected String name;
    protected int level;
    protected int hpAddition;
    protected int defBonus;

    public Crown(String name){
        this.name = name;
        this.level = 1;
        this.hpAddition = 20;
        this.defBonus = 10;
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
        System.out.println("Def Bonus: " + this.defBonus);
        System.out.println("-------------------------");
    }

    @Override
    public void upHead() {
        this.level++;
        this.hpAddition += 10;
        this.defBonus += 10;
        System.out.println("Now " + name + "'s levels is " + level);
    }

    public String headName(){return name;}
    public int hpAdd(){return hpAddition;}
    public int atkAdd(){return 0;}
    public int defAdd(){return defBonus;}
}