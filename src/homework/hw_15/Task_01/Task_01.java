package homework.hw_15.Task_01;

/*
Есть приветственное предложение:
"Hello, my name is Alex. I'm java developer and I'm glad to become a part of your company."
Необходимо сделать так, чтобы можно было подставить любое имя и язык программирования.
Напишите программу, которая бы позволяла вводить имя и язык программирования с консоли и затем выводила на экран
полученное предложение
 */

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {

        Task_01.greetingSentence();
    }

    public static void greetingSentence() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("Enter your programming language");
        String progrLanguage = input.next();
        input.close();
        System.out.println("Hello, my name is " + name + ". I'm " + progrLanguage + " developer and I'm glad to become a part of your company.");
    }
}
