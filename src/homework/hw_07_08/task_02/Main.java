package homework.hw_07_08.task_02;

/*
Создать класс House. У дома есть атрибуты кол-во этажей, подъездов и материал,
из которого дом изготовлен. Создать метод, который вы возвращал стоимость дома (можно просто
 все перемножить). Сделать так, чтобы наследники класса house не могли его переопределить.
 */

public class Main {
    public static void main(String[] args) {
        House Kalinowski_111 = new House(3, 1, Material.BRICK);
        System.out.println(Kalinowski_111.priceOfHouse());
    }
}
