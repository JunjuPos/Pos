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
		
		System.out.println("DAO에서 리스트 : " + list);
		
		if(list.isEmpty()) {
			session.close();
			
		}
		
		
		
		return list;
	}


	public Member selectMemberDetail(SqlSession session, int mNo) {
		
		Member m = null;
		
		m = session.selectOne("memberMapper.selectMemberDetail", mNo);
		
		if(m == null) {
			session.close();
		}
		
//		System.out.println("dao에서 detail객체" + m);
		
		return m;
	}


	public int insertMember(SqlSession session, Member m) {
		
		int result = 0;
		
		result = session.insert("memberMapper.insertMember", m);
		
//		System.out.println("dao에서 result : " + result);
		
		if(result > 0) {
			session.commit();
		}else {
			session.rollback();
			session.close();
		}
		
		return result;
	}


	public int updateMember(SqlSession session, Member m) {
		
		int result = 0;
		
		result = session.update("memberMapper.insertMember", m);
		
//		System.out.println("dao에서 update result : " + result);
		
		if(result>0) {
			session.commit();
		}else {
			session.rollback();
			session.close();
		}
		
		return result;
	}

}
