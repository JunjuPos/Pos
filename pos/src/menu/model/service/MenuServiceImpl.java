package menu.model.service;

import static common.Template.getSqlSession;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import member.model.vo.PageInfo;
import menu.model.dao.MenuDao;
import menu.model.vo.Menu;
import menu.model.vo.Menu2;
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
	public ArrayList<Menu> selectMenuList(int option) {
		SqlSession session = getSqlSession();
		
		ArrayList<Menu> list = new MenuDao().selectMenuList(session,option);
		
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

	@Override
	public Menu selectMenuDetail(String mENU) {
		SqlSession session = getSqlSession();
		
		Menu mn = null;
		
		mn = new MenuDao().selectMenuDetail(session, mENU);
		
		session.close();
		
		return mn;
	}

	@Override
	public int updateMenu(Menu2 m) {
		SqlSession session = getSqlSession();
		
		int result = new MenuDao().updateMenu(session, m);
		
		System.out.println("servie에서 updateResult : " + result);
		session.close();
		
		return result;
	}

	@Override
	public int updateMenu(Menu m) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
