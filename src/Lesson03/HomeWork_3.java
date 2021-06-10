package Lesson03;

import java.util.Random;

public class HomeWork_3 {
    public static Random random = new Random();

    public static void main(String[] args) {

        System.out.println("****Exercise 1 (fill random and read)****");
        int[] originalArray = new int[10];
        fillArray1(originalArray);
        readArray1(originalArray);
        System.out.println("\n\n ****Exercise 1 (invert)****");
        invertArray1(originalArray);

        System.out.println("\n \n ****Exercise 2****");
        int[] myIntArray = new int[100];
        fillArray1To100(myIntArray);
        readArray1To100(myIntArray);

        System.out.println("\n \n ****Exercise 3****");
        multiplyNumber();

        System.out.println("\n \n ****Exercise 4****");
        int[][] dArray = new int[5][5];
        fillArrayForChangeDiagonal(dArray);
        changeDiagonal(dArray);

        System.out.println("\n \n ****Exercise 5****");
        int[] len = new int[7];
        initialValueArray(len, 3);

        System.out.println("\n \n ****Exercise 6 (my random array)****");
        int[] minMaxArray = new int[8];
        fillArrayMinMax(minMaxArray);
        readArrayMinMax(minMaxArray);

        System.out.println("\n \n ****Exercise 6 (min+max)****");
        minMaxArray(minMaxArray);

    }

    /* 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     *С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
    //запись рандомных данных в массив
    public static void fillArray1(int[] originalArray) {
        Random random = new Random();
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = random.nextInt(2);
        }
    }

    //чтение данных из массива
    public static void readArray1(int[] originalArray) {
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print("[" + originalArray[i] + "] ");
        }
    }

    //инвертирование
    public static void invertArray1(int[] originalArray) {
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = originalArray[i] == 0 ? 1 : 0;//используя тернарный оператор
//            if (originalArray[i] == 0) {
//                originalArray[i] = 1;
//            } else {
//                originalArray[i] = 0;
//            }
            System.out.print("[" + originalArray[i] + "] ");
        }
    }

    /* 2. Задать пустой целочисленный массив длиной 100.
     * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/
    //запись данных в массив
    public static void fillArray1To100(int[] myIntArray) {
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = (i + 1);
        }
    }

    //чтение данных из массива
    public static void readArray1To100(int[] myIntArray) {
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.print("[" + myIntArray[i] + "] ");
        }
    }

    /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     * и числа меньшие 6 умножить на 2;*/
    public static void multiplyNumber() {
        int[] multiplyNumberArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < multiplyNumberArray.length; i++) {
            if (multiplyNumberArray[i] < 6) {
                multiplyNumberArray[i] = multiplyNumberArray[i] * 2;
            }
            System.out.print("[" + multiplyNumberArray[i] + "] ");
        }

    }

    /* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/
    //заполнение массива
    public static void fillArrayForChangeDiagonal(int[][] dArray) {
        int counter = 1;
        for (int i = 0; i < dArray.length; i++) {
            for (int j = 0; j < dArray[i].length; j++) {
                dArray[i][j] = counter;
                counter++;
            }
        }
    }
    //замена элементов массива на "1"
    public static void changeDiagonal(int[][] dArray) {
        for (int i = 0; i < dArray.length; i++) {
            for (int j = 0; j < dArray.length; j++) {
                if (i > j) {
                    System.out.print("[" + dArray[i][j] + "] ");
                } else if (i < j) {
                    System.out.print("[" + dArray[i][j] + "] ");
                } else {
                    System.out.print("[1]");
                }
            }
            System.out.println();
        }
    }

    /* 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
     * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/
        public static void initialValueArray(int[] len, int initialValue) {
        for (int i = 0; i < len.length; i++) {
            System.out.print("[" + initialValue + "] ");
        }
    }

    /* 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;*/
    //заполнение массива
    public static void fillArrayMinMax(int[] minMaxArray) {
        Random randMinMax = new Random();
        for (int i = 0; i < minMaxArray.length; i++) {
            minMaxArray[i] = random.nextInt(50);
        }
    }
    //чтение данных из массива
    public static void readArrayMinMax(int[] minMaxArray) {
        for (int i = 0; i < minMaxArray.length; i++) {
            System.out.print("[" + minMaxArray[i] + "] ");
        }
    }
    //поиск min и max
    public static void minMaxArray(int[] minMaxArray) {
        int min = minMaxArray[0];
        int max = minMaxArray[0];
        for (int i = 0; i < minMaxArray.length; i++) {
//            if (minMaxArray[i] < min) {
//                min = minMaxArray[i] < min ? minMaxArray[i];
//            }
            min = minMaxArray[i] < min ? minMaxArray[i] : min;
        }
        System.out.println("Minimal number is [" + min + "]");
        for (int i = 0; i < minMaxArray.length; i++) {
//            if (minMaxArray[i] > max) {
//                max = minMaxArray[i];
//            }
            max = minMaxArray[i] > max ? minMaxArray[i] : max;
        }
        System.out.println("Maximal number is [" + max + "]");
    }

    /*7. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
      ** Примеры:
      * checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
      * checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
      * граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.*/

    /*8. Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
     * при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
     * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
     * При каком n в какую сторону сдвиг можете выбирать сами.*/

}






