package homework.hw_01.task_04;

//Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.

public class Task_04_2 {
    public static void main(String[] args) {
        int number1 = -1;
        int number2 = 1;
        int number3 = 1;
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
                System.out.println("Здесь все числа отрицательные");
                break;
            case 1:
                System.out.println("Здесь одно положительное число");
                break;
            case 2:
                System.out.println("Здесь два положительных числа");
                break;
            case 3:
                System.out.println("Здесь все числа положительные");
                break;
        }
    }
}
