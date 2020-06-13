package order.model.service;

import java.util.List;

import menu.model.vo.Menu;
import order.model.vo.Order;
import order.model.vo.OrderMenu;

public interface OrderService {

	Order selectOneTotalPrice();
	Order selectTwoTotalPrice();
	Order selectThreeTotalPrice();
	Order selectFourTotalPrice();
	Order selectFiveTotalPrice();
	Order selectSixTotalPrice();
	Order selectSevenTotalPrice();
	Order selectEightTotalPrice();
	Order selectNineTotalPrice();
	Order selectTenTotalPrice();
	
	List<Menu> selectMenuList();
	List<OrderMenu> selectOrderList(String tableNo);
	
	int updateAmountOrder(String tableNo, OrderMenu om);
	int insertOrderList(String tableNo, OrderMenu om);
}



