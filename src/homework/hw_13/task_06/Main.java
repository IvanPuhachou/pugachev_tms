package homework.hw_13.task_06;
/*
Есть класс Sportsman, у которого есть поля имя и скорость, с которой он бежит, а также коллекция медалей,
которых он получил на эстафете (можно в качестве ключа использовать номер забега).
Создать спортсменов, которые будут участвовать в забеге.  Дистанция - 600м. Отфильтровать тех, кто пробежал медленнее всех,
а первым трем вручить медали - золото, серебро и бронзу (enum).
 */

import java.util.Map;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Race race = new Race(1, 0.6);   // создание забега

        Sportsman tom = new Sportsman("Tom", 34);  // создание бегунов
        Sportsman mark = new Sportsman("Mark", 5);
        Sportsman tim = new Sportsman("Tim", 27);
        Sportsman owen = new Sportsman("Owen", 15);
        Sportsman jack = new Sportsman("Jack", 10);
        Sportsman artur = new Sportsman("Artur", 15);

        race.addRunner(tom);           // добавление бегунов в забег
        race.addRunner(tim);
        race.addRunner(mark);
        race.addRunner(jack);
        race.addRunner(artur);
        race.addRunner(owen);

        race.soutRunners();           // распечатка бегунов в забеге

        race.resultOfRace();          // сортировка бегунов согласно методу, опрделенному в классе Sportsmen (Спортсмен с большей скоростью стоит раньне,
                                      //  при одинаковой скорости сравниваются имена)

        race.soutRunners();

        tom.showYourMedals();         // проверка медалей у спортсмена

        race.rewarding();             // награждение спортсменов

        tom.showYourMedals();         // провекра медалей после награждения


        Consumer<Sportsman> showMedals = (sportsmen) -> {
            if (sportsmen.getMedals().isEmpty()) {
                System.out.println("My name is " + sportsmen.getName() + " and I don't have medals");
            } else {
                for (Map.Entry<Integer, typeOfMedals> entry : sportsmen.getMedals().entrySet()) {
                    System.out.println("The number of race is " + entry.getKey() + ". My medal is " + entry.getValue());
                }
            }
        };

        showMedals.accept(tim);      // поскольку тема занятия все-таки функциональные интерфейсы и лямбда-выражениея, то проверка медалей с помощью их


    }
}
