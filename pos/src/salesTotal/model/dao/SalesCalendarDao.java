package salesTotal.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import salesTotal.model.vo.SalesTotalPrice;

public class SalesCalendarDao {

	public List<SalesTotalPrice> salesTotalPriceaboutMonth(SqlSession session) {

		List<SalesTotalPrice> totalPriceList = session.selectList("salesMapper.selectSalesTotalPriceList");
		
		/* sales-mapper.xml -> SalesCalendarDao Data확인용 
		 * for(int i=0;i<totalPriceList.size();i++) {
		 * System.out.println("ArrayList("+i+")="+totalPriceList.get(i)); }
		 */
		return totalPriceList;
	}

}
