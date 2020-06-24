package member.model.service;

import java.util.ArrayList;

import member.model.vo.Member;
import member.model.vo.PageInfo;
import member.model.vo.SearchCondition;

public interface MemberService {

	int getListCount();
	
	ArrayList<Member> selectMemberList(PageInfo pi);



	int insertMember(Member m);

	Member selectMemberDetail(int mNo);

	int updateMember(Member m, int mNo);

	int updateMember(Member m);

	int getSearchResultListCount(SearchCondition sc);

	ArrayList<Member> selectSearchResultList(SearchCondition sc, PageInfo pi);
	
}
