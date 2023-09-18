package org.example.model;

import org.example.enums.ItemType;

import java.util.Date;

public abstract class PostedItem {
    private String address;
    private Date postedDate;
    protected ItemType itemType;

    public PostedItem(String address, Date postedDate, ItemType itemType) {
        this.address = address;
        this.postedDate = postedDate;
        this.itemType = itemType;
    }

    public abstract double calculatePriceByType();

    public String getAddress() {
        return address;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public ItemType getItemType() {
        return itemType;
    }

    @Override
    public String toString() {
        return "PostedItem{" +
                "address='" + address + '\'' +
                ", postedDate=" + postedDate +
                ", itemType=" + itemType +
                '}';
    }
}