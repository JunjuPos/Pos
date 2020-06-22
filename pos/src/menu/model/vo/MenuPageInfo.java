package menu.model.vo;

public class MenuPageInfo {

	private int currentPage;
	private int listCount;
	private int limit;
	private int maxPage;
	private int startPage;
	private int endPage;
	
	private int menuLimit;

	public MenuPageInfo() {
	}

	public MenuPageInfo(int currentPage, int listCount, int limit, int maxPage, int startPage, int endPage,
			int menuLimit) {
		this.currentPage = currentPage;
		this.listCount = listCount;
		this.limit = limit;
		this.maxPage = maxPage;
		this.startPage = startPage;
		this.endPage = endPage;
		this.menuLimit = menuLimit;
	}

	public MenuPageInfo(int currentPage, int listCount, int limit, int maxPage, int startPage, int endPage) {
		this.currentPage = currentPage;
		this.listCount = listCount;
		this.limit = limit;
		this.maxPage = maxPage;
		this.startPage = startPage;
		this.endPage = endPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getListCount() {
		return listCount;
	}

	public void setListCount(int listCount) {
		this.listCount = listCount;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getMenuLimit() {
		return menuLimit;
	}

	public void setMenuLimit(int menuLimit) {
		this.menuLimit = menuLimit;
	}

	@Override
	public String toString() {
		return "MenuPageInfo [currentPage=" + currentPage + ", listCount=" + listCount + ", limit=" + limit
				+ ", maxPage=" + maxPage + ", startPage=" + startPage + ", endPage=" + endPage + ", menuLimit="
				+ menuLimit + "]";
	}
	
	
	
}