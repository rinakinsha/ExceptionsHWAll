package ExceptionsHW3;

import java.util.Scanner;

/*1.Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
2. Login должен содержать только латинские буквы, цифры и знак подчеркивания.
3. Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
4. Password должен содержать только латинские буквы, цифры и знак подчеркивания. Длина password должна быть меньше 20 символов. 
Также password и confirmPassword должны быть равны.
5. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
6. WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
второй принимает сообщение исключения и передает его в конструктор класса Exception.
7. Обработка исключений проводится внутри метода.
8. Метод возвращает true, если значения верны или false в другом случае. */

public class Task13 {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите логин (должен содержать только латинские буквы, цифры и знак подчеркивания)");
        System.out.printf("Логин: ");
        String login = scann.nextLine();
        System.out.println("Введите пароль (должен содержать только латинские буквы, цифры и знак подчеркивания)");
        System.out.printf("Пароль: ");
        String password = scann.nextLine();
        System.out.printf("Введите пароль повторно: ");
        String password1 = scann.nextLine();
        scann.close();

        System.out.println(loginVerification(login, password, password1));
    }

    private static boolean loginVerification(String log, String password, String password1)
            throws WrongLoginException, WrongPasswordException {
        if (log.length() > 19) {
            throw new WrongLoginException("Некорректный ввод логина! (логин должен быть меньше 20 символов)");
        }
        if (!log.contains("_")) {
            throw new WrongLoginException("Некорректный ввод логина! (отсутствует нижнее подчеркивание)");
        }
        if (!log.matches(".*(\\p{L}(?=.*\\d)|\\d(?=.*\\p{L})).*")) {
            throw new WrongLoginException("Некорректный ввод логина! (отсутствует латинская буква или цифра)");
        }
        if (password.length() > 19) {
            throw new WrongPasswordException("Некорректный ввод пароля! (пароль должен быть меньше 20 символов)");
        }
        if (!password.contains("_")) {
            throw new WrongPasswordException("Некорректный ввод пароля! (отсутствует нижнее подчеркивание)");
        }
        if (!log.matches(".*(\\p{L}(?=.*\\d)|\\d(?=.*\\p{L})).*")) {
            throw new WrongPasswordException("Некорректный ввод пароля! (отсутствует латинская буква или цифра)");
        }
        if (!password.equals(password1)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }
}
