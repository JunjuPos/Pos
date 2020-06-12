package menu.model.vo;

import java.io.Serializable;

public class Menu implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4385005195950385242L;
	private String MENU;
	private int RPICE;
	private String MENU_YN;
	private String CATEGOR;
	
	public Menu() {
		super();
	}
	public Menu(String mENU, int rPICE, String mENU_YN, String cATEGOR) {
		super();
		MENU = mENU;
		RPICE = rPICE;
		MENU_YN = mENU_YN;
		CATEGOR = cATEGOR;
	}
	public String getMENU() {
		return MENU;
	}
	public void setMENU(String mENU) {
		MENU = mENU;
	}
	public int getRPICE() {
		return RPICE;
	}
	public void setRPICE(int rPICE) {
		RPICE = rPICE;
	}
	public String getMENU_YN() {
		return MENU_YN;
	}
	public void setMENU_YN(String mENU_YN) {
		MENU_YN = mENU_YN;
	}
	public String getCATEGOR() {
		return CATEGOR;
	}
	public void setCATEGOR(String cATEGOR) {
		CATEGOR = cATEGOR;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Menu [MENU=" + MENU + ", RPICE=" + RPICE + ", MENU_YN=" + MENU_YN + ", CATEGOR=" + CATEGOR + "]";
	}
	
}
