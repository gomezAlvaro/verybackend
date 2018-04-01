package com.verychic.inventory;

public final class EventItemQuality extends ItemQuality {
    @Override
    public void updateQuality(Item item) {
        int sellIn = item.getSellIn();

        if(sellIn < 0) item.setQuality(0);
        else {
            if (item.getQuality() < 50) item.setQuality(item.getQuality() + 1);
            if (item.getQuality() < 50 && sellIn < 11) item.setQuality(item.getQuality() + 1);
            if (item.getQuality() < 50 && sellIn < 6) item.setQuality(item.getQuality() + 1);
        }
    }
}
