package order.model.service;

import java.util.ArrayList;

import menu.model.vo.Menu;
import order.model.vo.Order;

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
	
	ArrayList<Menu> selectMenuList(String tableNo);
	
}



