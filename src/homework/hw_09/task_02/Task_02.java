package homework.hw_09.task_02;

/*
Игра в слова. Есть строка “engineering”. Нужно выделить подстроку так, чтобы получилось два слова “engine” и “ring”.
 */

public class Task_02 {
    private static final String ENGINE = "engine";
    private static final String RING = "ring";

    public static void main(String[] args) {
        String text = new String("engineering");
        if (text.contains(ENGINE)) {
            int indexOfEngine = text.indexOf(ENGINE);
            String substringEngine = text.substring(indexOfEngine, indexOfEngine + ENGINE.length());
            System.out.println(substringEngine);
        } else {
            System.out.println("Text doesn't have the word \"" + ENGINE + "\"");
        }
        if (text.contains(RING)) {
            int indexOfRing = text.indexOf(RING);
            String substringRing = text.substring(indexOfRing, indexOfRing + RING.length());
            System.out.println(substringRing);
        } else {
            System.out.println("Text doesn't have the word \"" + RING + "\"");
        }
    }
}
