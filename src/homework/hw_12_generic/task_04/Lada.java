package homework.hw_12_generic.task_04;

public class Lada extends Car {
    public Lada(int volume, boolean automaticTransmission) {
        super(volume, automaticTransmission);
        this.setModel(MODEL.LADA);
    }
}
