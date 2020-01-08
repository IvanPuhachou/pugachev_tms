package homework.hw_12_generic.task_01;

/*
Создать обобщенный (generic) класс, который в конструкторе принимает аргумент неизвестного типа. Создайте  в классе метод,
который бы выводил что это за тип на экран (получить имя класса для переменной getClass().getName())
 */

public class Task_01<T> {
    private T unknown;

    public Task_01(T t) {
        this.unknown = t;
    }

    public String getType() {
        String objectType = unknown.getClass().getName();
        return objectType;
    }

    public static void main(String[] args) {
        Task_01 integ = new Task_01(1);
        Task_01 strin = new Task_01("hello");
        Task_01 doubl = new Task_01(3.0);

        System.out.println(integ.getType());
        System.out.println(strin.getType());
        System.out.println(doubl.getType());

    }
}
