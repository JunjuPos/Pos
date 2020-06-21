package order.model.dao;



import java.util.List;

import org.apache.ibatis.session.SqlSession;

import menu.model.vo.Menu;
import order.model.vo.Order;
import order.model.vo.OrderMenu;

public class OrderDao {

	
	// 메뉴리스트_혜린
	public List<Menu> selectMenuList(SqlSession session) {
		List<Menu> menuList = session.selectList("orderMapper.menuList");

//		System.out.println("dao menuList : " + menuList);
		return menuList;
	}
	
	// 테이블별 주문 목록_혜린 
	public List<OrderMenu> selectOrderList(SqlSession session, String tableNo) {
		 List<OrderMenu> orderList = null;
		orderList = session.selectList("orderMapper.orderList",tableNo);
		
//		System.out.println("tableNo : " + tableNo);
		System.out.println("dao orderList : " + orderList);
		return orderList;
	}
	
	// mainTable 주문 합계_혜린
	public List<Order> selectOrderTotalList(SqlSession session) {
		List<Order> list = session.selectList("orderMapper.selectOrderTotalList");
		System.out.println("전체금액list : " + list );
		return list;
	}

	// 주문 목록 추가_혜린
	public int insertOrderList(SqlSession session, List<OrderMenu> orderList) {
//		INSERT INTO JUMUN(ORDER_NO, MENU, AMOUNT, ORDER_DATE, TABLE_NO, PAY_YN) VALUES(SEQ_JUMUN.NEXTVAL, '김치찌개', 3, SYSDATE, 3, 'N'   );
		int result = 0;
//		int result = session.insert("orderMapper.insertOrderList", orderList);
		
			
			result = session.insert("orderMapper.insertOrderList", orderList);	// mapper주석하고 하나 복사하기
		

		System.out.println("Dao 추가 된 행의 갯수 : " + result);
		
		session.commit();
		return result;
	}

	public int deleteOrderList(SqlSession session, String tableNo) {
		int result = session.delete("orderMapper.deleteOrderList",tableNo);
				
		System.out.println("dao 삭제 된 행의 갯수 : " + result);
		
		session.commit();
		return result;
	}

}
