package com.verychic.inventory;

public final class ItemWrapper {
	private Item item;
	private QualityItem qualityItem;
	private QualityItemFactory qualityItemFactory = new QualityItemFactory();

	public ItemWrapper(Item item){
	    this.item =  item;
	    qualityItem = qualityItemFactory.getQualityItem(item);
    }

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public QualityItem getQualityItem() {
		return qualityItem;
	}

	public void setQualityItem(QualityItem qualityItem) {
		this.qualityItem = qualityItem;
	}
}
