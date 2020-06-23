package menu.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import member.model.vo.PageInfo;
import menu.model.vo.Menu;
import menu.model.vo.MenuPageInfo;

public class MenuDao {

	public int getListCount(SqlSession session) {
		int listCount = 0;
		
		listCount = session.selectOne("menuMapper.selectListCount");
		
		System.out.println("dao에서 매뉴 리스트 갯수 : " + listCount);
		
		return listCount;
	}

	public ArrayList<Menu> selectMenuList(SqlSession session, MenuPageInfo pi) {
		ArrayList<Menu> list = new ArrayList<>();
		
		int offset = (pi.getCurrentPage()-1)*pi.getMenuLimit();

		RowBounds rowBounds = new RowBounds(offset,pi.getMenuLimit());
		
		list = (ArrayList)session.selectList("menuMapper.selectMenuList", null, rowBounds);
		
		System.out.println("dao에서 매뉴 리스트 : " + list);
		
		return list;
	}

	public int insertMenu(SqlSession session, Menu menu) {
		int result = 0;
		
		result = session.insert("menuMapper.insertMenu",menu);
		
		System.out.println("dao에서 menu insert result : " + result);
		
		if(result>0) {
			session.commit();
		}else {
			session.rollback();
			session.close();
		}
		
		return result;
	}

}
