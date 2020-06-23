package payment.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.impl.protocol.RequestDispatcherRegistryImpl;

import order.model.vo.OrderMenu;
import payment.exception.BillException;
import payment.model.service.PaymentServiceImpl;
import payment.model.vo.Bill;
import payment.model.vo.Payment;

/**
 * Servlet implementation class PaymentServlet
 */
@WebServlet("/payment")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PaymentServiceImpl paymentServiceImpl = new PaymentServiceImpl();
		ArrayList<OrderMenu> orderList = new ArrayList<>(); 
		ArrayList<Bill> billList = new ArrayList<>();
		
		System.out.println("paymentServlet");
		
		int tableNo = Integer.valueOf(request.getParameter("tableNo"));
		int resultPrice = Integer.valueOf(request.getParameter("resultPrice"));
		int price = Integer.valueOf(request.getParameter("price"));
		String payMethod = request.getParameter("payMethod");
		
		System.out.println("tableNo : " + tableNo + ", resultPrice : " + resultPrice + ", price : " + price + ", payMethod : " + payMethod);
		
		//처음 최종 결제금액 가져오기
		int originPrice = paymentServiceImpl.paymentPrice(tableNo);
		
		//해당 테이블의 메뉴, 메뉴합계 금액, 수량 가져오기
		orderList = paymentServiceImpl.selectOrderList(tableNo);
		
		//billList에 넣기
		
		for(OrderMenu o : orderList)
		{
			Bill b = new Bill();
			b.setAmount(Integer.valueOf(o.getAMOUNT()));
			b.setMenu(o.getMENU());
			b.setPrice(Integer.valueOf(o.getPRICE()));
			b.setTotalPrice(originPrice);
			billList.add(b);
		}
		
		//payment객체 만들기
		Payment payment = new Payment();
		payment.setPay_method(payMethod);
		payment.setPrice(price);
		payment.setTotal_Price(originPrice);
		
		//billList출력
//		for(Bill b : billList)
//		{
//			System.out.println(b);
//		}
		//외상
		if(payMethod.equals("credit"))
		{
			//총 결재금액과 결제 금액과 같으면 바로 tablePage로 이동
			if(resultPrice == price)
			{
				//영수증 테이블 insert
				
				//payment insert

				//jumun테이블에 해당 테이블번호의 데이터 delete
				
				
			}
			else if(resultPrice > price)
			{
				//payment insert
				
				
			}
		}
		//현금 및 카드
		else
		{
			//총 결재금액과 결제 금액과 같으면 바로 tablePage로 이동
			if(resultPrice == price)
			{
				try {
					//영수증 테이블 insert
					int billInsert = paymentServiceImpl.billInsert(billList);
					//payment insert
					int paymentInsert = paymentServiceImpl.paymentInsert(payment);
					//jumun테이블에 해당 테이블번호의 데이터 delete
					int jumunDelete = paymentServiceImpl.jumunDelete(tableNo);
					
				} catch (BillException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				
				request.getRequestDispatcher("/main/mainView").forward(request, response);
				
			}
			else if(resultPrice > price)
			{
				//payment insert
				
			}
		}
		
		
		
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
