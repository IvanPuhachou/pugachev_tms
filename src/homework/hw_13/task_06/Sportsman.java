package homework.hw_13.task_06;

import java.util.HashMap;
import java.util.Map;

public class Sportsman implements Comparable<Sportsman> {
    private String name;
    private int speed;
    private HashMap<Integer, typeOfMedals> medals;

    public Sportsman(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.medals = new HashMap<Integer, typeOfMedals>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public HashMap<Integer, typeOfMedals> getMedals() {
        return medals;
    }

    public void setMedals(HashMap<Integer, typeOfMedals> medals) {
        this.medals = medals;
    }

    public void setMedals(Integer numberOfRace, typeOfMedals medal) {
        this.medals.put(numberOfRace, medal);
    }

    public void showYourMedals() {
        if (this.getMedals().isEmpty()) {
            System.out.println("My name is " + this.name + " and I don't have medals");
        } else {
            for (Map.Entry<Integer, typeOfMedals> entry : this.getMedals().entrySet()) {
                System.out.println("The number of race is " + entry.getKey() + ". My medal is " + entry.getValue());
            }
        }
    }

    @Override
    public String toString() {
        return
                "My name is " + name + ". " +
                        "My speed is " + speed ;
    }

    @Override
    public int compareTo(Sportsman o) {

        if (this.speed == o.speed) {                      // сортируем спортсменов по скорости
            int len1name = this.name.length();            // в случае одинаковой скорости сравниваем имена - такие жестокие бега
            int len2name = o.name.length();
            int limName = Math.min(len1name, len2name);
            char v1name[] = this.name.toCharArray();
            char v2name[] = o.name.toCharArray();

            int g = 0;
            while (g < limName) {
                char c1 = v1name[g];
                char c2 = v2name[g];
                if (c1 != c2) {
                    return c1 - c2;
                }
                g++;
            }
        }
        return o.speed - this.speed;
    }
}
