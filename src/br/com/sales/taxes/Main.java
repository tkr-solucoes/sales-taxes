package br.com.sales.taxes;

import br.com.sales.taxes.service.AddItems;
import br.com.sales.taxes.util.Sales;

public class Main {

	public static void main(String[] args) {

		System.out.println("Output 1:");
		Sales.printReceipt(AddItems.addSalesOne());
		System.out.println();

		System.out.println("Output 2:");
		Sales.printReceipt(AddItems.addSalesTwo());
		System.out.println();

		System.out.println("Output 3:");
		Sales.printReceipt(AddItems.addSalesThree());
		System.out.println();

	}	

}
