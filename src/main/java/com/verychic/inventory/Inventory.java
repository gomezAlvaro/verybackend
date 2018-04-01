package com.verychic.inventory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {
	private Item[] items;

    public Inventory(Item[] items) {
        super();
        this.items = items;
    }

    public Inventory() {
        super();
        items = new Item[]{
            new Item("Ordinary food", 10, 20),
            new Item("Aged Cheese", 2, 0),
            new Item("Ordinary drink", 5, 7),
            new Item("Millenary Honey", 0, 80),
            new Item("VIP special event passes", 15, 20),
            new Item("Fresh food", 3, 6)
        };

    }

    public void updateQuality() {
        //get wrappers that will contain the updateQuality code for each item type
        List<ItemWrapper> itemWrapperList = Arrays.stream(items).map(ItemWrapper::new).collect(Collectors.toList());
        //update the quality of each item
        itemWrapperList.forEach(itemWrapper -> itemWrapper.getQualityItem().updateQuality(itemWrapper.getItem()));

//
//        for (int i = 0; i < items.length; i++) {
//            if (items[i].getName() != "Aged Cheese"
//                    && items[i].getName() != "VIP special event passes") {
//                if (items[i].getQuality() > 0) {
//                    if (items[i].getName() != "Millenary Honey") {
//                        items[i].setQuality(items[i].getQuality() - 1);
//                    }
//                }
//            } else {
//                if (items[i].getQuality() < 50) {
//                    items[i].setQuality(items[i].getQuality() + 1);
//
//                    if (items[i].getName() == "VIP special event passes") {
//                        if (items[i].getSellIn() < 11) {
//                            if (items[i].getQuality() < 50) {
//                                items[i].setQuality(items[i].getQuality() + 1);
//                            }
//                        }
//
//                        if (items[i].getSellIn() < 6) {
//                            if (items[i].getQuality() < 50) {
//                                items[i].setQuality(items[i].getQuality() + 1);
//                            }
//                        }
//                    }
//                }
//            }
//
//            if (items[i].getName() != "Millenary Honey") {
//                items[i].setSellIn(items[i].getSellIn() - 1);
//            }
//
//            if (items[i].getSellIn() < 0) {
//                if (items[i].getName() != "Aged Cheese") {
//                    if (items[i].getName() != "VIP special event passes") {
//                        if (items[i].getQuality() > 0) {
//                            if (items[i].getName() != "Millenary Honey") {
//                                items[i].setQuality(items[i].getQuality() - 1);
//                            }
//                        }
//                    } else {
//                        items[i].setQuality(items[i].getQuality()
//                                - items[i].getQuality());
//                    }
//                } else {
//                    if (items[i].getQuality() < 50) {
//                        items[i].setQuality(items[i].getQuality() + 1);
//                    }
//                }
//            }
//        }
    }
}
