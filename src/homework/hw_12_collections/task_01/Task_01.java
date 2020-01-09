package homework.hw_12_collections.task_01;
/*
Вход на вечеринку только по списку.
Есть список имен (коллекция). Пользователь вводит с консоли свое имя, а программа проверяет его наличие в списке,
после чего говорит может он пройти или нет
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_01 {
    private static final String TRUTH = "Welcome, ";
    private static final String FALSE = "You are not in the guest list, ";

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(20);
        list.add("Tom");
        list.add("Micky");
        list.add("Thomas");
        list.add("Abigail");
        list.add("Fred");
        list.add("Emily");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Say your name");
        String name = scanner.next();

        String message = entranceOrNot(list, name);
        System.out.println(message);
        scanner.close();
    }

    public static String entranceOrNot(List<String> names, String name) {
        if (names.contains(name)) {
            return (TRUTH + name);
        } else {
            return (FALSE + name);
        }
    }
}
