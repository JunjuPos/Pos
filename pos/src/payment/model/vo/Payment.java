package payment.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Payment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9136359375880192792L;
	
	private int pay_row;
	private int pay_no;
	private Date pay_date;
	private String pay_method;
	private String pay_yn;
	private int price;
	private int total_Price;
	
	public Payment() {
		super();
	}

	public Payment(int pay_row, int pay_no, Date pay_date, String pay_method, String pay_yn, int price,
			int total_Price) {
		super();
		this.pay_row = pay_row;
		this.pay_no = pay_no;
		this.pay_date = pay_date;
		this.pay_method = pay_method;
		this.pay_yn = pay_yn;
		this.price = price;
		this.total_Price = total_Price;
	}

	public int getPay_row() {
		return pay_row;
	}

	public void setPay_row(int pay_row) {
		this.pay_row = pay_row;
	}

	public int getPay_no() {
		return pay_no;
	}

	public void setPay_no(int pay_no) {
		this.pay_no = pay_no;
	}

	public Date getPay_date() {
		return pay_date;
	}

	public void setPay_date(Date pay_date) {
		this.pay_date = pay_date;
	}

	public String getPay_method() {
		return pay_method;
	}

	public void setPay_method(String pay_method) {
		this.pay_method = pay_method;
	}

	public String getPay_yn() {
		return pay_yn;
	}

	public void setPay_yn(String pay_yn) {
		this.pay_yn = pay_yn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotal_Price() {
		return total_Price;
	}

	public void setTotal_Price(int total_Price) {
		this.total_Price = total_Price;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Payment [pay_row=" + pay_row + ", pay_no=" + pay_no + ", pay_date=" + pay_date + ", pay_method="
				+ pay_method + ", pay_yn=" + pay_yn + ", price=" + price + ", total_Price=" + total_Price + "]";
	}
	
	
	
	
	

}
