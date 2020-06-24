package common;

import menu.model.vo.MenuPageInfo;

public class MenuPagination {

	public static MenuPageInfo getPageInfo(int currentPage, int listCount) {
		
		MenuPageInfo pi = null;
		
		int pageLimit = 10;
		int maxPage;
		int startPage;
		int endPage;
		
		int memberLimit = 7;
		
		// 다시 보기!!!
		maxPage = (int)((double)listCount/memberLimit + 0.95);
		
		startPage = (((int)((double)currentPage/pageLimit + 0.95)) -1) * pageLimit +1;
		
		endPage = startPage + pageLimit -1;
		
		if(maxPage < endPage) {
			endPage = maxPage;
		}
		
		pi = new MenuPageInfo(currentPage, listCount, pageLimit, maxPage, startPage, endPage, memberLimit);
		
		
		return pi;
	}
	
	
	
}
