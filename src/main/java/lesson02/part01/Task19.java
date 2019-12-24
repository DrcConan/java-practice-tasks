package lesson02.part01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры имя и вывести надпись:
 * name зарабатывает $5,000. Ха-ха-ха!
 * Пример: Тимур зарабатывает $5,000. Ха-ха-ха!
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна выводить текст.
 * 2.	Программа должна считывать данные с клавиатуры.
 * 3.	Выведенный текст должен содержать введенное имя.
 * 4.	Выведенный текст должен полностью соответствовать заданию.
 */

public class Task19 {
    public static void main(String[] args) throws Exception {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите имя: \n");
        String name = consoleReader.readLine();
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");

    }
}
