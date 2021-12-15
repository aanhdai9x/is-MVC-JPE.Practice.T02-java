package fa.training.problem03.models;

import java.util.Date;

public class Order {
	private int order_id;
	private String customer_id;
	private Date order_date;
	private Date requied_date;
	private Date shipped_date;
	private String ship_address;
	
	
	
	
	public Order(int order_id, String customer_id, java.util.Date order_date, java.util.Date required_date, java.util.Date shipped_date,
			String ship_address) {
		super();
		this.order_id = order_id;
		this.customer_id = customer_id;
		this.order_date = (Date) order_date;
		this.requied_date = (Date) required_date;
		this.shipped_date = (Date) shipped_date;
		this.ship_address = ship_address;
	}
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public Date getRequied_date() {
		return requied_date;
	}
	public void setRequied_date(Date requied_date) {
		this.requied_date = requied_date;
	}
	public Date getShipped_date() {
		return shipped_date;
	}
	public void setShipped_date(Date shipped_date) {
		this.shipped_date = shipped_date;
	}
	public String getShip_address() {
		return ship_address;
	}
	public void setShip_address(String ship_address) {
		this.ship_address = ship_address;
	}
	
}
