package builder_pattern;

public class Cake {
    private final double sugar;   //cup
    private final double butter;  //cup
    private final int eggs;
    private final int vanila;     //spoon
    private final double flour;   //cup
    private final double bakingpowder; //spoon
    private final double milk;  //cup
    private final int cherry;




    //private constructor to enforce object creation through builder
    public Cake(Builder builder) {
        this.sugar = builder.getSugar();
        this.butter = builder.getButter();
        this.eggs = builder.getEggs();
        this.vanila = builder.getVanila();
        this.flour = builder.getFlour();
        this.bakingpowder = builder.getBakingpowder();
        this.milk = builder.getMilk();
        this.cherry = builder.getCherry();
    }

    @Override
    public String toString() {
        return "Cake{" + "sugar=" + sugar + ", butter=" + butter + ", eggs=" + eggs + ", vanila=" + vanila + ", flour=" + flour + ", bakingpowder=" + bakingpowder + ", milk=" + milk + ", cherry=" + cherry + '}';

    }

}
