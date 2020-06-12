package order.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4496711903518213668L;

	private String orderPri;	// primary key
	private int order_no;		// 주문번호
	private int amount;			// 수량
	private String menu;		// 메뉴
	private Date orderDate;		// 주문시간
	private int tableNo;		// 테이블 번호
	private int payYn;			// 결제여부
	private int totalPrice;		// 합계금액
	
	public Order() {
		super();
	}
	public Order(String orderPri, int order_no, int amount, String menu, Date orderDate, int tableNo, int payYn,
			int totalPrice) {
		super();
		this.orderPri = orderPri;
		this.order_no = order_no;
		this.amount = amount;
		this.menu = menu;
		this.orderDate = orderDate;
		this.tableNo = tableNo;
		this.payYn = payYn;
		this.totalPrice = totalPrice;
	}
	public String getOrderPri() {
		return orderPri;
	}
	public void setOrderPri(String orderPri) {
		this.orderPri = orderPri;
	}
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getTableNo() {
		return tableNo;
	}
	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}
	public int getPayYn() {
		return payYn;
	}
	public void setPayYn(int payYn) {
		this.payYn = payYn;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Order [orderPri=" + orderPri + ", order_no=" + order_no + ", amount=" + amount + ", menu=" + menu
				+ ", orderDate=" + orderDate + ", tableNo=" + tableNo + ", payYn=" + payYn + ", totalPrice="
				+ totalPrice + "]\n";
	}
	
	
	
}
