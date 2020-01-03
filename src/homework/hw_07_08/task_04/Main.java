package homework.hw_07_08.task_04;

/*
Есть класс Bird. У него есть поля название и размер птицы.
Есть массив, в котором хранятся эти птицы.
Нужно вывести на экран сколько одинаковых птиц в массиве, по принципу:
Название птицы - количество одинаковых
 */

public class Main {
    public static void main(String[] args) {

        Bird[] birds = new Bird[15];
        for (int i = 0; i < birds.length; i++) {
            birds[i] = randomBird(randomName());

            System.out.println(birds[i].toString());
        }

        System.out.println(Bird.numbersOfSingleBirds(birds));
    }


    public static String randomName() {
        int i = (int) (Math.random() * 3 + 1);
        String name;
        switch (i) {
            case 1:
                name = "Nightingale";
                break;
            case 2:
                name = "Raven";
                break;
            case 3:
                name = "Hawk";
                break;
            default:
                name = "Goose";
                break;
        }
        return name;
    }

    public static Bird randomBird(String name) {
        int i = (int) (Math.random() * 3 + 2); // будут толстые птицы от 2-ух до 4-ти кило
        return new Bird(randomName(), i);
    }
}


