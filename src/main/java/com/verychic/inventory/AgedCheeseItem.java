package com.verychic.inventory;

public final class AgedCheeseItem extends QualityItem {
    public void updateQuality(Item item) {
        int quality = item.getQuality();
        if(quality < 50) item.setQuality(item.getQuality()+1);
        item.setSellIn(item.getSellIn()-1);
    }
}
