package fa.training.utils;

import java.sql.Date;
import java.util.Scanner;

import fa.training.problem03.dao.implement.OrderDetailDAOImpl;
import fa.training.problem03.models.Order;
import fa.training.problem03.models.OrderDetail;

public class ValidateOrderDetail {
	OrderDetailDAOImpl orderDetailDAOImpl = new OrderDetailDAOImpl();
	
	public void validate() {
		Scanner scan = new Scanner(System.in);
		System.out.println("2. Create a new order detail ");
		System.out.println("Nhập order_id: "); int order_id2 = scan.nextInt();
	   	System.out.println("Nhập product_id: "); String product_id2 = scan.next();
	   	System.out.println("Nhập unit_price "); double unit_price2 = scan.nextInt(); 
	   	System.out.println("Nhập quantity "); int quantity2 = scan.nextInt();
	   	System.out.println("Nhập discount"); float discount2  = scan.nextInt();	
	   	orderDetailDAOImpl.save(new OrderDetail(order_id2, product_id2, unit_price2, quantity2, discount2));
	   	System.out.println("Create success ");
	}
}
