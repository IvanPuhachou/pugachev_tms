package homework.hw_02.task_05;

/*
Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры для значений
длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
*/

public class Task_05 {
    public static void main(String[] args) {
        double sumInches;
        double equivalent = 2.54;

        for (double i = 1; i <= 20; i++) {
            sumInches = i * equivalent;
            int Number = (int) i; // не хотелось видеть в ответе число дюймов с ".0" в конце раз они все кратные 1
            System.out.println("Число дюймов равное " + Number + " в переводе на сантиметры равно " + sumInches + "см");
        }
    }
}
