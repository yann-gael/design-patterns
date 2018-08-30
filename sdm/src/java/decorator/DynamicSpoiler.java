package src.java.decorator;

public class DynamicSpoiler extends OptionalExtra
{

    public DynamicSpoiler(ICar aCar) {
        super(aCar);
    }

    @Override
    public void showCar() {
        super.showCar();
        System.out.println(" Dynamic Spoiler");
    }
}
