package src.java.decorator;

public class SuperCar
{
    ICar car = new NewCar();
    public void makeNewPurchase(String optionName)
    {
        if(optionName.equals("sound_pack"))
        {
            this.car = new ActiveExhausts(car);
        }
        else if (optionName.equals("active_body_kit "))
        {
            this.car = new DynamicSpoiler(car);
        }
    }

    public void showPurchase()
    {
        car.showCar();
    }
}
