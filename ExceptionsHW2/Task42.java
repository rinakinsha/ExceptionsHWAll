package ExceptionsHW2;

import java.util.Scanner;

/*
* Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
* Пользователю должно показаться сообщение, что пустые строки вводить нельзя. (try быть не должно)
*/

public class Task42 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.printf("Введите какую-нибудь строку: ");
        String input = scann.nextLine();

        if (input.isEmpty()) {
            scann.close();
            throw new RuntimeException("Нельзя вводить пустую строку");
        }
        scann.close();
        System.out.println(input);
    }
}
