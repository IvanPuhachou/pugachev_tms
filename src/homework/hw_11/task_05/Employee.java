package homework.hw_11.task_05;

import java.io.Serializable;

public class Employee implements Serializable {
    public String name;
    public   int age;
    public Work work;

    public Employee(String name, int age, Work work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    @Override
    public String toString() {
        return "My name is " + name +
                ". I'm " + age +
                " years old. " + work;
    }

}
