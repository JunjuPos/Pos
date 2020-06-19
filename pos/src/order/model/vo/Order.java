package order.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4496711903518213668L;


	private int ORDER_NO;		// 주문번호
	private String MENU;		// 메뉴
	private int AMOUNT;			// 수량
	private Date ORDER_DATE;	// 주문시간
	private int TABLE_NO;		// 테이블 번호
	private int PAY_YN;			// 결제여부
	private int PRICE;			// 합계 가격
	
	public Order() {
		super();
	}

	public Order(int oRDER_NO, String mENU, int aMOUNT, Date oRDER_DATE, int tABLE_NO, int pAY_YN, int pRICE) {
		super();
		ORDER_NO = oRDER_NO;
		MENU = mENU;
		AMOUNT = aMOUNT;
		ORDER_DATE = oRDER_DATE;
		TABLE_NO = tABLE_NO;
		PAY_YN = pAY_YN;
		PRICE = pRICE;
	}

	public int getORDER_NO() {
		return ORDER_NO;
	}

	public void setORDER_NO(int oRDER_NO) {
		ORDER_NO = oRDER_NO;
	}

	public String getMENU() {
		return MENU;
	}

	public void setMENU(String mENU) {
		MENU = mENU;
	}

	public int getAMOUNT() {
		return AMOUNT;
	}

	public void setAMOUNT(int aMOUNT) {
		AMOUNT = aMOUNT;
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

	public int getPRICE() {
		return PRICE;
	}

	public void setPRICE(int pRICE) {
		PRICE = pRICE;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Order [ORDER_NO=" + ORDER_NO + ", MENU=" + MENU + ", AMOUNT=" + AMOUNT + ", ORDER_DATE=" + ORDER_DATE
				+ ", TABLE_NO=" + TABLE_NO + ", PAY_YN=" + PAY_YN + ", PRICE=" + PRICE + "]\n";
	}

	
	
	
}
