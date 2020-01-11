package homework.hw_13.task_01;

/*
Есть товар, который поступает на склад магазина(пускай это будет коллекция).
Вам необходимо указать дату и время, в которое товар поступил (напрмер при добавлении его в коллекцию, т.е. склад)
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Milk", 1));   // замысел в том, что при добавлении в лист (склад магазина) создается новый объект товара,
        products.add(new Product("Bread", 2));  // при создании которого конструктор указывает время создания, которое одновременно равно времени добавления на склад
        products.add(new Product("Apple", 3));

        System.out.println(products);
    }
}
