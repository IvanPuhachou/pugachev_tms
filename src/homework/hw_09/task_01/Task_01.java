package homework.hw_09.task_01;

/*
Есть массив с именами. Нужно сделать из него 1 общую строку, разделив имена пробелом
 */

public class Task_01 {
    public static void main(String[] args) {
        String[] names = {"Ivan", "Tom", "Alex", "Mark"};
        String allNames = new String();
        for (String i : names) {
            allNames = String.join(" ", allNames, i);
        }
        System.out.println(allNames);
    }
}
