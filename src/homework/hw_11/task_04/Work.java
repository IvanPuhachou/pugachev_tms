package homework.hw_11.task_04;

import java.io.Serializable;

public class Work implements Serializable {

    private  String titlesWork;
    private  int minExperience;

    public String getTitlesWork() {
        return titlesWork;
    }

    public void setTitlesWork(String titlesWork) {
        this.titlesWork = titlesWork;
    }

    public int getMinExperience() {
        return minExperience;
    }

    public void setMinExperience(int minExperience) {
        this.minExperience = minExperience;
    }

    @Override
    public String toString() {
        return "My work is " + titlesWork +
                " and my experience is " + minExperience + " years";
    }

    public Work(String titlesWork, int minExperience) {
        this.titlesWork = titlesWork;
        this.minExperience = minExperience;


    }
}
