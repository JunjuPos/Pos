package menu.model.service;

import static common.Template.getSqlSession;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import member.model.vo.PageInfo;
import menu.model.dao.MenuDao;
import menu.model.vo.Menu;
import menu.model.vo.MenuPageInfo;

public class MenuServiceImpl implements MenuService{

	@Override
	public int getListCount() {
		SqlSession session = getSqlSession();
		
		int listCount = new MenuDao().getListCount(session);
		
		session.close();
		
		return listCount;
	}

	@Override
	public ArrayList<Menu> selectMenuList(MenuPageInfo pi) {
		SqlSession session = getSqlSession();
		
		ArrayList<Menu> list = new MenuDao().selectMenuList(session,pi);
		
		session.close();
		
		return list;
	}

	@Override
	public int insertMenu(Menu menu) {
		SqlSession session = getSqlSession();
		
		int result = new MenuDao().insertMenu(session, menu);
		
		session.close();
		
		return result;
	}

	
}
