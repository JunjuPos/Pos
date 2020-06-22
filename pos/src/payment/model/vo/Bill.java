package payment.model.vo;

import java.io.Serializable;

public class Bill implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5467538657780592292L;

	
	private int bill_row;	//영수증 행번호 primary
	private int bi_no;		//영수증 번호
	private String menu;	//메뉴
	private int price;		//가격
	private int amount;		//수량
	private int pay_row;	//결제 행번호
	
	public Bill() {
		super();
	}
	public Bill(int bill_row, int bi_no, String menu, int price, int amount, int pay_row) {
		super();
		this.bill_row = bill_row;
		this.bi_no = bi_no;
		this.menu = menu;
		this.price = price;
		this.amount = amount;
		this.pay_row = pay_row;
	}
	public int getBill_row() {
		return bill_row;
	}
	public void setBill_row(int bill_row) {
		this.bill_row = bill_row;
	}
	public int getBi_no() {
		return bi_no;
	}
	public void setBi_no(int bi_no) {
		this.bi_no = bi_no;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPay_row() {
		return pay_row;
	}
	public void setPay_row(int pay_row) {
		this.pay_row = pay_row;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Bill [bill_row=" + bill_row + ", bi_no=" + bi_no + ", menu=" + menu + ", price=" + price + ", amount="
				+ amount + ", pay_row=" + pay_row + "]";
	}
	
	
}
