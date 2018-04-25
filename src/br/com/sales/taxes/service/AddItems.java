package br.com.sales.taxes.service;

import java.util.ArrayList;
import java.util.List;

import br.com.sales.taxes.model.Category;
import br.com.sales.taxes.model.Item;

public class AddItems {
	
	public static List<Item> addSalesOne() {

		Item item1 = new Item();
		item1.setQuantity(1);
		item1.setDescription("book");
		item1.setPrice((float) 12.49);
		item1.setCategory(Category.BOOK);
		item1.setImported(false);

		Item item2 = new Item();
		item2.setQuantity(1);
		item2.setDescription("music CD");
		item2.setPrice((float) 14.99);
		item2.setCategory(Category.OTHERS);
		item2.setImported(false);

		Item item3 = new Item();
		item3.setQuantity(1);
		item3.setDescription("chocolate bar");
		item3.setPrice((float) 0.85);
		item3.setCategory(Category.FOOD);
		item3.setImported(false);

		List<Item> items = new ArrayList<Item>();

		items.add(item1);
		items.add(item2);
		items.add(item3);

		return items;

	}

	public static List<Item> addSalesTwo() {

		Item item1 = new Item();
		item1.setQuantity(1);
		item1.setDescription("imported box of chocolates");
		item1.setPrice((float) 10.00);
		item1.setCategory(Category.FOOD);
		item1.setImported(true);

		Item item2 = new Item();
		item2.setQuantity(1);
		item2.setDescription("imported bottle of perfume");
		item2.setPrice((float) 47.50);
		item2.setCategory(Category.OTHERS);
		item2.setImported(true);

		List<Item> items = new ArrayList<Item>();

		items.add(item1);
		items.add(item2);

		return items;

	}

	public static List<Item> addSalesThree() {

		Item item1 = new Item();
		item1.setQuantity(1);
		item1.setDescription("imported bottle of perfume");
		item1.setPrice((float) 27.99);
		item1.setCategory(Category.OTHERS);
		item1.setImported(true);

		Item item2 = new Item();
		item2.setQuantity(1);
		item2.setDescription("bottle of perfume");
		item2.setPrice((float) 18.99);
		item2.setCategory(Category.OTHERS);
		item2.setImported(false);

		Item item3 = new Item();
		item3.setQuantity(1);
		item3.setDescription("packet of headache pills");
		item3.setPrice((float) 9.75);
		item3.setCategory(Category.MEDICATION);
		item3.setImported(false);

		Item item4 = new Item();
		item4.setQuantity(1);
		item4.setDescription("imported box of chocolates");
		item4.setPrice((float) 11.25);
		item4.setCategory(Category.FOOD);
		item4.setImported(true);

		List<Item> items = new ArrayList<Item>();

		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);

		return items;

	}

}
