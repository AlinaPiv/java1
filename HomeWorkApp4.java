package lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {
    private static int SIZE;
    private static int WINSIZE;
    private static final char DOT_EMPTY='□';
    private static final char DOT_HUMAN= 'X';
    private static final char DOT_AI='O';
    private static char [][] MAP= new char[SIZE][SIZE];
    public static final String HEADER_FIRST_SYMBOL = "@";
    private static final Scanner in= new Scanner(System.in);
    private static final Random random= new Random();
   // private static int turnsCount = 0;

    public static void main (String[] args) {
        turnGame();

    }

    public static void turnGame() {
        do {
            System.out.println("\n\nИгра начинается!");
            init();  //initMap();
            printMap();
            playGame();
        } while (isContGame());
    }

    private static void init() {
                //turnsCount = 0;
        SIZE= getSizeFromUser();
        WINSIZE= getWinSize();
        initMap();
    }

    private static int getWinSize() {
        if (SIZE>=3 && SIZE <=6) {
            return 3;
        } else if (SIZE>6 && SIZE <=10) {
            return 4;
        }
        return 5;
    }

    private static int getSizeFromUser() {
        System.out.println("Выберете размер игрового поля:");
        return in.nextInt();
    }

    private static boolean isContGame() {
        System.out.println("Хотите продолжить игру?");
                return switch (in.next()) {
                    case "y", "д", "+", "да" -> true;
                    default -> false;
                };
    }


    private static void printMap() {
        printHeaderMap();
        printBodyMap();
    }


    private static void initMap() {
        MAP = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j <SIZE; j++) {
                MAP [i][j] = DOT_EMPTY;
            }
                    }
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_SYMBOL + " ");
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i + 1 + " ");}
        System.out.println();
                 }

    private static void printMapNumber(String i) {
        System.out.print(i);
    }

    private static void printBodyMap() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i + 1 + " ");
            for (int j=0; j<SIZE; j++) {
                System.out.print(MAP[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();

           if (checkEnd(DOT_HUMAN)) {
               break;
           }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

                aiTurn();
            printMap();
            if (checkEnd(DOT_AI)) {
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }



    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("Вы победили!!!");
            } else if (symbol == DOT_AI) {
                System.out.println("Победил AI! Вы проиграли!");
            }
            return true;
        }
        //ничья
        return false;
    }

    public static boolean checkWin(char symbol) { //Проверка победы для поля 5х5
        int verticalLine;
        int horizontLine;
        int diagonalLeft;
        int diagonalRight;

        for (int i = 0; i < SIZE; i++) {
            horizontLine = 0;
            verticalLine = 0;
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == symbol) {
                    horizontLine++;
                }
                if (MAP[j][i] == symbol) {
                    verticalLine++;
                }
                if (horizontLine == WINSIZE || verticalLine == WINSIZE) {
                    return true;
                }
            }
        }

        diagonalLeft = 0; diagonalRight = 0;
        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {

            if (MAP[i][i] == symbol) {
                diagonalLeft++;
            }
            if (MAP[i][SIZE - i - 1] == symbol) {
                diagonalRight++;
            }
        }
        }
        if (diagonalLeft == WINSIZE || diagonalRight == WINSIZE) {
            return true;
        }
        return false;
    }

        /* if(MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol)
            return true;
        if(MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol)
            return true;
        if (MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol) return
                true;
        if (MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol) return
                true;
        if (MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol) return
                true;
        if (MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol) return
        true;
        if (MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) return
                true;
        if (MAP[2][0] == symbol && MAP[1][1] == symbol && MAP[0][2] == symbol) return
                true;
        return false;*/

    public static void aiTurn() {
        System.out.println("\nХод AI!");
        int rowNumb;
        int columnNumb;
        do {
            rowNumb = random.nextInt(SIZE);
            columnNumb = random.nextInt(SIZE);}
            while (!isCellFree(rowNumb, columnNumb));
            MAP[columnNumb][rowNumb] = DOT_AI;

    }

    /* private static int getNumbFromAi() {
        int n= random.nextInt(SIZE);
        return n;
    }*/

    public static void humanTurn() {
        System.out.println("\nХод игрока!");
        int rowNumb;
        int columnNumb;
               do {
            System.out.println("Введите координаты строки:");
            rowNumb = in.nextInt()-1;
            System.out.println("Введите координаты столбца:");
            columnNumb = in.nextInt()-1;
        } while (!isCellFree(rowNumb, columnNumb));
            MAP[rowNumb][columnNumb]= DOT_HUMAN;

        // if  {
           //     break;
          //  }
           // System.out.printf("Ошибка! Ячейка с координатами %s:%s же используется%n", rowNumb+1, columnNumb+1);
        }


  /* private static int getRowNumbFromScanner() {  //Получаем координаты строки от пользователя
        return in.nextInt() - 1;
    }
     private static int getColumnNumbFromScanner() { //Получаем координаты столбца от пользователя
        int n = in.nextInt() - 1;
        return n;
    }*/



    public static boolean isCellFree (int rowNumb, int columnNumb) {
        return MAP[rowNumb][columnNumb]==DOT_EMPTY;
    }


}







