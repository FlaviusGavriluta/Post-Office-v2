package org.example.model;

import org.example.enums.ItemType;

import java.util.Date;

public class Box extends PostedItem {
    private int weight;

    public Box(String address, Date postedDate, ItemType itemType, int weight) {
        super(address, postedDate, itemType);
        this.weight = weight;
    }

    @Override
    public double calculatePriceByType() {
        return itemType.equals(ItemType.SMALL_BOX)
                ? 7.99 : (10.29 + (0.29 * this.weight));
    }

    @Override
    public String toString() {
        return "Box{" +
                "address='" + this.getAddress() + '\'' +
                ", postedDate=" + this.getPostedDate() +
                ", weight=" + weight +
                ", itemType=" + itemType +
                '}';
    }
}