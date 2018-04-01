package com.verychic.inventory;

public final class ItemWrapper {
	private Item item;
	private ItemQuality itemQuality;

	public ItemWrapper(Item item){
	    this.item =  item;
	    this.itemQuality = ItemQualityFactory.getQualityItem(item);
    }

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public ItemQuality getItemQuality() {
		return itemQuality;
	}

	public void setItemQuality(ItemQuality itemQuality) {
		this.itemQuality = itemQuality;
	}
}
