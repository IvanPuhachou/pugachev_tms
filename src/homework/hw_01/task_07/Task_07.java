package homework.hw_01.task_07;
/*
 В переменную записываете количество программистов. В зависимости от количества программистов
 необходимо вывести правильно окончание. Например:  2 программиста, 1 программист, 10 программистов и т.д.
*/

public class Task_07 {
    public static void main(String[] args) {
        int numberOfProgrammers = (int) (Math.random() * 100);
        String ending;
        if (numberOfProgrammers % 10 == 1 && numberOfProgrammers % 100 != 11) {
            ending = "";
        } else if (numberOfProgrammers % 10 == 2 && numberOfProgrammers % 100 != 12 ||
                numberOfProgrammers % 10 == 3 && numberOfProgrammers % 100 != 13 ||
                numberOfProgrammers % 10 == 4 && numberOfProgrammers % 100 != 14) {
            ending = "a";
        } else ending = "oв";
        System.out.println("У нас есть " + numberOfProgrammers + " программист" + ending);
    }
}
