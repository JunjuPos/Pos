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
	public int updateAmountOrder(String tableNo,  ArrayList<OrderMenu> orderList) {
		
		return 0;
	}

	@Override
	public int insertOrderList(String tableNo,  ArrayList<OrderMenu> orderList, String inOrderNo) {
		SqlSession session = getSqlSession();
		OrderDao oDao = new OrderDao();
		List<OrderMenu> insertList = new ArrayList<>();
		int result = 0;
		for(OrderMenu o : orderList) {
			if(o.getORDER_NO().equals("zero")) {
				System.out.println("여기냐?");
				System.out.println("zero OrderNO : " + o.getORDER_NO());
				System.out.println("zero inOrderNo : " + inOrderNo);
				insertList.add(o);
				result = oDao.insertZeroOrder(session, tableNo, insertList, inOrderNo);
			}else {
				System.out.println("아님 여기냐?");
				System.out.println("no OrderNO : " + o.getORDER_NO());
				insertList.add(o);
				result = oDao.insertOrder(session, tableNo, insertList, inOrderNo);
			}
		}
		return 0;
	}

	@Override
	public List<Order> selectOrderTotalList() {
		SqlSession session = getSqlSession();
		List<Order> list = new OrderDao().selectOrderTotalList(session);
		return list;
	}

}
