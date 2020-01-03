package homework.hw_05;

public class Civil extends Air {
    private int numberPassengers;
    private boolean businessClass;

    public Civil(String model, int power, int maxSpeed, int weight, double wingspan, int stripLength, int numberPassangers, boolean businessClass) {
        super(model, power, maxSpeed, weight, wingspan, stripLength);
        this.numberPassengers = numberPassangers;
        this.businessClass = businessClass;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public String civilCheck(int b) {
        if (b < getNumberPassengers()) {
            return "Пассажиры посажены по местам, есть еще " + (getNumberPassengers() - b) + " свободных мест";
        } else if (b == getNumberPassengers()) {
            return "Самолет полностью укомплектован пассажирами";
        } else if (b > getNumberPassengers()) {
            return "Не хватает мест  " + (b - getNumberPassengers()) + " пассажиров";
        } else
            return "Непредвиденная ошибка";
    }

    @Override
    public String toString() {
        return super.toString() +
                ", numberPassengers=" + numberPassengers +
                ", businessClass=" + businessClass;
    }
}
