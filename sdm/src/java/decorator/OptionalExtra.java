package src.java.decorator;

public abstract class OptionalExtra implements ICar
{
    ICar newPurchase;
    public OptionalExtra(ICar aCar)
    {
        this.newPurchase = aCar;
    }

    public ICar addOption()
    {
        return this;
    }
    public void showCar()
    {
        newPurchase.showCar();
    }
}
