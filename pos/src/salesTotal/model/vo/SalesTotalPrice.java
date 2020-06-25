package salesTotal.model.vo;

import java.sql.Date;

public class SalesTotalPrice {
	private Date salesDate;
	private int salesTotal;
	public SalesTotalPrice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalesTotalPrice(Date salesDate, int salesTotal) {
		super();
		this.salesDate = salesDate;
		this.salesTotal = salesTotal;
	}
	public Date getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}
	public int getSalesTotal() {
		return salesTotal;
	}
	public void setSalesTotal(int salesTotal) {
		this.salesTotal = salesTotal;
	}
	@Override
	public String toString() {
		return "SalesTotalPrice [salesDate=" + salesDate + ", salesTotal=" + salesTotal + "]";
	}
	
	
	

}
