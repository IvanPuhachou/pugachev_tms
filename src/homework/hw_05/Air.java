package homework.hw_05;

public class Air extends Transport {
    private double wingspan;
    private int stripLength;

    public Air(String model, int power, int maxSpeed, int weight, double wingspan, int stripLength) {
        super(model, power, maxSpeed, weight);
        this.wingspan = wingspan;
        this.stripLength = stripLength;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public int getStrepLength() {
        return stripLength;
    }

    public void setStrepLength(int strepLength) {
        this.stripLength = strepLength;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", wingspan=" + wingspan +
                ", stripLength=" + stripLength;
    }
}
