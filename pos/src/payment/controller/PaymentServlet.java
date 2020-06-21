package payment.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		System.out.println("paymentServlet");
		
		int resultPrice = Integer.valueOf(request.getParameter("resultPrice"));
		int price = Integer.valueOf(request.getParameter("price"));
		String payMethod = request.getParameter("payMethod");
		
		System.out.println("resultPrice : " + resultPrice + ", price : " + price + ", payMethod : " + payMethod);
		
		if(payMethod.equals("credit"))
		{
			
		}
		else
		{
			
		}
		
		//총 결재금액과 결제 금액과 같으면 바로 tablePage로 이동
		if(resultPrice == price)
		{
			
		}
		else if(resultPrice > price)
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
