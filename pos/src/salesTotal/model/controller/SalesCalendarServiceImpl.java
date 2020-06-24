package salesTotal.model.controller;

import static common.Template.getSqlSession;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import salesTotal.model.dao.SalesDao;
import salesTotal.model.vo.SalesTotalPrice;

public class SalesCalendarServiceImpl implements SalesService{

	@Override
	public List<SalesTotalPrice> salesTotalPriceaboutMonth() {
		SqlSession session = getSqlSession();
		List<SalesTotalPrice> totalPriceListAboutMonth = new SalesDao().salesTotalPriceaboutMonth(session);
		
		return totalPriceListAboutMonth;
	}
	
	@Override
	public List<SalesTotalPrice> salesCardTotalPrice() {
		SqlSession session = getSqlSession();
		List<SalesTotalPrice> totalCardPriceList = new SalesDao().salesCardTotalPrice(session);
		return totalCardPriceList;
	}

	@Override
	public List<SalesTotalPrice> salesCashTotalPrice() {
		SqlSession session = getSqlSession();
		List<SalesTotalPrice> totalCashPriceList = new SalesDao().salesCashTotalPrice(session);
		return totalCashPriceList;
	}

	public List<SalesTotalPrice> salesCreditTotalPrice() {
		SqlSession session = getSqlSession();
		List<SalesTotalPrice> totalCashPriceList = new SalesDao().salesCreditTotalPrice(session);
		return totalCashPriceList;
	}

}
