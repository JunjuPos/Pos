package payment.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import order.model.vo.OrderMenu;
import payment.model.service.PaymentServiceImpl;

/**
 * Servlet implementation class PaymentSelectServlet
 */
@WebServlet("/paymentSelect")
public class PaymentSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentSelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("결제 창에 띄우기위한 servlet");
		
		int tableNo = Integer.valueOf(request.getParameter("tableNo"));
		System.out.println(tableNo);
		
		PaymentServiceImpl ps = new PaymentServiceImpl();
		int totalPrice = ps.paymentPrice(tableNo);
		
		ArrayList<OrderMenu> orderList = new ArrayList<>();
		orderList = ps.selectOrderList(tableNo);
		
		if(!orderList.isEmpty())
		{
			request.setAttribute("tableNo", tableNo);		//테이블 번호
			request.setAttribute("totalPrice", totalPrice);	//테이블 총 가격
			request.setAttribute("orderList", orderList);	//주문 리스트
			request.getRequestDispatcher("/views/payment/payment.jsp").forward(request, response);	
		}
		else
		{
			
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
