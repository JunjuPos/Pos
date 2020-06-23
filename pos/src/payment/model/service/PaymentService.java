package payment.model.service;

import java.util.ArrayList;

import order.model.vo.OrderMenu;
import payment.exception.BillException;
import payment.exception.PaymentException;
import payment.model.vo.Bill;
import payment.model.vo.Payment;

public interface PaymentService {

	int paymentPrice(int tableNo);
	
	ArrayList<OrderMenu> selectOrderList(int tableNo);

	int billInsert(ArrayList<Bill> billList) throws BillException;

	int paymentInsert(Payment payment) throws BillException;

	int jumunDelete(int tableNo) throws BillException;
	
	
}
