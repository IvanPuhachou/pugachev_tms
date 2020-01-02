package homework.hw_02.task_07;

// Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99

public class Task_07 {
    public static void main (String [] args) {
        int sum = 0;
        int lastNumber = 100;
        for (int i=1; i<lastNumber; i+=2) {
            sum += i;
        } System.out.print("Сумма всех нечетных чисел до " + lastNumber + " равна "+sum);
    }
}
