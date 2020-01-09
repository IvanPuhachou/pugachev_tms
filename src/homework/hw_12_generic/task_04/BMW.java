package homework.hw_12_generic.task_04;

public class BMW extends Car {
    public BMW(int volume, boolean automaticTransmission) {
        super(volume, automaticTransmission);
        this.setModel(MODEL.BMW);
    }
}
