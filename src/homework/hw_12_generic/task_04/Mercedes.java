package homework.hw_12_generic.task_04;

public class Mercedes extends Car {
    public Mercedes(int volume, boolean automaticTransmission) {
        super(volume, automaticTransmission);
        this.setModel(MODEL.MERCEDES);
    }
}
