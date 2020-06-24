package member.model.service;

import static common.Template.getSqlSession;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import member.model.dao.MemberDao;
import member.model.vo.Member;
import member.model.vo.PageInfo;
import member.model.vo.SearchCondition;

public class MemberServiceImpl implements MemberService{

	@Override
	public int getListCount() {
		SqlSession session = getSqlSession();
		
		int listCount = new MemberDao().getListCount(session);
		
		session.close();
		
		return listCount;
	}

	
	@Override
	public ArrayList<Member> selectMemberList(PageInfo pi) {
		SqlSession session = getSqlSession();
		
		ArrayList<Member> list = new MemberDao().selectMemberList(session, pi);
		
		session.close();
		
		return list;
	}

	@Override
	public Member selectMemberDetail(int mNo) {
		SqlSession session = getSqlSession();
		
		Member m = null;
		
		m = new MemberDao().selectMemberDetail(session, mNo);
		
		session.close();
		
		return m;
	}

	@Override
	public int insertMember(Member m) {
		
		SqlSession session = getSqlSession();
		
		int result = new MemberDao().insertMember(session,m);
		
		session.close();
		
		return result;
	}

	@Override
	public int updateMember(Member m) {
		
		SqlSession session = getSqlSession();
		
		int result = new MemberDao().updateMember(session, m);
		
		session.close();
		
		return result;
	}


	@Override
	public int updateMember(Member m, int mNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSearchResultListCount(SearchCondition sc) {
		
		SqlSession session = getSqlSession();
		
		int listCount = new MemberDao().getResultListCount(session, sc);
		
		session.close();
		
		return listCount;
	}

	@Override
	public ArrayList<Member> selectSearchResultList(SearchCondition sc, PageInfo pi) {
		
		SqlSession session = getSqlSession();
		
		ArrayList<Member> list = new MemberDao().selectSearchResultList(session,sc,pi);
		
		session.close();
		
		return list;
	}

	
	}


