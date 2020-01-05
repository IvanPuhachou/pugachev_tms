package homework.hw_09.task_07;

/*
Написать benchmark тест, который бы измерял скорость работы String, StringBuilder и StringBuffer.
 */

public class Task_07 {
    private static int numberOfRepetitions = 10000;   // примитивный бенчмарк на десятитысячное добавление строки  "something "

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String example = "";
        for (int i = 0; i < numberOfRepetitions; i++) {
            example = example.concat("something ");
        }
        long finish = System.currentTimeMillis();
        long allTime = finish - start;
        System.out.println(allTime + " need time for String");


        long startForBuffer = System.currentTimeMillis();
        StringBuffer exampleForBuffer = new StringBuffer("");
        for (int i = 0; i < numberOfRepetitions; i++) {
            exampleForBuffer = exampleForBuffer.append("something ");
        }
        long finishForBuffer = System.currentTimeMillis();
        long allTimeForBuffer = finishForBuffer - startForBuffer;
        System.out.println(allTimeForBuffer + " need time for StringBuffer");


        long startForBuilder = System.currentTimeMillis();
        StringBuilder exampleForBuilder = new StringBuilder("");
        for (int i = 0; i < numberOfRepetitions; i++) {
            exampleForBuilder = exampleForBuilder.append("something ");
        }
        long finishForBuilder = System.currentTimeMillis();
        long allTimeForBuilder = finishForBuilder - startForBuilder;
        System.out.println(allTimeForBuilder + " need time for StringBuilder");
    }
}
