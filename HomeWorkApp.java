package lesson1;

public class HomeWorkApp {
    public static void main (String [] args) {
        printTreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }



    private static void printTreeWords() { // 2е задание
        System.out.println("Orange");
        System.out.println("Apple");
        System.out.println("Banana");
    }

    private static void checkSumSign() { // 3е задание
        int varA = 9;
        int varB = 15;
        int result = varA + varB;
        System.out.println("Сумма:" + result);
        if (result >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {// 4е задание
        int value = 105;
        System.out.println("Значение:" + value);
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() { // 5е задание
        int a = 12290;
        int b = 586;
        System.out.println("a=" + a + "b=" + b);
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

}
