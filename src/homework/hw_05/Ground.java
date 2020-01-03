package homework.hw_05;

public class Ground extends Transport {

    private int numberWheels;
    private double consumption;

    public Ground (String model, int power, int maxSpeed, int weight, int numberWheels, double consumption){
        super (model, power, maxSpeed, weight);
        this.numberWheels = numberWheels;
        this.consumption = consumption;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return super.toString() + ", numberWheels=" + numberWheels +
                ", consumption=" + consumption;
    }
}
