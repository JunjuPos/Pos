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
	
	public Menu() {
		super();
	}

	
	public Menu(String mENU, String pRICE, String mENU_YN, String cATEGORY) {
		super();
		MENU = mENU;
		PRICE = pRICE;
		MENU_YN = mENU_YN;
		CATEGORY = cATEGORY;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
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
		return "Menu [MENU=" + MENU + ", PRICE=" + PRICE + ", MENU_YN=" + MENU_YN + ", CATEGORY=" + CATEGORY + "]\n";
	}

	
	

	

}
