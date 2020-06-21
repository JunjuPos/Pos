package member.model.service;

import java.util.ArrayList;

import member.model.vo.Member;
import member.model.vo.PageInfo;

public interface MemberService {

	int getListCount();
	
	ArrayList<Member> selectMemberList(PageInfo pi);

	Member selectMemberDetail(String mNo);

	int insertMember(Member m);
	
}
