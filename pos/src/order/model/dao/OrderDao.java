package order.model.dao;



import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import menu.model.vo.Menu;
import order.model.vo.Order;
import order.model.vo.OrderMenu;

public class OrderDao {

	

	public List<Menu> selectMenuList(SqlSession session) {
		List<Menu> menuList = session.selectList("orderMapper.menuList");

//		System.out.println("dao menuList : " + menuList);
		return menuList;
	}

	public List<OrderMenu> selectOrderList(SqlSession session, String tableNo) {
		 List<OrderMenu> orderList = null;
		orderList = session.selectList("orderMapper.orderList",tableNo);
		
//		System.out.println("tableNo : " + tableNo);
		System.out.println("dao orderList : " + orderList);
		return orderList;
	}

	public int insertZeroOrder(SqlSession session, String tableNo, List<OrderMenu> insertList, String inOrderNo) {
		int result = 0;
		result = session.insert("orderMapper.insertZeroOrder",insertList); 
		System.out.println("result : " + result);
		
		return result;
	}

	public int insertOrder(SqlSession session, String tableNo, List<OrderMenu> insertList, String inOrderNo) {
		int result = 0;
		
		return result;
	}

	public List<Order> selectOrderTotalList(SqlSession session) {
		List<Order> list = session.selectList("orderMapper.selectOrderTotalList");
		System.out.println("전체금액list : " + list );
		return list;
	}

}
