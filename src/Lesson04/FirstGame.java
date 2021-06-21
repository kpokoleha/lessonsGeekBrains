package Lesson04;
import java.util.Random;
import java.util.Scanner;
public class FirstGame {
    /*1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку.
     *2. * Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
     *3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и длина выигрышной позиции 4.
     * Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;*/

        //задаем параметры поля
        public static char[][] map;
        public static int mapWidth;
        public static int mapHeight;
        public static int winLength;

        //создаем игроков и присваиваем им символы при совершении хода
        public static char human = 'X';
        public static char pc = 'O';
        public static char empty = '_';

        //создаем средство ввода значений координат для человека
        public static Scanner pencil = new Scanner(System.in);
        //создаемсредство ввода значений координат для pc
        public static Random randomPc = new Random();

        //метод создания и заполнения поля
        public static void createMap() {
            mapWidth = 5;
            mapHeight = 5;
            winLength = 4;
            map = new char[mapHeight][mapWidth];

            for (int y = 0; y < mapHeight; y++) {
                for (int x = 0; x < mapWidth; x++) {
                    map[y][x] = empty;
                }
            }
        }

        //метод вывода игрового поля
        public static void printMap() {
            //нумирация полей по горизонтали - начало
            System.out.print("  ");
            for (int i = 1; i < mapWidth + 1; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            //нумирация полей по горизонтали - конец

            for (int y = 0; y < mapHeight; y++) {
                System.out.print(y + 1 + "|"); //нумирация полей по вертикали
                for (int x = 0; x < mapWidth; x++) {
                    System.out.print(map[y][x] + "|");
                }
                System.out.println();
            }
        }
        //метод для хода человека
        public static void humanTurn() {
            int x;
            int y;

            do {
                System.out.print("Enter your coordinates X Y: ");
                x = pencil.nextInt() - 1;
                y = pencil.nextInt() - 1;
            } while (!validCoordinates(y, x) || !emptyField(y, x));

            map[y][x] = human;
            System.out.println("Your move in [" + (x + 1) + ":" + (y + 1) + "]");
        }
        //метод для хода компьютера
        public static void pcTurn() {
            int x;
            int y;

            do {
                x = randomPc.nextInt(mapWidth);
                y = randomPc.nextInt(mapHeight);
            } while (!emptyField(y, x)); //проверка на валиднойсть значений не требуется, т.к. мы задали параметры для рандома

            map[y][x] = pc;
            System.out.println("PC move in [" + (x + 1) + ":" + (y + 1) + "]");
        }

        //метод задания границ значений координат - ход только в пределах поля
        public static boolean validCoordinates(int y, int x) {
            return x >= 0 && x < mapWidth && y >= 0 && y < mapHeight;
        }
        //метод проверки занятости ячейки
        public static boolean emptyField(int y, int x) {
            return map[y][x] == empty;
        }
        //проверка на наличие свободных ячеек
        public static boolean fullMap() {
            for (int y = 0; y < mapHeight; y++) {
                for (int x = 0; x < mapWidth; x++) {
                    if (map[y][x] == empty) {
                        return false;
                    }
                }
            }
            return true;
        }
        //условия на победу
//        public static boolean win(char player) {
//            if (map[0][0] == player && map[0][1] == player && map[0][2] == player) return true;
//            if (map[1][0] == player && map[1][1] == player && map[1][2] == player) return true;
//            if (map[2][0] == player && map[2][1] == player && map[2][2] == player) return true;
//
//            if (map[0][0] == player && map[1][0] == player && map[2][0] == player) return true;
//            if (map[0][1] == player && map[1][1] == player && map[2][1] == player) return true;
//            if (map[0][2] == player && map[1][2] == player && map[2][2] == player) return true;
//
//            if (map[0][0] == player && map[1][1] == player && map[2][2] == player) return true;
//            if (map[0][2] == player && map[1][1] == player && map[2][0] == player) return true;
//
//            return false;
//        }
    public static boolean checkWin(char player) {
        for (int i = 0; i < mapWidth; i++) {
            for (int j = 0; j < mapHeight; j++) {
                if (checkLine(i, j, 1, 0, winLength, player)) {
                    return true;
                }
                if (checkLine(i, j, 1, 1, winLength, player)) {
                    return true;
                }
                if (checkLine(i, j, 0, 1, winLength, player)) {
                    return true;
                }
                if (checkLine(i, j, 1, -1, winLength, player)) {
                    return true;
                }
            }
        }
        return false;
    }

    // проверка линии
    public static boolean checkLine(int x, int y, int vW, int vH, int len, char player) {
        int endW = x + (len - 1) * vW;
        int endH = y + (len - 1) * vH;
        if (!validCoordinates(endW, endH)) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (map[y + i * vH][x + i * vW] != player) {
                return false;
            }
        }
        return true;
    }
        public static void main(String[] args) {

            createMap();
            printMap();

            while (true) {
                humanTurn();
                printMap();
                if (checkWin(human)) {
                    System.out.println("Human win!");
                    break;
                }

                if (fullMap()) {
                    System.out.println("Draw!");
                    break;
                }

                pcTurn();
                printMap();

                if (checkWin(pc)) {
                    System.out.println("PC win!");
                    break;
                }

                if (fullMap()) {
                    System.out.println("Draw!");
                    break;
                }
            }
            System.out.println("Game over!");
        }
    }




