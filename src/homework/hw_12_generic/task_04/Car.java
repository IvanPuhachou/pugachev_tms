package homework.hw_12_generic.task_04;

public class Car {
    private MODEL model;
    private int volume;
    private boolean automaticTransmission;

    public Car(MODEL model, int volume, boolean automaticTransmission) {
        this.model = model;
        this.volume = volume;
        this.automaticTransmission = automaticTransmission;
    }

    public Car(int volume, boolean automaticTransmission) {
        this.volume = volume;
        this.automaticTransmission = automaticTransmission;
    }

    public MODEL getModel() {
        return model;
    }

    public void setModel(MODEL model) {
        this.model = model;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isAutomaticTransmission() {
        return automaticTransmission;
    }

    public void setAutomaticTransmission(boolean automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
    }

    @Override
    public String toString() {
        return "This car is  " + model + '\'' +
                ". Its engine capacity is " + volume +
                ".";
    }

}

enum MODEL {
    BMW,
    AUDI,
    LADA,
    MERCEDES
}
