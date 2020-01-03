package homework.hw_05;

public class Cargo extends Ground {
    private double carrying;

    public Cargo(String model, int power, int maxSpeed, int weight, int numberWeehls, double consumption, double carrying) {
        super(model, power, maxSpeed, weight, numberWeehls, consumption);
        this.carrying = carrying;
    }

    public double getCarrying() {
        return carrying;
    }

    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }

    public String cargoCheck( double b) {
        if (b < getCarrying()) {
            return "Грузовик загружен, в нем еще есть место на " + (getCarrying() - b) + " тонны";
        } else if (b == getCarrying()) {
            return "Грузовик полностью загружен";
        } else if (b > getCarrying()) {
            return "Вам необоходим грузовик по-больше";
        } else
            return "Непредвиденная ошибка";
    }

    @Override
    public String toString() {
        return super.toString() +
                ", carrying=" + carrying;
    }
}
