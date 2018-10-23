package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторная работа №5. Вариант №4.\n" +
                "Найти во введенном тексте самое длинное и самое короткое слово.");
        String string=new String();
        System.out.println("Введите строку:");

        string=scanner.next();
        taskOne(string);

        taskTwo(string);


    }



    private static void taskOne(String string) {
        System.out.println("Вариант реализации №1");
        int maxLengthOfTheWord=0;
        int tempLengthOfTheWord=0;
        String words[]=string.split("\\s|\\.|\\,|\\:|\\;|\\-|\\!");
        System.out.println("Введенный текст разбит на слова.");
        for (int i = 0; i <words.length ; i++) {
            System.out.println("Слово №"+(i+1)+": "+words[i]);
            tempLengthOfTheWord=words[i].length();
            if (maxLengthOfTheWord<tempLengthOfTheWord)
                maxLengthOfTheWord=tempLengthOfTheWord;
        }
        System.out.println("Самое длинно слово в тексте состоит из "+maxLengthOfTheWord+" симолов.");
    }

    private static void taskTwo(String string) {
        System.out.println("Вариант реализации №2");
        int maxLengthOfTheWord=0;
        int tempLengthOfTheWord=0;


        StringTokenizer str = new StringTokenizer(string, " \t\n\r,.");// При попытке вписать сюда символ "-" возникет исключение.
        // При попытке поставить символ " " в середину или в конец строки, которую приниает конструктор-возникает исключение.
        //При встрече методом разделителя " " возникает исключение
        //Буду рад, если разьясните , почему.
        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
            tempLengthOfTheWord=str.nextToken().length();

            if (maxLengthOfTheWord<tempLengthOfTheWord)
                maxLengthOfTheWord=tempLengthOfTheWord;

        }
        System.out.println("Самое длинно слово в тексте состоит из "+maxLengthOfTheWord+" симолов.");
    }


}
