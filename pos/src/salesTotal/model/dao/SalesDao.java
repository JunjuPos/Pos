package salesTotal.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import menu.model.vo.Menu;
import salesTotal.model.vo.SalesTotalMenu;
import salesTotal.model.vo.SalesTotalPrice;

public class SalesDao {

	public List<SalesTotalPrice> salesTotalPriceaboutMonth(SqlSession session) {

		List<SalesTotalPrice> totalPriceList = session.selectList("salesMapper.selectSalesTotalPriceList");
		
		/* sales-mapper.xml -> SalesCalendarDao Data확인용 
		 * for(int i=0;i<totalPriceList.size();i++) {
		 * System.out.println("ArrayList("+i+")="+totalPriceList.get(i)); }
		 */
		return totalPriceList;
	}

	public List<SalesTotalPrice> salesCardTotalPrice(SqlSession session) {
		List<SalesTotalPrice> CardTotalPriceList = session.selectList("salesMapper.selectSalesCardTotalPriceList");
		return CardTotalPriceList;
	}

	public List<SalesTotalPrice> salesCashTotalPrice(SqlSession session) {
		List<SalesTotalPrice> CashTotalPriceList = session.selectList("salesMapper.selectSalesCashTotalPriceList");
		return CashTotalPriceList;
	}

	public List<SalesTotalMenu> selectMenuCountList(SqlSession session) {
		List<SalesTotalMenu> menuCountList = session.selectList("salesMapper.selectSalesMenuList");
		return menuCountList;
	}

	public List<Menu> selectMenuList(SqlSession session) {
		List<Menu> menu = session.selectList("orderMapper.menuList");
		return menu;
	}

}
