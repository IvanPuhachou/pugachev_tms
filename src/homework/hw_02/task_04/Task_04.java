package homework.hw_02.task_04;

//Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.

public class Task_04 {
    public static void main(String[] args) {

        int a = 6;
        int b = 7;
        int productOfNumbers = 0;
        for (int i = 0; i < b; i++) {  // поскольку начал с 0, поэтому <B, можно был с 1 и тогда <=B
            productOfNumbers += a;
        }
        System.out.println("Произведение двух чисел " + a + " и " + b + " равно " + productOfNumbers);
    }
}
