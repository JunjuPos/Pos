package order.model.service;

import java.util.ArrayList;
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
	
	
	int updateAmountOrder(String tableNo, ArrayList<OrderMenu> orderList);
	int insertOrderList(String tableNo,  ArrayList<OrderMenu> orderList, String inOrderNo);
}



