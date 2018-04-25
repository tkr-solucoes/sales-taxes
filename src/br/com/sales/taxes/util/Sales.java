package br.com.sales.taxes.util;

import java.util.List;
import br.com.sales.taxes.calculate.rates.Taxes;
import br.com.sales.taxes.model.Item;

public class Sales {

	public static void printReceipt(List<Item> items) {

		float tax = 0.0f;
		float total = 0.0f;

		if (items != null && !items.isEmpty()) {

			for (Item item : items) {
				System.out.print(item.getQuantity() + " ");
				System.out.print(item.getDescription() + ": ");

				float newPrice = Taxes.calculateTax(item);
				System.out.println(String.format("%.2f", newPrice));

				tax = tax + (newPrice - item.getPrice());
				total = total + newPrice;

			}
		}

		System.out.println("Sales Taxes: " + String.format("%.2f", tax));
		System.out.println("Total: " + String.format("%.2f", total));
	}

}
