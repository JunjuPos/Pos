package payment.model.service;

import static common.Template.getSqlSession;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import order.model.vo.OrderMenu;
import payment.exception.PaymentException;
import payment.model.dao.PaymentDao;
import payment.model.vo.Bill;
import payment.model.vo.Payment;

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
	public int billInsert(ArrayList<Bill> billList) throws PaymentException {
		SqlSession session = getSqlSession();
		
		int result = new PaymentDao().insertBill(session, billList);
		
		return result;
	}

	@Override
	public int paymentInsert(Payment payment) throws PaymentException {
		SqlSession session = getSqlSession();
		
		int result = new PaymentDao().paymentInsert(session, payment);
		
		return result;
	}

	@Override
	public int jumunDelete(int tableNo) throws PaymentException {
		SqlSession session = getSqlSession();
		
		int result = new PaymentDao().jumunDelete(session, tableNo);
		return result;
	}

	@Override
	public int mainTableUpdate(int tableNo) throws PaymentException {
		SqlSession session = getSqlSession();
		
		int result = new PaymentDao().mainTableUpdate(session, tableNo);
		
		return result;
	}

}
