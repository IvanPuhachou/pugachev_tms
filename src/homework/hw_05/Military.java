package homework.hw_05;

public class Military extends Air {
    private int numberOfMissiles;
    private boolean catapultedSystem;

    public Military(String model, int power, int maxSpeed, int weight, double wingspan, int stripLength, int numberOfMissiles, boolean catapultedSystem) {
        super(model, power, maxSpeed, weight, wingspan, stripLength);
        this.numberOfMissiles = numberOfMissiles;
        this.catapultedSystem = catapultedSystem;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public void setNumberOfMissiles(int numberOfMissiles) {
        this.numberOfMissiles = numberOfMissiles;
    }

    public boolean isCatapultedSystem() {
        return catapultedSystem;
    }

    public void setCatapultedSystem(boolean catapultedSystem) {
        this.catapultedSystem = catapultedSystem;
    }

    public void rocket() {
        if (getNumberOfMissiles() > 0) {
            System.out.println("Ракета пошла ... Осталось " + (getNumberOfMissiles() - 1) + " ракет");
            setNumberOfMissiles(getNumberOfMissiles() - 1);
        }
        if (getNumberOfMissiles() == 0) {
            System.out.println("Ракет больше не осталось");
        }
    }

    public String catapult() {
        if (isCatapultedSystem()) {
            return "Катапультирование прошло успешно";
        } else return "У вас не такой системы";
    }

    @Override
    public String toString() {
        return super.toString() + ", numberOfMissiles=" + numberOfMissiles +
                ", catapultedSystem=" + catapultedSystem;
    }
}