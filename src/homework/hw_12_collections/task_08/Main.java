package homework.hw_12_collections.task_08;

/*
Есть HashSet магазинов. У магазина есть название и ID. Создать несколько магазинов (через оператор new Shop(..))
с одинаковым ID и названием и добавить их в ваш Set. Попробуйте разобраться почему они все добавились,
несмотря на то, что Set обеспечивает уникальность
 */

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Shop> shops = new HashSet<>();
        shops.add(new Shop(1, "Green"));
        shops.add(new Shop(1, "Green"));
        shops.add(new Shop(2, "Korona"));
        shops.add(new Shop(2, "Korona"));
        System.out.println(shops);

// добавление в HashSet идет на основании hashCode, а в случае коллизии дополнительной проверкой на equals и только
// в случае полного совпадения (а значит полной идентичности) объект не добавляется в HashSet


// в данном случае не переопределены методы hashCode() и equals(Object o), а значит, каждый новый объект уникален
    }
}
