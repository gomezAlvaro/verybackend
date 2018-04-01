package com.verychic.inventory;

public final class OrdinaryItemQuality extends ItemQuality implements UpdatableQuality {
    @Override
    public void updateQuality(Item item) {
        int sellIn = item.getSellIn();
        if(item.getQuality() > 0) item.setQuality(item.getQuality()-1);
        if(item.getQuality() > 0 && sellIn < 0) item.setQuality(item.getQuality()-1);
        item.setSellIn(sellIn-1);
    }
}
