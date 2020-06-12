package order.model.service;

import static common.Template.getSqlSession;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import menu.model.vo.Menu;
import order.model.dao.OrderDao;
import order.model.vo.Order;
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
	public ArrayList<Menu> selectMenuList(String tableNo) {
		SqlSession session = getSqlSession();
		ArrayList<Menu> menuList = new OrderDao().selectMenuList(session, tableNo);
		
		if(menuList.isEmpty()) {
			session.close();
		}
		return menuList;
	}

}
