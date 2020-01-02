package homework.hw_03.task_01;
/*
Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
Перед созданием массива подумайте, какого он будет размера.
 */
public class Task_01 {
    public static void main(String[] args) {
        int numberEven = 0;
        int firstNumber = 2;

        if (firstNumber % 2 == 1) {  // для цикла заполнения созданого массива, чтобы цикл начинался с четного элемента
            ++firstNumber;
        }
        int lastNumber = 20; // для создания любого массива в условии задачи НО! lastNumber обязан быть больше firstNumber

        for (int i = firstNumber; i <= lastNumber; i +=2) {
            if (i % 2 == 0) {
                numberEven++;
            }
        }
        int[] array = new int[numberEven];
        for (int i = 0; i < numberEven; i++) {
            array[i] = firstNumber + i * 2;
            System.out.print(array[i] + " ");  //соеденил процесс создания массива четных чисел с вывводом его в строку
        }
        System.out.println();
        for (int b = 0; b < array.length; b++) {
            System.out.println(array[b]);
        }
    }
}
