package salesTotal.model.controller;

import static common.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import menu.model.vo.Menu;
import salesTotal.model.dao.SalesDao;
import salesTotal.model.vo.SalesTotalMenu;

public class SalesMenuServiceImpl implements MenuService{

	@Override
	public List<SalesTotalMenu> selectMenuCountList() {
		SalesDao salesDao = new SalesDao();
		SqlSession session = getSqlSession();
		List<SalesTotalMenu> menuCountList = salesDao.selectMenuCountList(session);
		
		return menuCountList;
	}

	public List<Menu> selectMenuList() {
		SalesDao salesDao = new SalesDao();
		SqlSession session = getSqlSession();
		List<Menu> menu = salesDao.selectMenuList(session);
		return menu;
	}



}
