package payment.model.service;

import java.util.ArrayList;

import order.model.vo.OrderMenu;
import payment.exception.PaymentException;
import payment.model.vo.Bill;
import payment.model.vo.Payment;

public interface PaymentService {

	int paymentPrice(int tableNo);
	
	ArrayList<OrderMenu> selectOrderList(int tableNo);

	int billInsert(ArrayList<Bill> billList) throws PaymentException;

	int paymentInsert(Payment payment) throws PaymentException;

	int jumunDelete(int tableNo) throws PaymentException;

	int mainTableUpdate(int tableNo) throws PaymentException;
	
	
}
