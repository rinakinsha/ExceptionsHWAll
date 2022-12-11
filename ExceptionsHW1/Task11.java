package ExceptionsHW1;

/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения*/

public class Task11 {
    public static void main(String[] args) {

        /*
         * int x = 10;
         * int y = 0;
         * System.out.println(division(x, y));
         */

        /* System.out.println(numberFromArray()); */

        String num = "1O"; /* буква вместо нуля */
        System.out.println(conversion(num));

    }

    public static int division(int a, int b) { /* ArithmeticException */
        int c = a / b;
        return c;
    }

    public static int numberFromArray() { /* ArrayIndexOutOfBoundsException */
        int[] array = new int[10];
        int num = array[10];
        return num;
    }

    public static int conversion(String number) { /* NumberFormatException */
        int result = Integer.parseInt(number);
        return result;
    }

}
