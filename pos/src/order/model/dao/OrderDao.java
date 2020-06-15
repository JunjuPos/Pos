package order.model.dao;



import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import menu.model.vo.Menu;
import order.model.vo.Order;
import order.model.vo.OrderMenu;

public class OrderDao {

	public Order selectOneTotalPrice(SqlSession session) {
		Order oneTable = null;
		oneTable = (Order) session.selectOne("orderMapper.totalOnePriceList");
	
		return oneTable;
	}

	public Order selectTwoTotalPrice(SqlSession session) {
		Order twoTable = null;
		twoTable = (Order) session.selectOne("orderMapper.totalTwoPriceList");
		
		return twoTable;
	}

	public Order selectThreeTotalPrice(SqlSession session) {
		Order threeTable = null;
		threeTable = (Order) session.selectOne("orderMapper.totalThreePriceList");
		
		return threeTable;
	}

	public Order selectFourTotalPrice(SqlSession session) {
		Order fourTable = null;
		fourTable = (Order) session.selectOne("orderMapper.totalFourPriceList");
		
		return fourTable;
	}

	public Order selectFiveTotalPrice(SqlSession session) {
		Order fiveTable = null;
		fiveTable = (Order) session.selectOne("orderMapper.totalFivePriceList");
		
		return fiveTable;
	}

	public Order selectSixTotalPrice(SqlSession session) {
		Order sixTable = null;
		sixTable = (Order) session.selectOne("orderMapper.totalSixPriceList");
		
		return sixTable;
	}

	public Order selectSevenTotalPrice(SqlSession session) {
		Order sevenTable = null;
		sevenTable = (Order) session.selectOne("orderMapper.totalSevenPriceList");
		
		return sevenTable;
	}

	public Order selectEightTotalPrice(SqlSession session) {
		Order eightTable = null;
		eightTable = (Order) session.selectOne("orderMapper.totalEightPriceList");
		
		return eightTable;
	}

	public Order selectNineTotalPrice(SqlSession session) {
		Order nineTable = null;
		nineTable = (Order) session.selectOne("orderMapper.totalNinePriceList");
		
		return nineTable;
	}

	public Order selectTenTotalPrice(SqlSession session) {
		Order tenTable = null;
		tenTable = (Order) session.selectOne("orderMapper.totalTenPriceList");
		
		return tenTable;
	}

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

}
