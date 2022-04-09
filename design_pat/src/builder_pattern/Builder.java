package builder_pattern;

public class Builder {
    private double sugar;   //cup
    private double butter;  //cup
    private int eggs;
    private int vanila;     //spoon
    private double flour;   //cup
    private double bakingpowder; //spoon
    private double milk;  //cup
    private int cherry;

    public Builder(double sugar, double flour, double bakingpowder) {
        this.sugar = sugar;
        this.flour = flour;
        this.bakingpowder = bakingpowder;
    }

    //builder methods for setting property

    public Builder butter(double cup){this.butter = cup; return this; }
    public Builder eggs(int number){this.eggs = number; return this; }
    public Builder vanila(int spoon){this.vanila = spoon; return this; }
    public Builder milk(double cup){this.milk = cup; return this; }
    public Builder cherry(int number){this.cherry = number; return this; }

    public double getSugar() {
        return sugar;
    }

    public double getButter() {
        return butter;
    }

    public int getEggs() {
        return eggs;
    }

    public int getVanila() {
        return vanila;
    }

    public double getFlour() {
        return flour;
    }

    public double getBakingpowder() {
        return bakingpowder;
    }

    public double getMilk() {
        return milk;
    }

    public int getCherry() {
        return cherry;
    }
}
