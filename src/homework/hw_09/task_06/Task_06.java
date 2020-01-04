package homework.hw_09.task_06;

/*
Есть строка “While major gameplay components are already in place and functioning,
 players help is needed to add some of the smaller features and content. Of course
 polishing the overall experience is important at the same time. Game has been
 extensively tested in closed group, but it is always important to hear fresh
 suggestions from larger crowd that come from various gaming backgrounds. Plan is
  to make the game as good as possible but without compromising the core idea.”

  Нужно узнать содержит ли текст слова “alert”, “add”,  и какое кол-во.
 */

public class Task_06 {
    private static final String ALERT = "alert";
    private static final String ADD = "add";
    private static final String TEXT = "While major gameplay components are already in place and functioning,\n" +
            " players help is needed to add some of the smaller features and content. Of course\n" +
            " polishing the overall experience is important at the same time. Game has been\n" +
            " extensively tested in closed group, but it is always important to hear fresh\n" +
            " suggestions from larger crowd that come from various gaming backgrounds. Plan is\n" +
            "  to make the game as good as possible but without compromising the core idea.";

    public static void main(String[] args) {

        System.out.println(containsOrNot(TEXT, ALERT));
        System.out.println(numberOfReiteration(TEXT, ALERT));

        System.out.println(containsOrNot(TEXT, ADD));
        System.out.println(numberOfReiteration(TEXT, ADD));

        System.out.println(containsOrNot(TEXT, "the"));
        System.out.println(numberOfReiteration(TEXT, "the"));
    }

    public static String containsOrNot(String text, String word) {
        String answer = new String();
        if (text.contains(word)) {
            answer = ("Text has word \"" + word + "\"");
        } else {
            answer = ("Text doesn't has word \"" + word + "\"");
        }
        return answer;
    }

    public static String numberOfReiteration(String text, String word) {
        int number = 0;
        int indexOfWord = 0;
        int firstIndex;
        for (; text.indexOf(word, indexOfWord) != -1; ) {
            firstIndex = text.indexOf(word, indexOfWord);
            indexOfWord = firstIndex + 1;
            number++;
        }
        String answer = "Word \"" + word + "\" occurs " + number + " times";
        return answer;
    }
}
