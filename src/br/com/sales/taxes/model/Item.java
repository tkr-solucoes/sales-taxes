package br.com.sales.taxes.model;



public class Item {
	
	private int quantity;
	private String description;
	private boolean imported;
	private float price;
	private Category category;
	
	
	
	public Item(int quantity, String description, boolean imported, float price, Category category) {
	
		this.description = description;
		this.imported = imported;
		this.price = price;
		this.category = category;
		
	}
	
	public Item () {
		
	}	
		

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isImported() {
		return imported;
	}

	public void setImported(boolean imported) {
		this.imported = imported;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}



	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
	}

			

}
