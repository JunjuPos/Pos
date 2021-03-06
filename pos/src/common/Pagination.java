package common;

import member.model.vo.PageInfo;

public class Pagination {

	public static PageInfo getPageInfo(int currentPage, int listCount) {
		
		PageInfo pi = null;
		
		int pageLimit = 10;
		int maxPage;
		int startPage;
		int endPage;
		
		int memberLimit = 5;
		
		// 다시 보기!!!
		maxPage = (int)((double)listCount/memberLimit + 0.9);
		
		startPage = (((int)((double)currentPage/pageLimit + 0.9)) -1) * pageLimit +1;
		
		endPage = startPage + pageLimit -1;
		
		if(maxPage < endPage) {
			endPage = maxPage;
		}
		
		pi = new PageInfo(currentPage, listCount, pageLimit, maxPage, startPage, endPage, memberLimit);
		
		
		return pi;
	}
	
	
	
}
