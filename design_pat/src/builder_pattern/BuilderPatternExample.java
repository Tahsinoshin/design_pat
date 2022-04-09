package builder_pattern;

public class BuilderPatternExample {

    public static void main(String args[]) {

        //Creating object using Builder pattern in java
        Cake whiteCake = new Cake(
                new Builder(1, 1.5, .75)
                        .  butter(0.5).  eggs(2).vanila(2).milk(0.5)
        );


        //Cake is ready to eat :)
        System.out.println(whiteCake);
    }
}






