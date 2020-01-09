package homework.hw_12_generic.task_04;

import com.sun.imageio.plugins.wbmp.WBMPImageReader;

public class Garage {
    private int elementIndex = 0;
    private Car[] garage;

    public Garage(int garageSize) {  //Гараж одного изначально заданного размера
        this.elementIndex = 0;
        this.garage = new Car[garageSize];
    }

    public <T extends Car> void addCar(T car) {
        if (elementIndex == garage.length && !(car.getModel().equals(MODEL.BMW) || car.getModel().equals(MODEL.LADA))) {
            System.out.println("Your garage is full and we cannot place this car in this garage.");
        } else if (elementIndex == garage.length) {
            System.out.println("Your garage is full.");
        } else if (car.getModel().equals(MODEL.BMW) || car.getModel().equals(MODEL.LADA)) {
            garage[elementIndex] = car;
            elementIndex++;
            System.out.println("We have added this car in this garage.");
        } else {
            System.out.println("You cannot place this car in this garage.");
        }
    }
}

