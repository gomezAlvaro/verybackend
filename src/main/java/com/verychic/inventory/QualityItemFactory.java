package com.verychic.inventory;

public class QualityItemFactory {
        public QualityItem getQualityItem(Item item) {
            if(ItemType.AGED_CHEESE.getName().equals(item.getName())) {
                return new AgedCheeseItem();
            }
            if(ItemType.MILLENARY_HONEY.getName().equals(item.getName())) {
                return new MillenaryHoneyItem();
            }
            if(ItemType.EVENT.getName().equals(item.getName())) {
                return new EventItem();
            }
            return new OrdinaryItem();
        }
}
