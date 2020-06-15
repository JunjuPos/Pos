package order.controller;

import java.io.IOException;
import java.util.ArrayList;

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
		String[] orderNo = request.getParameterValues("orderNo");
		String[] orderDate = request.getParameterValues("orderDate");
		String[] orderMenu = request.getParameterValues("orderMenu");
		String[] orderPrice = request.getParameterValues("orderPrice");
		String[] orderAmount = request.getParameterValues("orderAmount");
		String tableNo = request.getParameter("tableNo");
		int orderUpdate = 0;
		int orderInsert = 0;
		String inOrderNo = "";
		OrderMenu om = null;
		ArrayList<OrderMenu> orderList = new ArrayList<>();
//		  System.out.println("servlet orderNo :" + orderNo.length);
//		  System.out.println("servlet orderMenu :" + orderMenu.length);
//		  System.out.println("servlet orderAmount :" + orderAmount.length);
//		  System.out.println("servlet orderPrice :" + orderPrice.length);
//		  System.out.println("servlet orderDate :" + orderDate.length);
		

		  for(int i = 0 ; i < orderMenu.length ; i++) {
//			  System.out.println("servlet orderNo : "+ orderNo[i]);
//			  System.out.println("servlet orderMenu :" + orderMenu[i]);
//			  System.out.println("servlet orderAmount :" + orderAmount[i]);
//			  System.out.println("servlet orderPrice :" + orderPrice[i]);
//			  System.out.println("servlet orderDate :" + orderDate[i]);
			  
			  if(!orderNo[i].equals("zero")) {
				  System.out.println("servlet orderNo : " +  orderNo[i]);
				  inOrderNo = orderNo[i];
				  System.out.println("servlet inOrderNo : " + inOrderNo);
				
			  }else {
				  inOrderNo = "zero";
			  }
			  om= new OrderMenu(inOrderNo, orderMenu[i], orderDate[i], orderPrice[i], orderAmount[i], tableNo);
			  System.out.println("servlet om :" + om);
			  orderList.add(om);
			  
		  }	// for end
		 
		 System.out.println("inOrderNo : " + inOrderNo);
		 for(OrderMenu o : orderList) {
			 if(o.getORDER_NO().equals("zero")) {	
				 orderInsert = oService.insertOrderList(tableNo,orderList,inOrderNo);
			 }else {
				 orderUpdate = oService.updateAmountOrder(tableNo, orderList);
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
