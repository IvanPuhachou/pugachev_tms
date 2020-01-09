package homework.hw_12_generic.task_04;

public class Audi extends Car {
    public Audi(int volume, boolean automaticTransmission) {
        super(volume, automaticTransmission);
        this.setModel(MODEL.AUDI);
    }
}
