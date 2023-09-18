package org.example;

import org.example.enums.ItemType;
import org.example.model.PostedItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class PostOffice {
    private List<PostedItem> postedItems;

    public PostOffice() {
        this.postedItems = new ArrayList<>();
    }

    public void addPosteItem(PostedItem postedItem) {
        postedItems.add(postedItem);
    }

    public List<PostedItem> listByDate(Date date) {
        return postedItems.stream()
                .filter(postedItem -> postedItem.getPostedDate().equals(date))
                .collect(Collectors.toList());
    }

    public double calculateTotalIncomeByType(ItemType itemType) {
        return postedItems.stream()
                .filter(postedItem -> postedItem.getItemType().equals(itemType))
                .mapToDouble(PostedItem::calculatePriceByType)
                .sum();
    }

    public List<PostedItem> getPostedItems() {
        return postedItems;
    }

    @Override
    public String toString() {
        return "PostOffice{" +
                "postedItems=" + postedItems +
                '}';
    }
}
