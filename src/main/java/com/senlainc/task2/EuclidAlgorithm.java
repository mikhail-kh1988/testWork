package com.senlainc.task2;

import java.util.Scanner;
/*
*   @Author Khvashchevskiy Mikhail
*
*   Создать программу, которая будет вычислять и выводить на экран НОК (наименьшее общее кратное) и
*   НОД (наибольший общий делитель) двух целых чисел, введенных пользователем. Если пользователь некорректно
*   введёт хотя бы одно из чисел, то сообщать об ошибке.
*
 */
public class EuclidAlgorithm {

    private static Scanner  scanner = new Scanner(System.in);
    private static String   string;

    public static void main(String[] args){
        int num1, num2;
        System.out.println("Введите два числа для проверки НОК и НОД.");
        System.out.println("Введите первое число: ");
        num1 = checkNumber(scanner.nextLine());
        System.out.println("Введите второе число: ");
        num2 = checkNumber(scanner.nextLine());
        System.out.print("Результат: ");
        System.out.println("наибольший общий делитель(НОД) чисел "+num1+" и "+num2+" равен "+gcd(num1, num2));
        System.out.println("Наименьшее общее кратное(НОК) равно "+lcm(num1, num2));

    }

    private static int gcd(int a, int b){
        return b == 0 ? a : gcd(b,a % b);
    }

    private static int lcm(int a,int b){
        return a / gcd(a,b) * b;
    }

    private static int checkNumber(String number){
        if(!number.matches("[-+]?\\d+")){
            System.out.println("Число введено не корректно, повторите ввод!");
            string = scanner.nextLine();
            return Integer.parseInt(string);
        }
        return Integer.parseInt(number);
    }
}
