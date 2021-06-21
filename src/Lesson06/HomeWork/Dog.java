package Lesson06.HomeWork;

public class Dog extends Animals {
    public Dog(String animal, String name, String color, int age){
        super(animal,name,color,age);
    }
    private final int maxRunLen = 500;
    private final int maxSwimLen = 10;

    @Override
    public void canRun(int runLen){
        if (runLen >= 0 && runLen < maxRunLen){
            System.out.println(name + " ran " + runLen + " m.");
        } else {
            System.out.println(name + " can't run more than 500 m.");
        }
    }

    @Override
    public void canSwim(int swimLen){
        if (swimLen >= 0 && swimLen < maxSwimLen){
            System.out.println(name + " swam " + swimLen + " m.");
        } else {
            System.out.println(name + " can't swim more than 10 m.");
        }
    }
}
