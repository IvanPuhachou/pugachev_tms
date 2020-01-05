package homework.hw_09.task_08;

public class Car {
    private String model;
    private String volume;
    private String color;

    public Car(String model, String volume, String color) {
        this.model = model;
        this.volume = volume;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", volume='" + volume + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
