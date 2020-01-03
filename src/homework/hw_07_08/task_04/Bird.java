package homework.hw_07_08.task_04;

import java.util.Objects;

public class Bird {
    private String name;
    private int weight;

    public Bird(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {                // птицы с одинковым именем и весом считаются одинаковыми
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return weight == bird.weight &&
                Objects.equals(name, bird.name);
    }

    @Override
    public String toString() {
        return "Bird witch " +
                "name='" + name + '\'' +
                ", weight=" + weight;
    }

    public static String numbersOfSingleBirds(Bird[] allBirds) {
        Bird[] birds = new Bird[allBirds.length];          // создается два массива: в первом - перечисление птиц, во втором - подсчет их количества
        int[] numbersOfBirds = new int[allBirds.length];   // размер обоих создаваемых массивов равен исходному массиву на случай если все птицы исходного массива окажутся уникальными
        for (Bird i : allBirds) {
            setNewBird(i, birds, numbersOfBirds);          // заполняем первый массив уникальными птицами, а второй их количеством
        }
        return printBirds(birds, numbersOfBirds);          // выводим информацию из обоих массивов в строку
    }

    private static void setNewBird(Bird newBird, Bird[] birds, int[] numbersOfBirds) {
        int counter = 0;                            // счетчик индекса птицы в созданном массиве
        for (int i = 0; i < birds.length; i++) {    // заполнение созданного массива птицами из исходного массива
            if (birds[i] == null) {                 // натыкаемся на пустой элемент массива - сажаем туда птицу и берем следующую
                birds[i] = newBird;
                break;
            } else if (birds[i].equals(newBird)) {  // натыкаемся на птицу-повторку - берем следующую
                break;
            }
            counter++;
        }
        numbersOfBirds[counter]++;                  // всегда ведем учет числа птиц в массиве интов
    }

    private static String printBirds(Bird[] birds, int[] numbersOfBirds) {
        String allBirds = "We have ";
        for (int i = 0; i < birds.length; i++) {
            if (birds[i] == null) {
                break;
            }
            allBirds = allBirds + birds[i].toString() + " in " + numbersOfBirds[i] + " example \n";
        }
        return allBirds;
    }
}
