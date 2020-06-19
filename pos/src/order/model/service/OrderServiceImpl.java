package order.model.service;

import static common.Template.getSqlSession;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import menu.model.vo.Menu;
import order.model.dao.OrderDao;
import order.model.vo.Order;
import order.model.vo.OrderMenu;
public class OrderServiceImpl implements OrderService {


	@Override
	public List<Menu> selectMenuList() {
		SqlSession session = getSqlSession();
		List<Menu> menuList = new OrderDao().selectMenuList(session);
		
		/*
		 * if(menuList.isEmpty()) { session.close(); }
		 */
		return menuList;
	}

	@Override
	public List<OrderMenu> selectOrderList(String tableNo) {
		SqlSession session = getSqlSession();
		
		List<OrderMenu> orderList = new OrderDao().selectOrderList(session, tableNo);
		
		if(orderList.isEmpty()) {
			session.close();
		}
		return orderList;
	}

	
	@Override
	public List<Order> selectOrderTotalList() {
		SqlSession session = getSqlSession();
		List<Order> list = new OrderDao().selectOrderTotalList(session);
		return list;
	}

	@Override
	public int insertOrderList(ArrayList<OrderMenu> orderList) {
		SqlSession session = getSqlSession();
		int result = new OrderDao().insertOrderList(session, orderList);
		return result;
	}

}
