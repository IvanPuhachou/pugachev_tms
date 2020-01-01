package homework.hw_01.task_03;

/*Дано целое число. Если оно является положительным, то прибавить к нему 1.
 Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10.
 Вывести полученное число.*/

public class Task_03 {
    public static void main(String[] args) {
        int number = 3;

        if (number > 0) {
            number++;
        } else if (number == 0) {
            number = 10;
        } else if (number < 0) {
            number -= 2;
        }
        System.out.println(number);
    }
}
