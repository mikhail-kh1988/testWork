package com.senlainc.task6;

/*
* @Author Khvashchevskiy Mikhail
*
* Имеется набор вещей , которые необходимо поместить в рюкзак .
* Рюкзак обладает заданной грузоподъемностью. Вещи в свою
* очередь обладают двумя параметрами — весом и стоимостью. Цель
* задачи заполнить рюкзак не превысив его грузоподъемность и
* максимизировать суммарную ценность груза.
*
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BagAndItems {

    private static Scanner      scanner     = new Scanner(System.in);
    private static List<Item>   itemList    = new ArrayList<>();

    public static void main(String[] args){
        itemList.add(new Item(10,   5));
        itemList.add(new Item(9,    4));
        itemList.add(new Item(7,    5));
        itemList.add(new Item(6,    3));
        itemList.add(new Item(3,    1));
        itemList.add(new Item(2,    1));
        itemList.add(new Item(15,   7));
        itemList.add(new Item(20,   10));

        System.out.println("Введите грузоподъемность рюкзака");
        Bag bag = new Bag(scanner.nextInt());
        bag.putItems(itemList);

        System.out.println("Максимальная Цена:"+bag.getMaxPrice());
        System.out.println("Максимальный Вес:"+bag.getWeight());
        System.out.println("Количество вещей в рюкзаке:"+bag.getTotalItem());

    }
}
