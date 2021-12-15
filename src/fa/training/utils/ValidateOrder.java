package fa.training.utils;

import java.sql.Date;
import java.util.Scanner;

import fa.training.problem03.dao.implement.OrderDaoImpl;
import fa.training.problem03.models.Order;

public class ValidateOrder {
	static OrderDaoImpl orderDAOImpl = new OrderDaoImpl();
	Scanner scan = new Scanner(System.in);
	public void validate() {
		int order_id;
		String s_order_date, s_required_date, s_shipped_date, customer_id, ship_address;
		do {
			System.out.println("1. Create a new order ");
			System.out.println("Nhập order_id: "); order_id = scan.nextInt();
		   	System.out.println("Nhập customer_id: "); customer_id = scan.next();
		   	System.out.println("Nhập order_date định dạng yyyy-MM-dd: "); s_order_date = scan.next(); 
		   	System.out.println("Nhập required_date định dạng yyyy-MM-dd: "); s_required_date = scan.next();
		   	System.out.println("Nhập shipped_date định dạng yyyy-MM-dd: "); s_shipped_date = scan.next();
		   	System.out.println("Nhập ship_address: "); ship_address = scan.next();
		} while(Date.valueOf(s_order_date).compareTo(Date.valueOf(s_required_date))>0);
	   	orderDAOImpl.save(new Order(order_id, customer_id, Date.valueOf(s_order_date), Date.valueOf(s_required_date), Date.valueOf(s_shipped_date), ship_address));
	   	System.out.println("Create success ");
	}
}
