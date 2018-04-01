package com.verychic.inventory;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class InventoryTest {
    //TODO where is the test to check quality -2 if sellin passed?

	@Test
    public void should_never_change_quailty_of_Millenary_Honey() throws Exception {

        Item millenaryHoney = new Item("Millenary Honey", 0, 80);

        Inventory sut = new Inventory((Item[]) Arrays.asList(new Item("Millenary Honey", 0, 80)).toArray());

        sut.updateQuality();

        assertEquals(80, millenaryHoney.getQuality());
    }

    @Test
    public void should_never_change_sellIn_of_Millenary_Honey() throws Exception {

        Item millenaryHoney = new Item("Millenary Honey", 0, 80);

        Inventory sut = new Inventory((Item[]) Arrays.asList(millenaryHoney).toArray());

        sut.updateQuality();

        assertEquals(0, millenaryHoney.getSellIn());
    }

//    @Test
//    public void should_lower_the_sellIn_by_one_for_ordinary_items() throws Exception {
//
//        Item ordinaryItem = new Item("Ordinary food", 10, 20);
//
//        Inventory sut = new Inventory((Item[]) Arrays.asList(ordinaryItem).toArray());
//
//        sut.updateQuality();
//
//        assertEquals(9, ordinaryItem.getSellIn());
//    }
//
//    @Test
//    public void should_lower_the_quality_by_one_for_ordinary_items() throws Exception {
//
//        Item ordinaryItem = new Item("Ordinary food", 10, 20);
//
//        Inventory sut = new Inventory((Item[]) Arrays.asList(ordinaryItem).toArray());
//
//        sut.updateQuality();
//
//        assertEquals(19, ordinaryItem.getQuality());
//    }
//
//    @Test
//    public void should_not_lower_the_quality_below_zero() throws Exception {
//
//        Item ordinaryItem = new Item("Ordinary food", 10, 0);
//
//        Inventory sut = new Inventory((Item[]) Arrays.asList(ordinaryItem).toArray());
//
//        sut.updateQuality();
//
//        assertEquals(0, ordinaryItem.getQuality());
//    }
//
//    @Test
//    public void should_lower_the_quality_twice_as_fast_once_the_sell_in_date_has_passed() throws Exception {
//
//    	Item ordinaryItem = new Item("Ordinary food", -1, 25);
//
//        Inventory sut = new Inventory((Item[]) Arrays.asList(ordinaryItem).toArray());
//
//        sut.updateQuality();
//
//        assertEquals(23, ordinaryItem.getQuality());
//    }

    @Test
    public void should_increase_the_quality_of_aged_cheese_as_it_gets_older() throws Exception {
    	
        Item agedCheese = new Item("Aged Cheese", 10, 25);


        Inventory sut = new Inventory((Item[]) Arrays.asList(agedCheese).toArray());

        sut.updateQuality();

        assertEquals(26, agedCheese.getQuality());
    }

    @Test
    public void should_not_increase_the_quality_of_aged_cheese_over_50() throws Exception {

        Item agedCheese = new Item("Aged Cheese", 10, 50);

        Inventory sut = new Inventory((Item[]) Arrays.asList(agedCheese).toArray());

        sut.updateQuality();

        assertEquals(50, agedCheese.getQuality());
    }

    @Test
    public void should_lower_vip_passes_to_zero_quality_once_event_has_happened() throws Exception {

        Item vipPass = new Item("VIP special event passes", -1, 20);

        Inventory sut = new Inventory((Item[]) Arrays.asList(vipPass).toArray());

        sut.updateQuality();

        assertEquals(0, vipPass.getQuality());
    }

    @Test
    public void should_increase_vip_passes_quality_by_1_when_the_event_is_more_than_10_days_away() throws Exception {

    	Item vipPass = new Item("VIP special event passes", 11, 20);

        Inventory sut = new Inventory((Item[]) Arrays.asList(vipPass).toArray());

        sut.updateQuality();

        assertEquals(21, vipPass.getQuality());
    }

    @Test
    public void should_increase_backstage_passes_quality_by_2_when_the_event_is_10_days_or_less_away() throws Exception {

    	Item vipPass = new Item("VIP special event passes", 10, 27);

        Inventory sut = new Inventory((Item[]) Arrays.asList(vipPass).toArray());

        sut.updateQuality();

        assertEquals(29, vipPass.getQuality());
    }

    @Test
    public void should_increase_vip_passes_quality_by_3_when_the_event_is_5_days_or_less_away() throws Exception {

    	Item vipPass = new Item("VIP special event passes", 5, 44);

        Inventory sut = new Inventory((Item[]) Arrays.asList(vipPass).toArray());

        sut.updateQuality();

        assertEquals(47, vipPass.getQuality());
    }

    @Test
    public void should_not_increase_vip_passes_above_a_quality_of_50() throws Exception {

    	Item vipPassMoreThan10DaysAway = new Item("VIP special event passes", 15, 50);

        Item vipPass10DaysAway = new Item("VIP special event passes", 5, 49);
        Item vipPass5DaysAway = new Item("VIP special event passes", 5, 48);

        Inventory sut = new Inventory((Item[]) Arrays.asList(vipPassMoreThan10DaysAway,
        		vipPass10DaysAway, vipPass5DaysAway).toArray());

        sut.updateQuality();

        assertEquals(50, vipPassMoreThan10DaysAway.getQuality());
        assertEquals(50, vipPass10DaysAway.getQuality());
        assertEquals(50, vipPass5DaysAway.getQuality());
    }
}