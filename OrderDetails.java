package com.cg.sm;
import jakarta.persistence.Entity;
import java.time.LocalDateTime;
import jakarta.persistence.Id;

@Entity
public class OrderDetails {
	private int id;
	private LocalDateTime dateOfPurchase;
	private float price;
	private int customer_id;
	
	
	
	public OrderDetails() {
		super();
	}



	public OrderDetails(int id, LocalDateTime dateOfPurchase, float price, int customer_id) {
		super();
		this.id = id;
		this.dateOfPurchase = dateOfPurchase;
		this.price = price;
		this.customer_id = customer_id;
	}
	
	@Id
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public LocalDateTime getDateOfPurchase() {
		return dateOfPurchase;
	}



	public void setDateOfPurchase(LocalDateTime dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}



	public int getCustomer_id() {
		return customer_id;
	}



	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}



	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", dateOfPurchase=" + dateOfPurchase + ", price=" + price + ", customer_id="
				+ customer_id + ", getId()=" + getId() + ", getDateOfPurchase()=" + getDateOfPurchase()
				+ ", getPrice()=" + getPrice() + ", getCustomer_id()=" + getCustomer_id() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
		


}
