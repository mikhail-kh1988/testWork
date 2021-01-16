package com.senlainc.task6;

import java.util.*;

public class Bag {
    private int Weight;
    private int CurrentWeight;
    private int MaxPrice;
    private Map<Item, Integer> items;

    public Bag(int aWeight){
        this.Weight = aWeight;
        this.items = new HashMap<>();
        this.CurrentWeight = 0;
        this.MaxPrice = 0;
    }

    public int getWeight() {
        return Weight;
    }

    private void addItem(Item newItem, int weight){
        items.put(newItem, weight);
        this.CurrentWeight += weight;
        this.MaxPrice += newItem.getCost();
    }

    public void putItems(List<Item> Items){
        //Отсортируем вначале вещи по цене, перед тем как их помещать в рюкзак.
        Collections.sort(Items, Comparator.comparingInt(Item::getCost).reversed());

        for (Item i: Items) {
            if (i.getWeight() >= this.Weight && i.getWeight() >= this.CurrentWeight)
                break;
            else{
                this.addItem(i, i.getWeight());
            }
        }
    }

    public int getTotalItem(){
        return items.size();
    }

    public int getMaxPrice(){
        return MaxPrice;
    }
}
