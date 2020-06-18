package salesTotal.model.controller;

import static common.Template.getSqlSession;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import salesTotal.model.dao.SalesCalendarDao;
import salesTotal.model.vo.SalesTotalPrice;

public class SalesCalendarServiceImpl implements SalesCalendarService{

	@Override
	public List<SalesTotalPrice> salesTotalPriceaboutMonth() {
		SqlSession session = getSqlSession();
		List<SalesTotalPrice> totalPriceListAboutMonth = new SalesCalendarDao().salesTotalPriceaboutMonth(session);
		
		return totalPriceListAboutMonth;
	}

}
