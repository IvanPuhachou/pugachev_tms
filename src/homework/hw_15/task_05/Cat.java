package homework.hw_15.task_05;

import java.io.Serializable;

public class Cat implements Serializable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "This cats name is " + name ;
    }
}
