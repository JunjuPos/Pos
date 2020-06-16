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
	public Order selectOneTotalPrice() {	
		SqlSession session = getSqlSession();
		
		Order oneTable = new OrderDao().selectOneTotalPrice(session);
		
		return oneTable;
	}

	@Override
	public Order selectTwoTotalPrice() {
		SqlSession session = getSqlSession();
		
		Order twoTable = new OrderDao().selectTwoTotalPrice(session);
		
		return twoTable;
	}

	@Override
	public Order selectThreeTotalPrice() {
		SqlSession session = getSqlSession();
		
		Order threeTable = new OrderDao().selectThreeTotalPrice(session);
		
		return threeTable;
	}

	@Override
	public Order selectFourTotalPrice() {
		SqlSession session = getSqlSession();
		
		Order fourTable = new OrderDao().selectFourTotalPrice(session);
		
		return fourTable;
	}

	@Override
	public Order selectFiveTotalPrice() {
		SqlSession session = getSqlSession();
		
		Order fiveTable = new OrderDao().selectFiveTotalPrice(session);
		
		return fiveTable;
	}

	@Override
	public Order selectSixTotalPrice() {
		SqlSession session = getSqlSession();
		
		Order sixTable = new OrderDao().selectSixTotalPrice(session);
		
		return sixTable;
	}

	@Override
	public Order selectSevenTotalPrice() {
		SqlSession session = getSqlSession();
		
		Order sevenTable = new OrderDao().selectSevenTotalPrice(session);
		
		return sevenTable;
	}

	@Override
	public Order selectEightTotalPrice() {
		SqlSession session = getSqlSession();
		
		Order eightTable = new OrderDao().selectEightTotalPrice(session);
		
		return eightTable;
	}

	@Override
	public Order selectNineTotalPrice() {
		SqlSession session = getSqlSession();
		
		Order nineTable = new OrderDao().selectNineTotalPrice(session);
		
		return nineTable;
	}

	@Override
	public Order selectTenTotalPrice() {
		SqlSession session = getSqlSession();
		
		Order tenTable = new OrderDao().selectTenTotalPrice(session);
		
		return tenTable;
	}

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

}
