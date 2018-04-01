package com.verychic.inventory;

public final class OrdinaryItem extends QualityItem implements UpdatableQuality {
    public void updateQuality(Item item) {
        int quality = item.getQuality();
        int sellIn = item.getSellIn();
        if(quality < 50) item.setQuality(item.getQuality()+1);
        item.setSellIn(item.getSellIn()-1);
    }
}
