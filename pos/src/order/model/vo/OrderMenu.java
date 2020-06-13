package order.model.vo;

public class OrderMenu {

	//JUMUN
	private String ORDER_PRI;
	private String ORDER_NO;
	private String AMOUNT;
	private String MENU2;
	private String ORDER_DATE;
	private String TABLE_NO;
	private String PAY_YN;
	private String TOTAL_PRICE;
	// MENU
	private String MENU;
	private String PRICE;
	private String MENU_YN;
	private String CATEGORY;
	
	public OrderMenu() {
		super();
	}
	
	public OrderMenu(String oRDER_NO,String oRDER_DATE,String mENU2, String pRICE, String aMOUNT,   String tABLE_NO ) {
		super();
		ORDER_NO = oRDER_NO;
		AMOUNT = aMOUNT;
		MENU2 = mENU2;
		ORDER_DATE = oRDER_DATE;
		TABLE_NO = tABLE_NO;
		PRICE = pRICE;
	}

	public OrderMenu(String oRDER_PRI, String oRDER_NO, String aMOUNT, String mENU2, String oRDER_DATE, String tABLE_NO,
			String pAY_YN, String tOTAL_PRICE, String mENU, String pRICE, String mENU_YN, String cATEGORY) {
		super();
		ORDER_PRI = oRDER_PRI;
		ORDER_NO = oRDER_NO;
		AMOUNT = aMOUNT;
		MENU2 = mENU2;
		ORDER_DATE = oRDER_DATE;
		TABLE_NO = tABLE_NO;
		PAY_YN = pAY_YN;
		TOTAL_PRICE = tOTAL_PRICE;
		MENU = mENU;
		PRICE = pRICE;
		MENU_YN = mENU_YN;
		CATEGORY = cATEGORY;
	}
	public String getORDER_PRI() {
		return ORDER_PRI;
	}
	public void setORDER_PRI(String oRDER_PRI) {
		ORDER_PRI = oRDER_PRI;
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
	public String getMENU2() {
		return MENU2;
	}
	public void setMENU2(String mENU2) {
		MENU2 = mENU2;
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
	public String getTOTAL_PRICE() {
		return TOTAL_PRICE;
	}
	public void setTOTAL_PRICE(String tOTAL_PRICE) {
		TOTAL_PRICE = tOTAL_PRICE;
	}
	public String getMENU() {
		return MENU;
	}
	public void setMENU(String mENU) {
		MENU = mENU;
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
	@Override
	public String toString() {
		return "OrderMenu [ORDER_PRI=" + ORDER_PRI + ", ORDER_NO=" + ORDER_NO + ", AMOUNT=" + AMOUNT + ", MENU2="
				+ MENU2 + ", ORDER_DATE=" + ORDER_DATE + ", TABLE_NO=" + TABLE_NO + ", PAY_YN=" + PAY_YN
				+ ", TOTAL_PRICE=" + TOTAL_PRICE + ", MENU=" + MENU + ", PRICE=" + PRICE + ", MENU_YN=" + MENU_YN
				+ ", CATEGORY=" + CATEGORY + "]";
	}
	
	
	
	
	
}
