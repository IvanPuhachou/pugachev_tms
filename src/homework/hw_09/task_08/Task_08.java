package homework.hw_09.task_08;

/*
Есть склад авто и выяснилось, что всем присвоили неверные маркировки
двигателя. Необходимо все 1.4 литра двигатели заменить на 2.0Т, а все 1.8, на 1.8Т.
 */

public class Task_08 {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = generateCar();
            System.out.print(i + " ");
            System.out.println(cars[i]);
        }

        System.out.println("== after correction == ");

        for (int i = 0; i < cars.length; i++) {
            String volume = cars[i].getVolume();
            if (volume.equals("1.4")) {
                cars[i].setVolume("2.0T");
            } else if (volume.equals("1.8")) {
                cars[i].setVolume("1.8T");
            }
            System.out.print(i + " ");
            System.out.println(cars[i]);
        }
    }


    public static Car generateCar() {
        String model = new String();
        String volume = new String();
        String color = new String();
        switch ((int) (Math.random() * 4)) {
            case (0):
                color = "black";
                break;
            case (1):
                color = "white";
                break;
            case (2):
                color = "blue";
                break;
            case (3):
                color = "green";
                break;
            default:
                color = "pink";
                break;
        }
        switch ((int) (Math.random() * 4)) {
            case (0):
                model = "Audi";
                break;
            case (1):
                model = "BMW";
                break;
            case (2):
                model = "Porsche";
                break;
            case (3):
                model = "Volkswagen";
                break;
            default:
                model = "Lada";
                break;
        }
        switch ((int) (Math.random() * 3)) {
            case (0):
                volume = "1.4";
                break;
            case (1):
                volume = "1.6";
                break;
            case (2):
                volume = "1.8";
                break;
            default:
                volume = "5.0";
                break;
        }
        Car random = new Car(model, volume, color);
        return random;
    }
}
