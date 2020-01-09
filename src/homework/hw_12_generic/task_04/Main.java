package homework.hw_12_generic.task_04;

//  Есть гараж, в котором мы хотим хранить авто только определенной марки, т.е. там могут храниться только BWM или только Lada
public class Main {

    public static void main(String[] args) {
        BMW bmw_1 = new BMW(5000, true);
        BMW bmw_2 = new BMW(2000, false);
        Lada lada_1 = new Lada(1600, false);
        Lada lada_2 = new Lada(2000, false);
        Audi audi_1 = new Audi(2200, true);
        Mercedes mercedes_1 = new Mercedes(3000, true);

        Garage garage = new Garage(3);
        garage.addCar(bmw_1);
        garage.addCar(lada_1);
        garage.addCar(audi_1);
        garage.addCar(bmw_2);
        garage.addCar(lada_2);
        garage.addCar(mercedes_1);


    }
}
