package com.capgemini.assesments.fourth;

public class TestItem {

	public static void main(String[] args) {

		Item[] items = new Item[2];

		Item s1 = new Item("braslet", 90.45);
		Item s2 = new Item("ring", 78.65);

		items[0] = s1;
		items[1] = s2;
	
		printItemDetails(items);
		Item[] itm = getItem();
		printItemDetails(itm);
	}

	static void printItemDetails(Item[] itm) {

		for (int i = 0; i < itm.length; i++) {
			System.out.println("Name = " + itm[i].name);
			System.out.println("price = " + itm[i].price);

			System.out.println("*********************");
		}
	}

	static Item[] getItem() {

		Item[] items = new Item[2];

		Item s1 = new Item("abc", 90.45);
		Item s2 = new Item("xyz", 78.65);
		
		items[0] = s1;
		items[1] = s2;
		

		return items;
	}
}
