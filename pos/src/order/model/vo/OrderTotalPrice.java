package order.model.vo;

public class OrderTotalPrice {
	
	private int TABLE_NO;
	private int TOTAL_PRICE;
	
	
	public OrderTotalPrice() {
		super();
	}


	public OrderTotalPrice(int tABLE_NO, int tOTAL_PRICE) {
		super();
		TABLE_NO = tABLE_NO;
		TOTAL_PRICE = tOTAL_PRICE;
	}


	public int getTABLE_NO() {
		return TABLE_NO;
	}


	public void setTABLE_NO(int tABLE_NO) {
		TABLE_NO = tABLE_NO;
	}


	public int getTOTAL_PRICE() {
		return TOTAL_PRICE;
	}


	public void setTOTAL_PRICE(int tOTAL_PRICE) {
		TOTAL_PRICE = tOTAL_PRICE;
	}


	@Override
	public String toString() {
		return "OrderTotalPrice [TABLE_NO=" + TABLE_NO + ", TOTAL_PRICE=" + TOTAL_PRICE + "]";
	}


	
	}
