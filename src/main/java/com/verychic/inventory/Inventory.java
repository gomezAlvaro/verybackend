package com.verychic.inventory;

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
        List<ItemWrapper> itemWrapperList = getItemWrapperList();
        updateQuality(itemWrapperList);
    }

    private List<ItemWrapper> getItemWrapperList(){
        return Arrays.stream(items).map(ItemWrapper::new).collect(Collectors.toList());
    }

    private void updateQuality(List<ItemWrapper> itemWrapperList) {
        itemWrapperList.forEach(itemWrapper -> itemWrapper.getItemQuality().updateQuality(itemWrapper.getItem()));
    }
}
