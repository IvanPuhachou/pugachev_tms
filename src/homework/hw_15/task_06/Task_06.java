package homework.hw_15.task_06;

/*
Есть два отсортированных массива, необходимо самым оптимальным способом сделать из них один и тоже отсортированный
1- [1,4,5], 2 - [0,2,3]
 */

import java.util.Arrays;

public class Task_06 {

    public static void main(String[] args) {
        Integer[] integers_1 = {1, 4, 5};
        Integer[] integers_2 = {0, 2, 3};

        System.out.println(Arrays.toString(Task_06.mergedArrays(integers_1, integers_2)));
// задание представляет собой ту часть сортировки слиянием, где массивы объеденяются после рекурсивного разбиения
    }


/*    public static Integer[] mergedSort(Integer[] array){                              // часть разбиения массива на половины
        if (array.length==1){
            return array;
        }
        Integer[] firstHalf = new Integer[array.length / 2];
        Integer[] secondHalf = new Integer[array.length - array.length / 2];
        for (int i = 0; i < array.length / 2; i++) {
            firstHalf[i] = array[i];
        }
        for (int i = 0; i < secondHalf.length; i++) {
            secondHalf[i] = array[i +array.length / 2];
        }
        return mergedArrays(mergedSort(firstHalf), mergedSort(secondHalf));
    }*/

    public static Integer[] mergedArrays(Integer[] firstArray, Integer[] secondArray) {   // часть слияния отсортированных массивов
        Integer[] sumArray = new Integer[firstArray.length + secondArray.length];
        int firstCounter = 0;
        int secondCounter = 0;
        for (int i = 0; i < sumArray.length; i++) {
            if (firstCounter == firstArray.length) {
                sumArray[i] = secondArray[secondCounter];
                secondCounter++;
            } else if (secondCounter == secondArray.length) {
                sumArray[i] = firstArray[firstCounter];
                firstCounter++;
            } else if (firstArray[firstCounter] < secondArray[secondCounter]) {
                sumArray[i] = firstArray[firstCounter];
                firstCounter++;
            } else {
                sumArray[i] = secondArray[secondCounter];
                secondCounter++;
            }
        }
        return sumArray;
    }
}

