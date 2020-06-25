package menu.model.vo;

public class Menu2 {

	private String oriName;
	private String name;
	private int price;
	private String menuStatus;
	private String category;
	private int cateNo;
	
	
	public Menu2() {
	}


	public Menu2(String oriName, String name, int price, String menuStatus, String category, int cateNo) {
		this.oriName = oriName;
		this.name = name;
		this.price = price;
		this.menuStatus = menuStatus;
		this.category = category;
		this.cateNo = cateNo;
	}


	protected String getOriName() {
		return oriName;
	}


	protected void setOriName(String oriName) {
		this.oriName = oriName;
	}


	protected String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}


	protected int getPrice() {
		return price;
	}


	protected void setPrice(int price) {
		this.price = price;
	}


	protected String getMenuStatus() {
		return menuStatus;
	}


	protected void setMenuStatus(String menuStatus) {
		this.menuStatus = menuStatus;
	}


	protected String getCategory() {
		return category;
	}


	protected void setCategory(String category) {
		this.category = category;
	}


	protected int getCateNo() {
		return cateNo;
	}


	protected void setCateNo(int cateNo) {
		this.cateNo = cateNo;
	}


	@Override
	public String toString() {
		return "Menu2 [oriName=" + oriName + ", name=" + name + ", price=" + price + ", menuStatus=" + menuStatus
				+ ", category=" + category + ", cateNo=" + cateNo + "]";
	}

	

	
	
}
