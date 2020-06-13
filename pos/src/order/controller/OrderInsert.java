package order.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import menu.model.vo.Menu;
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
		  
		  System.out.println("servlet orderNo :" + orderNo.length);
		  System.out.println("servlet orderMenu :" + orderMenu.length);
		  System.out.println("servlet orderAmount :" + orderAmount.length);
		  System.out.println("servlet orderPrice :" + orderPrice.length);
		  System.out.println("servlet orderDate :" + orderDate.length);
		
//		System.out.println("servlet tableNo : " +  tableNo);
		  for(int i = 0 ; i < orderMenu.length ; i++) {
//			  System.out.println("servlet orderMenu :" + orderMenu[i]);
//			  System.out.println("servlet orderAmount :" + orderAmount[i]);
//			  System.out.println("servlet orderPrice :" + orderPrice[i]);
//			  System.out.println("servlet orderDate :" + orderDate[i]);
			  
			  if(orderNo.equals("zero")) {
				  orderNo[i] = "null";
			  }else {
				  
				  System.out.println("servlet orderNo : " +  orderNo[i]);
				  inOrderNo = orderNo[i];
				  System.out.println("servlet inOrderNo : " + inOrderNo);
				  
				 
			  }
			  om= new OrderMenu(orderNo[i],orderMenu[i], orderDate[i], orderPrice[i], orderAmount[i], tableNo);

		  }	// for end
		 
		 ArrayList<Menu> basicMenu = new ArrayList<Menu>();
		 for(Menu basic : basicMenu) {
			 if(basic.getMENU().equals(orderMenu)) {	// 기존메뉴있을떄
				 orderUpdate = oService.updateAmountOrder(tableNo, om);
			 }else {
				 orderInsert = oService.insertOrderList(tableNo,om);
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
