package payment.model.service;

import java.util.ArrayList;

import order.model.vo.OrderMenu;

public interface PaymentService {

	int paymentPrice(int tableNo);
	
	ArrayList<OrderMenu> selectOrderList(int tableNo);
}
