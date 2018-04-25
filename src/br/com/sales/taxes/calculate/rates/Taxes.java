package br.com.sales.taxes.calculate.rates;

import br.com.sales.taxes.model.Category;
import br.com.sales.taxes.model.Item;

public class Taxes {

	public static float calculateTax(Item item) {
		float tax = 0.0f;
		if (item != null) {
			if (item.getCategory() == Category.OTHERS) {
				tax = item.getPrice() * 0.1f;
			}

			if (item.isImported()) {
				tax += item.getPrice() * 0.05f;
			}
		}

		return item.getPrice() + getRoundedTax(tax);
	}
	
	public static float getRoundedTax(float tax) {

		float taxRounded = (float) (tax / 0.05);
		taxRounded = (float) Math.ceil(taxRounded);

		return (float) taxRounded * 0.05f;
	}

	

}
