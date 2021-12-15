package fa.training.problem03.dao.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fa.training.problem03.dao.BaseDAO;
import fa.training.problem03.models.Order;
import fa.training.utils.DataConfig;

public class OrderDaoImpl implements BaseDAO<Order, String> {
	DataConfig config = new DataConfig();

	@Override
	public void save(Order obj) {
		try {
			String INSERT_ORDER_SQL = "INSERT INTO Orders(order_id, customer_id, order_date, required_date, shipped_date, ship_address) VALUES (?, ?, ?, ?, ?, ?);";
			Connection conn = config.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(INSERT_ORDER_SQL);
			preparedStatement.setInt(1, obj.getOrder_id());
			preparedStatement.setString(2, obj.getCustomer_id());
			preparedStatement.setDate(3, (java.sql.Date) obj.getOrder_date());
			preparedStatement.setDate(4, (java.sql.Date) obj.getRequied_date());
			preparedStatement.setDate(5, (java.sql.Date) obj.getShipped_date());
			preparedStatement.setString(6, obj.getShip_address());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void findAll(String str) {
		System.out.println("4. List order id: ");
		String SELECT_ORDER_BY_ID = "select order_id, customer_id, order_date, required_date, shipped_date, ship_address from Orders where customer_id = ?";
		List<Order> lo = new ArrayList<Order>();
		Order order = null;
		try {
			Connection conn = config.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(SELECT_ORDER_BY_ID);
			preparedStatement.setString(1, str);
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {

				int order_id = rs.getInt("order_id");
				Date order_date = rs.getDate("order_date");
				Date required_date = rs.getDate("required_date");
				Date shipped_date = rs.getDate("shipped_date");
				String ship_address = rs.getString("ship_address");
				order = new Order(order_id, str, order_date, required_date, shipped_date, ship_address);
				System.out.println(
						order_id + "  "+ " " +str + " " + order_date + "  " + required_date + "  " + shipped_date + " " + ship_address);
				lo.add(order);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
