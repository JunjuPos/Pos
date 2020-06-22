package payment.model.service;

import static common.Template.getSqlSession;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import order.model.vo.OrderMenu;
import payment.model.dao.PaymentDao;

public class PaymentServiceImpl implements PaymentService{

	@Override
	public int paymentPrice(int tableNo) {
		SqlSession session = getSqlSession();
		
		int totalPrice = new PaymentDao().paymentPrice(session, tableNo);
		
		return totalPrice;
	}

	@Override
	public ArrayList<OrderMenu> selectOrderList(int tableNo) {
		SqlSession session = getSqlSession();
		
		ArrayList<OrderMenu> orderList = new ArrayList<>();
		
		orderList = new PaymentDao().selectOrderList(session, tableNo);
		
		return orderList;
	}

	@Override
	public int billInsert(int fristPrice, ArrayList<OrderMenu> orderList) {
		SqlSession session = getSqlSession();
		
		int result = new PaymentDao().insertBill(session,fristPrice, orderList);
		
		return 0;
	}

}
