package homework.hw_01.task_04;

//Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.

public class Task_04 {
    public static void main(String[] args) {
        int number1 = -1;
        int number2 = 1;
        int number3 = 1;
        if (number1 > 0 && number2 > 0 && number3 > 0) {
            System.out.println("Все числа пложительные");
        } else if (number1 < 0 && number2 > 0 && number3 > 0 || number1 > 0 && number2 < 0 && number3 > 0 || number1 > 0 && number2 > 0 && number3 < 0) {
            System.out.println("Здесь два положительных числа");
        } else if (number1 < 0 && number2 < 0 && number3 > 0 || number1 > 0 && number2 < 0 && number3 < 0 || number1 < 0 && number2 > 0 && number3 < 0) {
            System.out.println("Здесь одно положительное число");
        } else if (number1 < 0 && number2 < 0 && number3 < 0) {
            System.out.println("Здесь нет положительных чисел");
        }
    }
}
