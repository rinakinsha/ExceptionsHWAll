package ExceptionsHW2;

import java.util.Scanner;

/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа
 * (типа float), и возвращает введенное значение. Ввод текста вместо числа не
 * должно приводить к падению приложения, вместо этого, необходимо повторно
 * запросить у пользователя ввод данных. В этом задании не используем try catch.
 * Пишем регулярное выражение и используем на строке метод matches.
 */
public class Task12 {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.printf("Введите дробное число: ");
        String input = scann.nextLine();
        while (!input.matches("([+-]?(\\d+\\.)?\\d+)")) {
            System.out.println("Неверный формат ввода, повторите попытку");
            input = scann.nextLine();
        }
        float number = Float.parseFloat(input);
        scann.close();
        System.out.println(number);
    }
}