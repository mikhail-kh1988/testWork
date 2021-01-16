package com.senlainc.task3;

/*
* @Author Khvashchevskiy Mikhail
*
* Создать программу, которая будет:
* - подсчитывать количество слов в предложении
* - выводить их в отсортированном виде
* - делать первую букву каждого слова заглавной.
* Предложение вводится вручную. (Разделитель пробел (“ ”)).
 */

import java.util.Scanner;

public class SearchInSentence {

    private static Sentence sentence    = new Sentence();
    private static Scanner  scanner     = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Введите предложение:");
        sentence.enterStringAsSentence(scanner.nextLine());
        System.out.println("Количество слов в предложении: "+sentence.getCountWordInSentence());
        System.out.println("Предложение в отсортированном виде:");
        for (Word word : sentence.getSortedCurrentSentence()) {
            System.out.println(word.getWord());
        }
    }

}
