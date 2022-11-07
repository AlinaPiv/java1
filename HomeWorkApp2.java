package lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println("1 задание:");
       boolean result = within10And20 ( 5, 5); //1e задание (1.1)
        System.out.println("20>=sum>=10 ? " + result);
        boolean altResult = altWithin10And20 (5,20); // 1 задание (1.2)
        System.out.println("altResult= " + altResult);
        System.out.print("2 задание: ");
        checkNumbPositive (0); // 2 задание
        System.out.print("3 задание: ");
        boolean negativeNumb=checkNumbNegative (0); // 3 задание
        System.out.println(negativeNumb);
        System.out.println("4 задание:");
        repeatStr ("Привет", 5); // 4 задание
        System.out.println("5 задание: ");
        boolean checkYear = checkLeapYear (1772 ); // 5 задание
        System.out.println("is Year a leap: " + checkYear);
           }

        private static void repeatStr(String text, int c) { // 4 задание
        for (int i = 0; i < c; i++) {
            System.out.println(text);
        }
    }

    private static boolean within10And20 (int a, int b) {  // 1е задание (1.1)
                    int sum= (a +b);
        System.out.println("sum= " + sum);
        if (sum <= 20 && sum >= 10) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean altWithin10And20 (int a, int b) { // 1е задание (1.2)
        System.out.println("altSum= " + (a+b));
        return (20>=(a + b) && (a + b) >= 10);
    }
    private static void checkNumbPositive (int a) {  // 2е задание
               if (a < 0) {
            System.out.println("a= " + a + " отрицательное");
        } else {
            System.out.println("a= " + a + " положительное");
        }
    }
    private static boolean checkNumbNegative(int a) {// 3 задание
        System.out.print("a= "+ a );
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    private static boolean checkLeapYear(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
