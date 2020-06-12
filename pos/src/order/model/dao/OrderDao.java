package order.model.dao;



import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import menu.model.vo.Menu;
import order.model.vo.Order;

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

	public ArrayList<Menu> selectMenuList(SqlSession session, String tableNo) {
		ArrayList<Menu> menuList = new ArrayList<>();
		menuList = (ArrayList)session.selectList("orderMapper.menuList");
		
		System.out.println("dao menuList : " + menuList);
		return menuList;
	}

}
