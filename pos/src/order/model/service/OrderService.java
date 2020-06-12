package order.model.service;

import java.util.ArrayList;

import order.model.vo.Order;

public interface OrderService {

	ArrayList<Order> selectTotalPrice();
}
