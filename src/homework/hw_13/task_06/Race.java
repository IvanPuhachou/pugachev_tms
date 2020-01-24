package homework.hw_13.task_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Race {
    private Integer numberOfRace;             // номер забега
    private double distance;                 // дистанция забега (хотя она нигде не используется крому объявление при создании забега)
    private List<Sportsman> runners;

    public Race(Integer numberOfRace, double distance) {
        this.numberOfRace = numberOfRace;
        this.distance = distance;
        this.runners = new ArrayList<>();
    }

    public Integer getNumberOfRace() {
        return numberOfRace;
    }

    public double getDistance() {
        return distance;
    }

    public List<Sportsman> getRunners() {
        return runners;
    }

    public void setRunners(List<Sportsman> runners) {
        this.runners = runners;
    }

    public void addRunner(Sportsman runner) {
        this.runners.add(runner);
    }

    public void resultOfRace() {
        if (this.runners.size() > 3) {
            Collections.sort(this.runners);
        } else System.out.println("The race didn't take place due to the small number of participants");
    }

    public void rewarding() {
        if (this.runners.size() > 3) {
            Collections.sort(this.runners);
            this.runners = this.runners.subList(0, 3);

            List<Sportsman> winners = this.runners;
            typeOfMedals[] medals = typeOfMedals.values();
            for (int i = 0; i < 3; i++) {
                winners.get(i).setMedals(this.numberOfRace, medals[i]);
            }
        }   else System.out.println("The race didn't take place due to the small number of participants");
    }


    public void soutRunners() {
        System.out.println(Arrays.toString(runners.toArray()));
    }
}


enum typeOfMedals {
    GOLD,
    SILVER,
    BRONZE
}
