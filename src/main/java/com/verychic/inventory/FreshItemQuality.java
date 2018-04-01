package com.verychic.inventory;

public final class FreshItemQuality extends ItemQuality {
    @Override
    public void updateQuality(Item item) {
        int sellIn = item.getSellIn();
        int qualityLoss = sellIn < 0 ? 4 : 2;
        int qualityTotal = item.getQuality()-qualityLoss < 0 ? 0 : item.getQuality()-qualityLoss;
        item.setSellIn(sellIn-1);
        item.setQuality(qualityTotal);
    }
}
