package lesson3;

import java.util.Arrays;
import java.util.Random;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        System.out.println("Задание1:");
        replace();
        System.out.println("Задание2:");
        createArray();
        System.out.println("Задание3:");
        changeArray();
        System.out.println("Задание4:");
        fillDiagonals();
        System.out.println("Задание5:");
        System.out.print("Задание5.1: ");
        printInitialArray(initialArray(5,7));
        System.out.println("Задание5.2:");
        printInitialArray2(initialArray2(5, "initialValue"));
        System.out.println("Задание6:");
        Random randomArr = new Random(100);
        findMaxMin(10); //ввод длины массива

    }

    /* Задание 1:
       Задать целочисленный массив, состоящий из элементов 0 и 1.
       Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
    private static void replace() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /* Задание2:Задать пустой целочисленный массив длиной 100.
        C помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/
    private static void createArray() {

        int [] arr = new int [100];
        System.out.println("Массив ДО:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Длина массива:" + arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        System.out.println("Масси ПОСЛЕ:");
        System.out.println(Arrays.toString(arr));

    }

    /* Задание3:Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
    private static void changeArray() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<6) {
                arr[i]=arr[i]*2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /* Задание4:
Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/
    private static void fillDiagonals() {
        int [][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j =0; j< 6; j++){
                if ((i==j)||(j == (6-1)-i)) {
                    arr[i][j]=1;
                }
            }
        }
        for (int i = 0; i < arr[0].length; i++) { //печать строки с номерами
            System.out.print(" "+ i);}

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " "); // печать столбца с номерами

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " "); //вывод массива arr[]
            }
            System.out.println();
        }
    }

    /* Задание 5.1:
    Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/
    public static void printInitialArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static int[] initialArray(int len, int initialValue) {
        int[] arr= new int[len];
        len = arr.length;
        for (int i = 0; i < len; i++) {
            arr[i]= initialValue;
        }
        return arr;

    }

    /* Задание 5.2:
    Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/

    public static void printInitialArray2(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static String[] initialArray2(int len, String initVal) {
        String[] arr= new String[len];
        len = arr.length;
        for (int i = 0; i < len; i++) {
            arr[i]= initVal;
        }
        return arr;

    }


        /* Задание 6:
    Задать одномерный массив и найти в нем минимальный и максимальный элементы*/

    private static void findMaxMin(int n) {
        int []arr = new int[n];
        Random randomArr = new Random();
        for (int i= 0; i<arr.length; i++) {
            arr[i]= (randomArr.nextInt(100));
        }
        System.out.println(Arrays.toString(arr)); //печать рандомного массива, длинной n

        int max= arr[0];
        for (int j = 1; j < arr.length ; j++) {
            if (arr[j]>max){
                max=arr[j];
            }
                    }
        System.out.println("Max= "+ max);

        int min= arr[0];
        for (int j = 1; j < arr.length ; j++) {
            if (arr[j]<min) {
                min=arr[j];
            }
        }
        System.out.println("Min = "+ min);

    }
 }
