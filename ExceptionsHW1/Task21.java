package ExceptionsHW1;

/* Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?*/

public class Task21 {
    public static void main(String[] args) {

    }

    public static int sum2d(String[][] arr) { /* NullPointerException */
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) { /* ArrayIndexOutOfBoundsException */
                int val = Integer.parseInt((arr[i][j])); /* NumberFormatException */
                sum += val;
            }
        }
        return sum;
    }
}
