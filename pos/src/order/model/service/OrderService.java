package order.model.service;

import java.util.ArrayList;
import java.util.List;

import menu.model.vo.Menu;
import order.model.vo.Order;
import order.model.vo.OrderMenu;

public interface OrderService {

	List<Order> selectOrderTotalList();
	List<Menu> selectMenuList();
	List<OrderMenu> selectOrderList(String tableNo);
	
//	int insertOrderList(ArrayList<OrderMenu> orderList);
	int insertOrderList(List<OrderMenu> orderList);
	
}



