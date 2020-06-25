package salesTotal.model.vo;

public class SalesTotalMenu {

	private String salesMenu;
	private int salesCount;
	private int salesCountPrice;
	
	public SalesTotalMenu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SalesTotalMenu(String salesMenu, int salesCount, int salesCountPrice) {
		super();
		this.salesMenu = salesMenu;
		this.salesCount = salesCount;
		this.salesCountPrice = salesCountPrice;
	}
	public String getSalesMenu() {
		return salesMenu;
	}
	public void setSalesMenu(String salesMenu) {
		this.salesMenu = salesMenu;
	}
	public int getSalesCount() {
		return salesCount;
	}
	public void setSalesCount(int salesCount) {
		this.salesCount = salesCount;
	}
	public int getSalesCountPrice() {
		return salesCountPrice;
	}
	public void setSalesCountPrice(int salesCountPrice) {
		this.salesCountPrice = salesCountPrice;
	}
	@Override
	public String toString() {
		return "SalesTotalMenu [salesMenu=" + salesMenu + ", salesCount=" + salesCount + ", salesCountPrice="
				+ salesCountPrice + "]";
	}
	
	
	
}
