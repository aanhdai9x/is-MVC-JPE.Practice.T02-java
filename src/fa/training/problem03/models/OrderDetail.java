package fa.training.problem03.models;

public class OrderDetail {
	private int order_id;
	private String product_id;
	private Double unit_price;
	private int quantity;
	private float discount;
	
	public OrderDetail(int order_id, String product_id, Double unit_price, int quantity, float discount) {
		super();
		this.order_id = order_id;
		this.product_id = product_id;
		this.unit_price = unit_price;
		this.quantity = quantity;
		this.discount = discount;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public Double getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(Double unit_price) {
		this.unit_price = unit_price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	
}
