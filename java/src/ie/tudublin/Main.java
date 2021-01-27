package ie.tudublin;

public class Main
{
    public static void main(String[] args)
    {
        int i;
        // System.out.println("Hello world");

        // Animal misty = new Dog("Misty");

        // Animal topCat = new Cat("TopCat");

        // System.out.println(misty);
        // System.out.println(topCat);

        // misty = topCat;

        // topCat.setName("Garfield");

        // System.out.println(misty);
        // System.out.println(topCat);

        // // What will get printed out??

        // // 1. topcat, Garfield
        // // 2. garfield, Garfield 

        Cat ginger = new Cat("Ginger");
        System.out.println(ginger);

        int lives = ginger.getlives();
        for (i = 0; i < lives; i++){
            ginger.kill();
        }


    }
} 