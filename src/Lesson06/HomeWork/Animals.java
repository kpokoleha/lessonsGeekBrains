package Lesson06.HomeWork;

public abstract class Animals {

    protected String animal;
    protected String name;
    protected String color;
    protected int age;


    public Animals(String animal, String name, String color, int age){
        this.animal = animal;
        this.name = name;
        this.color = color;
        this.age = age;
        System.out.println("I am a " + animal + " " + name + ".");
    }

    public abstract void canRun (int runLen);

    public abstract void canSwim(int swimLen);

}
