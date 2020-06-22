package order.model.service;

import java.util.ArrayList;
import java.util.List;

import menu.model.vo.Menu;
import order.model.vo.Order;
import order.model.vo.OrderMenu;
import order.model.vo.OrderTotalPrice;

public interface OrderService {

	List<OrderTotalPrice> selectOrderTotalList();
	List<Menu> selectMenuList();
	List<OrderMenu> selectOrderList(String tableNo);
	
//	int insertOrderList(ArrayList<OrderMenu> orderList);
	int insertOrderList(List<OrderMenu> orderList);
	
}



