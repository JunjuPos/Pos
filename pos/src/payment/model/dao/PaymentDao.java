package payment.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import order.model.vo.Order;
import order.model.vo.OrderMenu;

public class PaymentDao {

	public int paymentPrice(SqlSession session, int tableNo) {
		Order order = session.selectOne("orderMapper.selectPaymentPrice", tableNo);
		System.out.println(order.getPRICE());
		
		return order.getPRICE();
	}

	public ArrayList<OrderMenu> selectOrderList(SqlSession session, int tableNo) {
		ArrayList<OrderMenu> orderList = new ArrayList<>();
		
		orderList = (ArrayList)session.selectList("orderMapper.orderList1", tableNo);
		
		for(OrderMenu o : orderList)
		{
			System.out.println(o);
		}
		return orderList;
	}


}
