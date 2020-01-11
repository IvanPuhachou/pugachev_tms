package homework.hw_13.task_03;

/*
Используя интерфейс BinaryOperator написать лямбда-выражение, которое бы умножало одно целое число на другое
*/

import java.util.function.BinaryOperator;

public class Task_03 {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiplication = (firstNumber, secondNumber) -> firstNumber * secondNumber;
        int multiplicationOfSevens = multiplication.apply(7, 7);
        System.out.println(multiplicationOfSevens);
    }
}
