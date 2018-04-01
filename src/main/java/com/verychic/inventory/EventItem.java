package com.verychic.inventory;

public final class EventItem extends QualityItem {
    public void updateQuality(Item item) {
        int quality = item.getQuality();
        int sellIn = item.getSellIn();
        if(quality < 50) item.setQuality(item.getQuality()+1);
    }
}
