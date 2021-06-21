package Lesson06.HomeWork;
import java.util.Random;

/*1. Создать классы Собака и Кот с наследованием от класса Животное.
 *2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 *3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 *4. * Добавить подсчет созданных котов, собак и животных.*/

public class Pets {
    private static Random random = new Random();

    public static void main(String[] args) {
        Cat cat1 = new Cat("cat", "Vasya", "gray", 5);
        Cat cat2 = new Cat("cat", "Plushka", "white", 4);
        Cat cat3 = new Cat("cat", "Zhuzha", "black", 7);

        Dog dog1 = new Dog("dog", "Sharic", "orange", 7);
        Dog dog2 = new Dog("dog", "Topa", "brown", 6);
        cat1.canRun(random.nextInt(300));
        cat1.canSwim(0);
        dog1.canRun(random.nextInt(600));
        dog1.canSwim(random.nextInt(20));

        Animals[] pets = {cat1, cat2, cat3, dog1, dog2};
        int cats = 0;
        int dogs = 0;
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] instanceof Cat) {
                cats++;
            } if (pets[i] instanceof Dog) {
                dogs++;
            }
        }
        System.out.println("We have " + cats + " cats.");
        System.out.println("We have " + dogs + " dogs.");
    }
}
