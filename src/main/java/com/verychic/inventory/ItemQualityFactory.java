package com.verychic.inventory;

public class ItemQualityFactory {
        public static ItemQuality getQualityItem(Item item) {
            if(ItemType.AGED_CHEESE.getName().equals(item.getName())) {
                return new AgedCheeseItemQuality();
            }
            if(ItemType.MILLENARY_HONEY.getName().equals(item.getName())) {
                return new MillenaryHoneyItemQuality();
            }
            if(ItemType.EVENT.getName().equals(item.getName())) {
                return new EventItemQuality();
            }
            if(ItemType.FRESH.getName().equals(item.getName())) {
                return new FreshItemQuality();
            }
            return new OrdinaryItemQuality();
        }
}
