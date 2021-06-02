package Lesson01;

public class FirstClass {
    public static void main (String[] args) {
    /* System.out.println("Hello,world!");
     System.out.println("Hello,world!");
     System.out.println("Hello,world!");

     //целочисленные
        byte myByte = 127;// -128...+127 (1 byte)
        short myShort = -32768; // -32768...+32767 (2 byte)
        int myInteger = 5345987; //-2.1млрд...+2.1млрд (4 byte) //default
        long myLong = 3000000000L; // -2^63...+2^63 (8 byte)

        System.out.println(myShort);

        //числа с точками
        float myFloat = 15.258f; // (4 byte) <>.0000000
        double myDouble = 15.258; // (8 byte) <>.00000000000000 //default

        System.out.println(myDouble);

        //символы
        char myChar = 'h'; // (2 byte)

        System.out.println(myChar);

        //булево
        boolean myBoolean = true; //or false (1 byte)
        System.out.println(myBoolean);

        //Math operations
        //+,-.*,/,^
        int a = 15;
        int b = 172;
        int c = a + b;

        System.out.println(c);

        int x = 15;
        int y = 4;
        int z = x % y;

        System.out.println(z);
        System.out.println(myShort + " " + myBoolean + " " + c + " " + myChar);
        System.out.println("Hello, my value is: " + myFloat);

        //условный оператор
        int a1 = 20;
        if (a1 > 30) {
         System.out.println("Yes, a1 > 30");
        } else {
            System.out.println("No, a1 < 30");
        }

        int b1 = 50;
        if (b1 > 100) {
            System.out.println("b1 > 100");
        } else if (b1 < 40) {
            System.out.println("b1 < 40");
        } else {
            System.out.println("Unknown???");
        }*/
        int a = 150;
        int b = 200;
        int result;

        result = myMath(a,b); // result = a + b;
        a = a + 1;
        result = myMath(a,b);
        b = b + 1;
        result = myMath(a,b);
        a = a +1;
        result = myMath(a,b);

        System.out.println("Result = " + result);
        doSomething();
    }
    public static int myMath(int valueA, int valueB) { // возвращающие методы
        return valueA * valueB;

    }
    public static void doSomething(){ // невозвращающий метод
        System.out.println("jjjjj");
        System.out.println("jhkfgj * 2");
    }

}

