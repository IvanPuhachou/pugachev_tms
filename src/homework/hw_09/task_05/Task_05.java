package homework.hw_09.task_05;

/*
Есть строка “Green. red. blue. yellow”. Необходимо заменить все точки на запятые
 */

public class Task_05 {
    public static void main(String[] args) {
        String newString = "Green. red. blue. yellow";
        newString = newString.replace('.', ',');
        System.out.println(newString);
    }
}
