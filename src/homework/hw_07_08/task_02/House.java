package homework.hw_07_08.task_02;

public class House {
    private int numbersOfFloors;
    private int numbersOfSectionOfTheBuilding;
    private Material material;
    public House(int numbersOfFloors, int numbersOfSectionOfTheBuilding, Material material) {
        this.numbersOfFloors = numbersOfFloors;
        this.numbersOfSectionOfTheBuilding = numbersOfSectionOfTheBuilding;
        this.material = material;
    }

    public int getNumbersOfFloors() {
        return numbersOfFloors;
    }

    public int getNumbersOfSectionOfTheBuilding() {
        return numbersOfSectionOfTheBuilding;
    }

    public Material getMaterial() {
        return material;
    }

    public final String priceOfHouse() {  // так же просто указать, что метод является final
        int i;
        switch (getMaterial()) {
            case WOOD:
                i = 2;
                break;
            case BRICK:
                i = 5;
                break;
            case FERROCONCRETE:
                i = 4;
                break;
            default:
                i = 1;
                break;
        }
        return "This house costs " + getNumbersOfFloors() * getNumbersOfSectionOfTheBuilding() * i + " thousand dollars ";
    }
}

enum Material {
    WOOD,
    BRICK,
    FERROCONCRETE
}