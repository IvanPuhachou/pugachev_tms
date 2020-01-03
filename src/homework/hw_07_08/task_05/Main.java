package homework.hw_07_08.task_05;

/*
Есть класс мышь (компьютерная), у которой есть поле кнопка. Есть у мышки метод, который нажимает эту
кнопку (можно просто вывести на экран что кнопка нажата).

Есть интерфейс Button, у которого есть реализации WindowsButton, LinuxButton и MacButton.
В методе мейн вам нужно будет создать несколько мышей и нажать у каждой кнопку
 */

public class Main {
    public static void main(String[] args) {

        Mouse mouse_1 = new Mouse(new LinuxButton());
        Mouse mouse_2 = new Mouse(new WindowsButton());
        Mouse mouse_3 = new Mouse(new MacButton());

        mouse_1.click();
        mouse_2.click();
        mouse_3.click();
    }
}
