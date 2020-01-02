package homework.hw_03.task_02;

/*
Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив
выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
 */

public class Task_02 {
    public static void main(String[] args) {
        int numberOdd = 0;
        int firstNumber = 1;
        if (firstNumber % 2 == 0) {
            firstNumber++;
        }
        int lastNumber = 99; // для создания любого массива в условии задачи НО! lastNumber обязан быть больше firstNumber

        for (int i = firstNumber; i <= lastNumber; i += 2) {
            numberOdd++;
        }
        int[] array = new int[numberOdd];
        for (int i = 0; i < array.length; i++) {
            array[i] = firstNumber + i * 2;
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
