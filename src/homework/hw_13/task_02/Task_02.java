package homework.hw_13.task_02;

/*
Написать функцию перевода числа в строку с добавлением денежной единицы. Например, 5 -> 5 USD.
 */

import java.util.function.Function;

public class Task_02 {
    public static void main(String[] args) {
        Function<Integer, String> intParseToString = (number) -> String.valueOf(number) + " USD";
        String intToDollars = intParseToString.apply(1000);
        System.out.println(intToDollars);
    }
}
