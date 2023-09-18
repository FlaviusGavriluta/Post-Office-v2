package org.example;

import org.example.enums.ItemType;
import org.example.model.Box;
import org.example.model.Letter;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();

        Letter letter1 = new Letter("Buch", new Date(2023, Calendar.SEPTEMBER, 17));
        Letter letter2 = new Letter("Buch2", new Date());
        Box box1 = new Box("Timis", new Date(), ItemType.SMALL_BOX, 200);
        Box box2 = new Box("Timis2", new Date(2023, Calendar.SEPTEMBER, 16), ItemType.SMALL_BOX, 300);
        Box box3 = new Box("Cluj", new Date(2023, Calendar.SEPTEMBER, 17), ItemType.BIG_BOX, 1200);
        Box box4 = new Box("Cluj2", new Date(), ItemType.BIG_BOX, 1500);

        postOffice.addPosteItem(letter1);
        postOffice.addPosteItem(letter2);
        postOffice.addPosteItem(box1);
        postOffice.addPosteItem(box2);
        postOffice.addPosteItem(box3);
        postOffice.addPosteItem(box4);

        System.out.println("Total letters income: " + postOffice.calculateTotalIncomeByType(ItemType.LETTER));
        System.out.println("Total small boxes income: " + postOffice.calculateTotalIncomeByType(ItemType.SMALL_BOX));
        System.out.println("Total big boxes income: " + postOffice.calculateTotalIncomeByType(ItemType.BIG_BOX));

        System.out.println("----------------------------------");

        postOffice.listByDate(new Date(2023, Calendar.SEPTEMBER, 17))
                .forEach(System.out::println);

        System.out.println("----------------------------------");

        System.out.println("Posted items: " + postOffice.getPostedItems().size());
        postOffice.getPostedItems().forEach(System.out::println);
    }
}