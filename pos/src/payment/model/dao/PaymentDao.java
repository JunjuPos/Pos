package payment.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import order.model.vo.Order;
import order.model.vo.OrderMenu;
import payment.exception.BillException;
import payment.exception.PaymentException;
import payment.model.vo.Bill;
import payment.model.vo.Payment;

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

	public int insertBill(SqlSession session, ArrayList<Bill> billList) throws BillException {
		
		int result = session.insert("paymentMapper.billInsert", billList);
		
		if(result > 0)
		{
			System.out.println(result + "insert 성공");
			session.commit();
		}
		else
		{
			session.rollback();
			throw new BillException("BillInsert실패");
		}
		return result;
	}

	public int paymentInsert(SqlSession session, Payment payment) throws BillException {
		
		int result = session.insert("paymentMapper.paymentInsert", payment);
		
		if(result > 0)
		{
			session.commit();
		}
		else
		{
			session.rollback();
			throw new BillException("payment insert실패");
		}
		return 0;
	}


}
