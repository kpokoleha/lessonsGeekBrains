package Lesson06.HomeWork;

public class Cat extends Animals {

    public Cat(String animal, String name, String color, int age){
        super(animal,name,color,age);
    }
    private final int maxRunLen = 200;
    private final int maxSwimLen = 0;

    @Override
    public void canSwim(int swimLen){
        System.out.println(name + " can't swim at all.");
    }

    @Override
    public void canRun(int runLen){
        if (runLen >= 0 && runLen < maxRunLen){
            System.out.println(name + " ran " + runLen + " m.");
        } else {
            System.out.println(name + " can't run more than 200 m.");
        }
    }
}
