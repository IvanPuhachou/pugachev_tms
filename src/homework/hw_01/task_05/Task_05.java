package homework.hw_01.task_05;

// Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.

public class Task_05 {
    public static void main(String[] args) {
        int number1 = -23451;
        int number2 = 3651;
        int number3 = -3451;
        int positiveNumber = 0;

        if (number1 > 0) {
            positiveNumber++;
        }
        if (number2 > 0) {
            positiveNumber++;
        }
        if (number3 > 0) {
            positiveNumber++;
        }
        switch (positiveNumber) {
            case 0:
                System.out.print("Здесь все числа отрицательные");
                break;
            case 1:
                System.out.print("Здесь одно положительное число");
                break;
            case 2:
                System.out.print("Здесь два положительных числа");
                break;
            case 3:
                System.out.print("Здесь все числа положительные");
                break;
        }
        int negativeNumber = 0;

        if (number1 < 0) {
            negativeNumber++;
        }
        if (number2 < 0) {
            negativeNumber++;
        }
        if (number3 < 0) {
            negativeNumber++;
        }

        switch (negativeNumber) {
            case 1:
                System.out.print(" и одно отрицательное число");
                break;
            case 2:
                System.out.print(" и два отрицательных числа");
                break;
            default:
        }
    }
}

