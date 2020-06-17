package member.model.service;

import static common.Template.getSqlSession;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import member.model.dao.MemberDao;
import member.model.vo.Member;
import member.model.vo.PageInfo;

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

	
	}


