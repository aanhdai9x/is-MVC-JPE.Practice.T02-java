package fa.training;

import java.util.Scanner;

import fa.training.problem03.dao.implement.OrderDaoImpl;
import fa.training.problem03.dao.implement.OrderDetailDAOImpl;
import fa.training.utils.ValidateOrder;
import fa.training.utils.ValidateOrderDetail;

public class Main {
	static OrderDaoImpl orderDAOImpl = new OrderDaoImpl();
	static OrderDetailDAOImpl orderDetailDAOImpl = new OrderDetailDAOImpl();
	static ValidateOrder validateOrder = new ValidateOrder();
	static ValidateOrderDetail validateOrderDetail = new ValidateOrderDetail();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		int choose;
		do {
			System.out.println("Choose function: ");
			System.out.println("1. Create a new order");
			System.out.println("2. Create a new order detail");
			System.out.println("3. Total money");
			System.out.println("4: List order");
			choose = scan.nextInt();
		} while (choose < 1 | choose > 4);

		switch (choose) {
		case 1:
			validateOrder.validate();
			break;
		case 2:
			validateOrderDetail.validate();
			break;
		case 3:
			orderDetailDAOImpl.reportOfSale();
			break;
		case 4:
			System.out.println("Nhập customer_id: ");
			String customer_id4 = scan.next();
			orderDAOImpl.findAll(customer_id4);
			break;

		default:
			break;
		}
	}
}