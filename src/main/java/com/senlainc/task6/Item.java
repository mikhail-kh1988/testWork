package com.senlainc.task6;

import java.util.Objects;

public class Item {
    private int Weight;
    private int Cost;

    public Item(int weight, int cost) {
        Weight = weight;
        Cost = cost;
    }

    public Item(){}

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        Cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Double.compare(item.getWeight(), getWeight()) == 0 && getCost() == item.getCost();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight(), getCost());
    }
}
