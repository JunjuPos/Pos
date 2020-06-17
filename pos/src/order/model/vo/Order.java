package order.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4496711903518213668L;

	private String ORDER_PRI;	// primary key
	private int ORDER_NO;		// 주문번호
	private int AMOUNT;			// 수량
	private String MENU2;		// 메뉴
	private Date ORDER_DATE;		// 주문시간
	private int TABLE_NO;		// 테이블 번호
	private int PAY_YN;			// 결제여부
	private int TOTAL_PRICE;		// 합계금액
	
	public Order() {
		super();
	}

	public Order(String oRDER_PRI, int oRDER_NO, int aMOUNT, String mENU2, Date oRDER_DATE, int tABLE_NO, int pAY_YN,
			int tOTAL_PRICE) {
		super();
		ORDER_PRI = oRDER_PRI;
		ORDER_NO = oRDER_NO;
		AMOUNT = aMOUNT;
		MENU2 = mENU2;
		ORDER_DATE = oRDER_DATE;
		TABLE_NO = tABLE_NO;
		PAY_YN = pAY_YN;
		TOTAL_PRICE = tOTAL_PRICE;
	}

	public String getORDER_PRI() {
		return ORDER_PRI;
	}

	public void setORDER_PRI(String oRDER_PRI) {
		ORDER_PRI = oRDER_PRI;
	}

	public int getORDER_NO() {
		return ORDER_NO;
	}

	public void setORDER_NO(int oRDER_NO) {
		ORDER_NO = oRDER_NO;
	}

	public int getAMOUNT() {
		return AMOUNT;
	}

	public void setAMOUNT(int aMOUNT) {
		AMOUNT = aMOUNT;
	}

	public String getMENU2() {
		return MENU2;
	}

	public void setMENU2(String mENU2) {
		MENU2 = mENU2;
	}

	public Date getORDER_DATE() {
		return ORDER_DATE;
	}

	public void setORDER_DATE(Date oRDER_DATE) {
		ORDER_DATE = oRDER_DATE;
	}

	public int getTABLE_NO() {
		return TABLE_NO;
	}

	public void setTABLE_NO(int tABLE_NO) {
		TABLE_NO = tABLE_NO;
	}

	public int getPAY_YN() {
		return PAY_YN;
	}

	public void setPAY_YN(int pAY_YN) {
		PAY_YN = pAY_YN;
	}

	public int getTOTAL_PRICE() {
		return TOTAL_PRICE;
	}

	public void setTOTAL_PRICE(int tOTAL_PRICE) {
		TOTAL_PRICE = tOTAL_PRICE;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Order [ORDER_PRI=" + ORDER_PRI + ", ORDER_NO=" + ORDER_NO + ", AMOUNT=" + AMOUNT + ", MENU2=" + MENU2
				+ ", ORDER_DATE=" + ORDER_DATE + ", TABLE_NO=" + TABLE_NO + ", PAY_YN=" + PAY_YN + ", TOTAL_PRICE="
				+ TOTAL_PRICE + "]\n";
	}

	
	
}
