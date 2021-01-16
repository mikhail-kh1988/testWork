package com.senlainc.task1;

/*
* @Author Khvashchevskiy Mikhail
*
* Создать программу, которая будет сообщать, является ли целое число,
* введенное пользователем, чётным или нечётным,
* простым или составным. Если пользователь введёт не целое число,
* то сообщать ему об ошибке.
*
 */

import java.util.Scanner;
import java.lang.Integer;

public class CompositeNumber {

    private static Number       number         = new Number(0);
    private static CheckNumber  checkNumber    = new CheckNumber();

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String string = " ";
        System.out.println("Введите целое число:");
        string = scanner.nextLine();
        while (!string.matches("[-+]?\\d+")){
            System.out.println("Вы ввели не целое число! Повтрите ввод:");
            string = scanner.nextLine();
        }
        number.setNumber(Integer.parseInt(string));
        number.setEvenNumber(checkNumber.numberIsEven(number.getNumber()));
        number.setCompositeNumber(checkNumber.numberIsComposite(number.getNumber()));
        System.out.println(number.toString());

    }


}
