package com.senlainc.task5;
/*
* @Author Khvashchevskiy Mikhail
*
* Создать программу, которая в последовательности от 0 до N,
* находит все числа-палиндромы (зеркальное значение равно
* оригинальному). Длина последовательности N вводится вручную и
* не должна превышать 100.
*
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){
        ArrayList<Integer>  palindromes = new ArrayList<>();
        Scanner             scanner     = new Scanner(System.in);

        System.out.println("Введите длинну последовательности, но не более 100");
        String string = scanner.nextLine();

        while (Integer.parseInt(string)>100){
            System.out.println("Вы ввели число более 100, повторите ввод!");
            string = scanner.nextLine();
        }
        for (int i = 0; i <= Integer.parseInt(string); i++) {
            String tmpStr = Integer.toString(i);
            if (tmpStr.length() == 2 || tmpStr.length() >= 3) {
                if (tmpStr.charAt(0) == tmpStr.charAt(1))
                    palindromes.add(Integer.parseInt(tmpStr));
                }
        }
        System.out.println("Следующие числа палиндромы, числовой последовательности "+string+" :");
        for (int j :palindromes) {
            System.out.print(j+" ");
        }

    }
}
