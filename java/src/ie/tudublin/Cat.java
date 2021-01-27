package ie.tudublin;

public class Cat extends Animal
{
    private int numlives;

    public int getlives()
    {
        return numlives;
    }

    public void setlives(int numlives)
    {
        this.numlives = numlives;
    }

    public void kill() {
        if (numlives > 0){
            numlives--;
            System.out.println("Ouch!");
        }
        if(numlives == 0){
            System.out.println("Dead");
        }
    }

    public Cat(String name)
    {
        super(name);
        this.numlives = 9;
    }

}