package Lesson05.HomeWork;

    /*1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.*/

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private String salary;
    private int age;


    /*2. Конструктор класса должен заполнять эти поля при создании объекта.*/

    public Employee(String fullName, String position, String email, String phone, String salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    /*3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.*/

    void personalInformation(){
    System.out.println("*****************************");
    System.out.println("Full name: " + fullName + ".");
    System.out.println("Position: " + position + ".");
    System.out.println("E-mail: " + email + ".");
    System.out.println("Phone number: " + phone + ".");
    System.out.println("Salary: " + salary + ".");
    System.out.println("Age: " + age + ".");
    }
    public int getAge(){
        return age;
    }

}
