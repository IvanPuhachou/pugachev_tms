package homework.hw_02.task_01;

/*
Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый день он увеличивал дневную
 норму на 10% нормы предыдущего дня. Какой суммарный путь пробежит спортсмен за 7 дней?
*/

public class Task_01 {
    public static void main(String[] args) {
        double distance = 10.0;
        double sumDistance = 0.0;
        int numberOfDays = 7;

        for (int i = 1; i <= numberOfDays; i++) {
            sumDistance += distance;
            distance = (distance * 11) / 10; // если просто написать *=1.1, то получится ерунда с нолииками и единичкой в конце
        }
        System.out.println("Спортсмен пробежал " + sumDistance + "км  за 7 дней");
    }
}
