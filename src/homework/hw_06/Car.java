package homework.hw_06;


public class Car {

    private boolean motorStarted;    // по факту это и есть мотор
    private int positionGears;       // а это по факту коробка передач
    private int numberOfGears;       //  модификация количества передач в КП
    private int transmissionSpeed;   // модификация соответствия скорости к передаче
    private String model;

    public Car(String model, int numberOfGears, int transmissionSpeed) {
        this.model = model;
        this.motorStarted = false;
        this.transmissionSpeed = transmissionSpeed;
        this.numberOfGears = numberOfGears;
        this.positionGears = 0;
    }

    public void startMotor() {
        if (motorStarted == false && positionGears == 0) {
            motorStarted = true;
            System.out.println("Завожу мотор");
        } else if (positionGears != 0) {
            System.out.println("Переведи передачу в нейтраль(Положение 0) перед тем как завести машину ");
        } else if (motorStarted) {
            System.out.println("Машина уже заведена");
        }
    }

    public void stopMotor() {
        if (motorStarted) {
            motorStarted = false;
            System.out.println("Заглушил мотор");
        } else if (!motorStarted) {
            System.out.println("Мотор уже заглушен");
        }
    }

    public void gearUp() {
        if (positionGears < numberOfGears) {
            positionGears++;
            System.out.println("Повышаю передачу. Сейчас КПП находится в положении " + positionGears);
        }
        if (positionGears == numberOfGears) {
            System.out.println("КПП на максимальной передаче в положении " + positionGears);
        }
    }

    public void gearDown() {
        if (positionGears > 0) {
            positionGears--;
            System.out.println("Понижаю передачу. Сейчас КПП находится в положении " + positionGears);
        }
        if (positionGears == 0) {
            System.out.println("КПП уже стоит на нейтрали в положении 0");
        }
    }

    public void showSpeed() {
        if (motorStarted) {
            System.out.print("Ваша скорость движения составляет " + positionGears * transmissionSpeed + " км/ч");
            if (positionGears == 0) {
                System.out.println(" потомучто Вы все еще стоите на нейтралке");
            } else System.out.println("");
        }
        if (motorStarted == false) {
            System.out.println("Машина не заведена и Вы стоитие на месте");
        }
    }
}
