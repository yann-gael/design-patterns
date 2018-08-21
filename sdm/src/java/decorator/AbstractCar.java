package src.java.decorator;

public abstract class AbstractCar {
    int price;
    String decoratorName;
    abstract String getDecoratorName();
    abstract int getCost();

}
