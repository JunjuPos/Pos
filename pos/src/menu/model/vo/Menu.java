package menu.model.vo;

import java.io.Serializable;

public class Menu implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4385005195950385242L;
	private String MENU;
	private String PRICE;
	private String MENU_YN;
	private String CATEGORY;
	
	private int CATE_NO;
	private int inPrice;
	private String name;
	
	
	public Menu() {
		super();
	}
	
	public Menu(String mENU, String mENU_YN, String cATEGORY, int cATE_NO, int inPrice) {
		MENU = mENU;
		MENU_YN = mENU_YN;
		CATEGORY = cATEGORY;
		CATE_NO = cATE_NO;
		this.inPrice = inPrice;
	}

	public Menu(String mENU, String pRICE, String mENU_YN, String cATEGORY) {
		super();
		MENU = mENU;
		PRICE = pRICE;
		MENU_YN = mENU_YN;
		CATEGORY = cATEGORY;
	}

	
	
	public Menu(String mENU, String pRICE, String mENU_YN, String cATEGORY, int cATE_NO) {
		MENU = mENU;
		PRICE = pRICE;
		MENU_YN = mENU_YN;
		CATEGORY = cATEGORY;
		CATE_NO = cATE_NO;
	}

	
	

	public Menu(String mENU, String mENU_YN, String cATEGORY, int cATE_NO, int inPrice, String name) {
		MENU = mENU;
		MENU_YN = mENU_YN;
		CATEGORY = cATEGORY;
		CATE_NO = cATE_NO;
		this.inPrice = inPrice;
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	public int getCATE_NO() {
		return CATE_NO;
	}


	public void setCATE_NO(int cATE_NO) {
		CATE_NO = cATE_NO;
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

	
	
	
	public int getInPrice() {
		return inPrice;
	}




	public void setInPrice(int inPrice) {
		this.inPrice = inPrice;
	}


	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Menu [MENU=" + MENU + ", PRICE=" + PRICE + ", MENU_YN=" + MENU_YN + ", CATEGORY=" + CATEGORY
				+ ", CATE_NO=" + CATE_NO + ", inPrice=" + inPrice + ", name=" + name + "]";
	}

	

	

}
