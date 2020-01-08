package homework.hw_12_generic.task_02;

/*
Создайте класс TmsArrayUtils, создайте в нем статический метод, который принимает аргументом массив чисел (Integer, Double  и т.д.)
и возвращал сумму всех чисел массива. По такому же принципу создайте метод для подсчета среднего значения
 */

public class Main {

    public static void main(String[] args) {
        Integer[] array_01 = {3, 4, 5,};
        Double[] array_02 = {3.2, 3.3, 4.5};

        System.out.println(TmsArrayUtils.getSum(array_01));
        System.out.println(TmsArrayUtils.getMean(array_01));

        System.out.println(TmsArrayUtils.getSum(array_02));
        System.out.println(TmsArrayUtils.getMean(array_02));
    }
}
