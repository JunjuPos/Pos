package order.model.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import order.model.vo.Order;
import static common.Template.getSqlSession;
public class OrderServiceImpl implements OrderService {

	@Override
	public ArrayList<Order> selectTotalPrice() {
		SqlSession session = getSqlSession();
		
		
		return null;
	}

}
