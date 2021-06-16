package Lesson05.HomeWork;

public class Company {
    public static void main(String[] args) {
//        Employee employee_1 = new Employee("Ivanov Ivan Ivanovich", "engineer", "i.ivanov@nrtb.ru", "+7 (999) 333 22 11", "2000 $", 45);
//
//        employee_1.personalInformation();

        /*4. Создать массив из 5 сотрудников.*/

        Employee employees[] = new Employee[5];
        employees[0] = new Employee("Petrov Petr Petrovich", "doctor", "p.petrov@nrtb.ru", "+7 (888) 777 66 55", "1500 $", 39);
        employees[1] = new Employee("Sidorov Sidor Sidorovicsh", "painter", "s.sidorov@nrtb.ru", "+7 (777) 666 55 44", "300 $", 65);
        employees[2] = new Employee("Ivanov Ivan Ivanovich", "engineer", "i.ivanov@nrtb.ru", "+7 (999) 333 22 11", "2000 $", 45);
        employees[3] = new Employee("Stepanov Stepan Stepanovich", "driver", " - ", "+7 (666) 555 44 33", "1000 $", 56);
        employees[4] = new Employee("Evgeniev Evgeniy Evgenievich", "programmer", "e.evgeniev@nrtb.ru", "+7 (555) 444 33 22", "2000 $", 28);

        /*5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.*/

        for (int i = 0; i < employees.length; i++) {
              if (employees[i].getAge() > 40){
                  employees[i].personalInformation();
              }
        }





    }



}
