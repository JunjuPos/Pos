package member.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import member.model.vo.Member;
import member.model.vo.PageInfo;

public class MemberDao {

	public int getListCount(SqlSession session) {
		
		int listCount = 0;
		
		listCount = session.selectOne("memberMapper.selectListCount");
		
		System.out.println("DAO에서 멤버 리스트 갯수 : " + listCount);
		
		return listCount;
	}

	
	public ArrayList<Member> selectMemberList(SqlSession session, PageInfo pi) {
		ArrayList<Member> list = new ArrayList<>();
		
		int offset = (pi.getCurrentPage()-1)*pi.getMemberLimit();
		
		RowBounds rowBounds = new RowBounds(offset, pi.getMemberLimit());
		
		list = (ArrayList)session.selectList("memberMapper.selectMemberList", null, rowBounds);
		
//		System.out.println("DAO에서 리스트 : " + list);
		
		if(list.isEmpty()) {
			session.close();
			
		}
		
		
		
		return list;
	}

}
