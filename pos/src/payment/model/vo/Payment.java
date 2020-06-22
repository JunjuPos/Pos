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
	private int total_price;
	private int originPrice;
	
	public Payment() {
		super();
	}
	public Payment(int pay_row, int pay_no, Date pay_date, String pay_method, String pay_yn, int total_price,
			int originPrice) {
		super();
		this.pay_row = pay_row;
		this.pay_no = pay_no;
		this.pay_date = pay_date;
		this.pay_method = pay_method;
		this.pay_yn = pay_yn;
		this.total_price = total_price;
		this.originPrice = originPrice;
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
	public int getTotal_price() {
		return total_price;
	}
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
	public int getOriginPrice() {
		return originPrice;
	}
	public void setOriginPrice(int originPrice) {
		this.originPrice = originPrice;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Payment [pay_row=" + pay_row + ", pay_no=" + pay_no + ", pay_date=" + pay_date + ", pay_method="
				+ pay_method + ", pay_yn=" + pay_yn + ", total_price=" + total_price + ", originPrice=" + originPrice
				+ "]";
	}
	
	
	
	

}
