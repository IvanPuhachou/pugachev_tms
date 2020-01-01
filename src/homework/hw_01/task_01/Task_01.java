package homework.hw_01.task_01;
/*В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
Например, "это однозначное положительное число". Достаточно будет определить,
является ли число однозначным, "двухзначным или трехзначным и более.*/

public class Task_01 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 1000000 - Math.random() * 1000000);
        String positiveOrNot;
        
        if (number >= 0) {
            positiveOrNot = "положительное";
        } else positiveOrNot = "отрицательное";
        String category;
        int absoluteNumber = Math.abs(number);

        if (absoluteNumber / 100000 > 0) {
            category = "пальцев одной руки не хватит настолько много";
        } else if (absoluteNumber / 10000 > 0) {
            category = "пяти";
        } else if (absoluteNumber / 1000 > 0) {
            category = "четырех";
        } else if (absoluteNumber / 100 > 0) {
            category = "трех";
        } else if (absoluteNumber / 10 > 0) {
            category = "двух";
        } else category = "одно";

        /*
    Приведенный пример определения разрядности числа является детским, но соответствует решению условий заадачи.  Но сейчас я думаю, что разрядность числа
    необходимо определеять при помощи бесконечного цикла, который будет в каждом своем цикле делить подменное значение number на 10 и увеличивать на единицу
    счетчик, однако это изменит и финальную строку.

    int value = absoluteNumber;
        int counter = 0;
        while (true) {
            if (value == 0) {
                break;
            }
            value /= 10;
            counter++;
        }

        System.out.println( "Разрядность числа " + number + " равна " + counter);
        */

        System.out.println(number + " это " + category + "значное " + positiveOrNot + " число.");
    }
}
