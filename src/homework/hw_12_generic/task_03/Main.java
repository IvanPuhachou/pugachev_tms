package homework.hw_12_generic.task_03;

/*
Создайте обобщенный интерфейс, создайте в нем обобщенный метод (например, showClassName).
Создайте класс, который имплементирует этот интерфейс.
 */

public class Main {
    public static void main(String[] args) {
        ClassName<Integer> firstObject = new ClassName<>(15);
        ClassName<String> secondObject = new ClassName<>("value");

        firstObject.showClassName();
        secondObject.showClassName();


    }
}
