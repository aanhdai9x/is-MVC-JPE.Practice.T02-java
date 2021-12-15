package fa.training.problem03.dao.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import fa.training.problem03.dao.BaseDAO;
import fa.training.problem03.models.OrderDetail;
import fa.training.utils.DataConfig;

public class OrderDetailDAOImpl implements BaseDAO<OrderDetail, String>{
	static DataConfig config = new DataConfig();
	
	@Override
	public void save(OrderDetail obj) {
		try {
			String INSERT_ORDER_DETAIL_SQL = "INSERT INTO OrderDetails" + "  (order_id, product_id, unit_price, quantity, discount) VALUES (?, ?, ?, ?, ?);";
			Connection conn = config.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(INSERT_ORDER_DETAIL_SQL);
			preparedStatement.setInt(1, obj.getOrder_id());
			preparedStatement.setString(2, obj.getProduct_id());
			preparedStatement.setDouble(3, obj.getUnit_price());
			preparedStatement.setInt(4, obj.getQuantity());
			preparedStatement.setFloat(5, obj.getDiscount());
			
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void findAll(String str) {
		// TODO Auto-generated method stub
		
	}
	
	public Map<String, Double> reportOfSale(){
		String SELECT_ALL = "SELECT * FROM Orders, OrderDetails WHERE Orders.order_id = OrderDetails.order_id AND DAY(Orders.order_date) = DAY(GETDATE())";
		Map<String, Double> kq = new HashMap<String, Double>();
		System.out.println("3. Total price today: ");
		try {
			Connection conn = config.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SELECT_ALL);
            while (rs.next()) {
            	kq.put(rs.getString("customer_id"), rs.getDouble("unit_price")*rs.getInt("quantity") - rs.getDouble("unit_price")*rs.getInt("quantity")*(rs.getFloat("discount")/100) );
                System.out.println(kq);
            }
            return kq;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return kq;
	}
}
