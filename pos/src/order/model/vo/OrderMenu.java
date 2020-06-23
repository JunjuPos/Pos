package order.model.vo;

public class OrderMenu {

	//JUMUN
	private String ORDER_NO;
	private String AMOUNT;
	private String MENU;
	private String ORDER_DATE;
	private String TABLE_NO;
	private String PAY_YN;
	
	// MENU
	private String PRICE;
	private String MENU_YN;
	private String CATEGORY;
	private String MENUPRICE;
	
	public OrderMenu() {
		super();
	}

	
	// order insert 생성자
	public OrderMenu(String aMOUNT, String mENU, String oRDER_DATE, String tABLE_NO, String pRICE) {
		super();
		AMOUNT = aMOUNT;
		MENU = mENU;
		ORDER_DATE = oRDER_DATE;
		TABLE_NO = tABLE_NO;
		PRICE = pRICE;
	}


	public OrderMenu(String oRDER_NO, String aMOUNT, String mENU, String oRDER_DATE, String tABLE_NO, String pAY_YN,
			String pRICE, String mENU_YN, String cATEGORY, String mENUPRICE) {
		super();
		ORDER_NO = oRDER_NO;
		AMOUNT = aMOUNT;
		MENU = mENU;
		ORDER_DATE = oRDER_DATE;
		TABLE_NO = tABLE_NO;
		PAY_YN = pAY_YN;
		PRICE = pRICE;
		MENU_YN = mENU_YN;
		CATEGORY = cATEGORY;
		MENUPRICE = mENUPRICE;
	}


	public String getORDER_NO() {
		return ORDER_NO;
	}


	public void setORDER_NO(String oRDER_NO) {
		ORDER_NO = oRDER_NO;
	}


	public String getAMOUNT() {
		return AMOUNT;
	}


	public void setAMOUNT(String aMOUNT) {
		AMOUNT = aMOUNT;
	}


	public String getMENU() {
		return MENU;
	}


	public void setMENU(String mENU) {
		MENU = mENU;
	}


	public String getORDER_DATE() {
		return ORDER_DATE;
	}


	public void setORDER_DATE(String oRDER_DATE) {
		ORDER_DATE = oRDER_DATE;
	}


	public String getTABLE_NO() {
		return TABLE_NO;
	}


	public void setTABLE_NO(String tABLE_NO) {
		TABLE_NO = tABLE_NO;
	}


	public String getPAY_YN() {
		return PAY_YN;
	}


	public void setPAY_YN(String pAY_YN) {
		PAY_YN = pAY_YN;
	}


	public String getPRICE() {
		return PRICE;
	}


	public void setPRICE(String pRICE) {
		PRICE = pRICE;
	}


	public String getMENU_YN() {
		return MENU_YN;
	}


	public void setMENU_YN(String mENU_YN) {
		MENU_YN = mENU_YN;
	}


	public String getCATEGORY() {
		return CATEGORY;
	}


	public void setCATEGORY(String cATEGORY) {
		CATEGORY = cATEGORY;
	}


	public String getMENUPRICE() {
		return MENUPRICE;
	}


	public void setMENUPRICE(String mENUPRICE) {
		MENUPRICE = mENUPRICE;
	}


	@Override
	public String toString() {
		return "OrderMenu [ORDER_NO=" + ORDER_NO + ", AMOUNT=" + AMOUNT + ", MENU=" + MENU + ", ORDER_DATE="
				+ ORDER_DATE + ", TABLE_NO=" + TABLE_NO + ", PAY_YN=" + PAY_YN + ", PRICE=" + PRICE + ", MENU_YN="
				+ MENU_YN + ", CATEGORY=" + CATEGORY + ", MENUPRICE=" + MENUPRICE + "]";
	}


	
	
	
}
