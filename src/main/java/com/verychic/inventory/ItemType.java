package com.verychic.inventory;

public enum ItemType {
    AGED_CHEESE("Aged Cheese"),
    MILLENARY_HONEY("Millenary Honey"),
    EVENT("VIP special event passes"),
    FRESH("Fresh food");

    private String name;

    ItemType(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
