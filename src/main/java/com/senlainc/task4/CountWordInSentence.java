package com.senlainc.task4;

/*
* @Author Khvashchevskiy Mikhail
*
* Создать программу, которая подсчитывает сколько раз
* употребляется слово в тексте (без учета регистра).
* Текст и слово вводится вручную.
 */


import java.util.Scanner;

public class CountWordInSentence {

    private static Scanner  scanner         = new Scanner(System.in);
    private static Sentence sentence;

    public static void main(String[] args){

        System.out.println("Введите предложение: ");
        String enterSentence = scanner.nextLine();
        System.out.print("Введите слово которое хотите искать в тексте:");
        scanner     = new Scanner(System.in);
        sentence    = new Sentence(enterSentence, scanner.nextLine());
        sentence.reportAboutWord();
    }

}
