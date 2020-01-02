package homework.hw_02.task_03;

//Вычислить:  1+2+4+8+…+256 (256 = 2^8)

public class Task_03 {
    public static void main(String[] args) {
        int counter = 1;
        int sumNumber = 1;
        int exponent = 8;
        do {
            sumNumber *= 2;
            counter++;
        } while (counter <= exponent + 1);
        sumNumber--;

        System.out.println("Сумма чисел степеней двойки от 0 до " + exponent + " равна " + sumNumber);
        // сумма степеней двойки можно рассчитать как следующая степень -1, в нашем случае 2^9-1
    }
}
