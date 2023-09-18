package org.example.model;

import org.example.enums.ItemType;

import java.util.Date;

public class Letter extends PostedItem {

    public Letter(String address, Date postedDate) {
        super(address, postedDate, ItemType.LETTER);
    }

    @Override
    public double calculatePriceByType() {
        return 1.99;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "address='" + this.getAddress() + '\'' +
                ", postedDate=" + this.getPostedDate() +
                '}';
    }
}