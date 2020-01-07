package homework.hw_11.task_05;

import java.io.Serializable;

public class Work implements Serializable {

    public   String titlesWork;
    public   int minExperience;

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
