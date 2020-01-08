package homework.hw_12_generic.task_02;


public class TmsArrayUtils<T extends Number> {

    public static<T extends Number> double getSum(T[] arrays) {
       Double sum = 0.0;
        for (int i = 0; i < arrays.length; i++) {
           sum += arrays[i].doubleValue();
        }
       return sum;
    }

    public static <T extends Number>double getMean(T[] arrays){
        Double sum = 0.0;
        Double mean;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i].doubleValue();
        }
        mean = sum/arrays.length;
        return mean;
    }
}

