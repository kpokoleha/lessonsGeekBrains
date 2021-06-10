package HW_2;
public class HomeWork_2 {

	public static void main(String[] args) {

		System.out.println("\n***Exercise 1***");
		System.out.println(sumRange(15, -3));

		System.out.println("\n***Exercise 2***");
		positiveOrNegative(-15);

		System.out.println("\n***Exercise 3***");
		System.out.println(isNegative(-59));

		System.out.println("\n***Exercise 4***");
		printWord("My first program", 6);


		System.out.println("\n***Exercise 5***");
		System.out.println(isLeapYear(2021));
	}

	/*1. Написать метод, принимающий на вход два целых числа и проверяющий,
     что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
     в противном случае – false.*/

	public static boolean sumRange(int a, int b) {

		return (a + b) >= 10 && (a + b) <= 20;
	}

	/* 2. Написать метод, которому в качестве параметра передается целое число,
 метод должен напечатать в консоль, положительное ли число передали или отрицательное.
 Замечание: ноль считаем положительным числом.*/

	public static void positiveOrNegative(int valueA) {

		if (valueA >= 0) {
			System.out.println("Number " + valueA + " is positive");
		} else {
			System.out.println("Number " + valueA + " is negative");
		}
	}

	/* 3. Написать метод, которому в качестве параметра передается целое число.
	 * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/

	public static boolean isNegative(int valueB) {
		if (valueB <= 0) {
			return true;
		} else {
			return false;
		}
	}

	/* 4. Написать метод, которому в качестве аргументов передается строка и число,
	 * метод должен отпечатать в консоль указанную строку, указанное количество раз;*/

	public static void printWord(String word, int times) {
		for (int i = 1; i <= times; i++) {
			System.out.println(i + ". " + word);
		}
	}

	/* 5.* Написать метод, который определяет, является ли год високосным,
  и возвращает boolean (високосный - true, не високосный - false).
  Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/

		public static boolean isLeapYear(int year) {
		return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
		}
	}
