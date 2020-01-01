package homework.hw_01.task_06;

// Даны 2 числа. Вывести большее из них.

public class Task_06 {
    public static void main(String[] args) {
        int numberA = 134;
        int numberB = 12354;

        if (numberA > numberB) {
            System.out.println(numberA + " большее из двух чисел (" + numberA + ", " + numberB + ")");
        }
        if (numberB > numberA) {
            System.out.println(numberB + " большее из двух чисел (" + numberA + ", " + numberB + ")");
        }
        if (numberB == numberA) {
            System.out.println("Числа равны между собой, а именно равны " + numberB);
        }
    }
}
