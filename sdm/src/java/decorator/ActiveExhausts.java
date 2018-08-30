package src.java.decorator;

public class ActiveExhausts extends OptionalExtra
{

    public ActiveExhausts(ICar aCar) {
        super(aCar);
    }

    @Override
    public void showCar() {
        super.showCar();
        System.out.println(" Active exhausts");
    }
}
