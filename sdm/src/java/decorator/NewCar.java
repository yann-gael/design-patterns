package src.java.decorator;

public class NewCar implements ICar
{

    public ICar addOption() {
        return this;
    }

    public void showCar() {
        System.out.println("You have chosen these optional extras:");
    }
}
