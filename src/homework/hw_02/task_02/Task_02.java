package homework.hw_02.task_02;

/*
Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить, сколько амеб будет
 через 3, 6, 9, 12,..., 24 часа.
*/

public class Task_02 {
    public static void main(String[] args) {
        int cellNumber = 1;
        for (int i = 0; i <= 24; i += 3) {
            if (i == 0) {
                continue;    // попрактиковал операторы перехода, а так знаю, что лучше через do-while
            }
            cellNumber *= 2;
            System.out.println("По прошествии " + i + " часов число амеб стало равно " + cellNumber);
        }
    }
}

