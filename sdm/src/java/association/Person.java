package src.java.association;

public class Person
{
    int count;
    Head head;
    Torso torso;
    Limbs limbs;
    Person(int headCount, int torsoCount, int limbsCount)
    {
        head = new Head(headCount);
        torso = new Torso(torsoCount);
        limbs = new Limbs(limbsCount);
    }
    void showAll()
    {
        System.out.println("New person created.");
        head.showAll();
        torso.showAll();
        limbs.showAll();
    }
}
