package order.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import order.model.service.OrderServiceImpl;
import order.model.vo.OrderMenu;



/**
 * Servlet implementation class OrderInsert
 */
@WebServlet("/order/orderInsert")
public class OrderInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OrderServiceImpl oService = new OrderServiceImpl();
		
		
		
		String[] orderDate = request.getParameterValues("orderDate");
		String[] orderMenu = request.getParameterValues("orderMenu");
		String[] orderPrice = request.getParameterValues("orderPrice");
		String[] orderAmount = request.getParameterValues("orderAmount");
		String tableNo = request.getParameter("tableNo");
		
		int deleteResult = oService.deleteOrderList(tableNo);
		
		OrderMenu om = null;
		List<OrderMenu> orderList = new ArrayList<>();
//		  System.out.println("servlet orderNo :" + orderNo.length);
//		  System.out.println("servlet orderMenu :" + orderMenu.length);
//		  System.out.println("servlet orderAmount :" + orderAmount.length);
//		  System.out.println("servlet orderPrice :" + orderPrice.length);
//		  System.out.println("servlet orderDate :" + orderDate.length);
		

		  for(int i = 0 ; i < orderMenu.length ; i++) {
			  
//			  System.out.println("servlet orderMenu :" + orderMenu[i]);
//			  System.out.println("servlet orderAmount :" + orderAmount[i]);
//			  System.out.println("servlet orderPrice :" + orderPrice[i]);
//			  System.out.println("servlet orderDate :" + orderDate[i]);
//			  
			  om= new OrderMenu(orderAmount[i], orderMenu[i], orderDate[i], tableNo, orderPrice[i] );
			  orderList.add(om);
			  System.out.println("orderList : "+ orderList);
		  }	// for end
		 
		 int result = oService.insertOrderList(orderList);
	
//		 response.sendRedirect("/main/mainView");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
