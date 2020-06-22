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
import order.model.vo.OrderTotalPrice;



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
		
		OrderMenu om = null;
		List<OrderMenu> orderList = new ArrayList<>();
		
		int totalPrice = 0;
		
		String[] orderDate = request.getParameterValues("orderDate");
		String[] orderMenu = request.getParameterValues("orderMenu");
		String[] orderPrice = request.getParameterValues("orderPrice");
		String[] orderAmount = request.getParameterValues("orderAmount");
		String tableNo = request.getParameter("tableNo");
		
		OrderTotalPrice otp = null;
		
		// 주문 목록 삭제
		int deleteResult = oService.deleteOrderList(tableNo);
		
		
		if(orderDate != null) {	// 주문을 하지 않은채로 주문버튼 눌렀을 때
			for(int i = 0 ; i < orderMenu.length ; i++) {
				
//				System.out.println("servlet orderMenu :" + orderMenu[i]);
//				System.out.println("servlet orderAmount :" + orderAmount[i]);
//				System.out.println("servlet orderPrice :" + orderPrice[i]);
//				System.out.println("servlet orderDate :" + orderDate[i]);
				
				om= new OrderMenu(orderAmount[i], orderMenu[i], orderDate[i], tableNo, orderPrice[i] );
				orderList.add(om);
				
//			  System.out.println("orderList : "+ orderList);
				
				
				if(orderPrice[i] != null) {
					totalPrice += Integer.valueOf(orderPrice[i]);
				}else {
					totalPrice = 0;
				}
				
			}	// for end
			
		}else {	// 주문을 한채로 주문버튼을 눌렀을 때
			request.getRequestDispatcher("/main/mainView").forward(request, response);
		}
		 System.out.println("servlet totalPrice : " + totalPrice);
		 // 주문 목록 삽입
		 int result = oService.insertOrderList(orderList); 
		 
		 // 합계금액 maintable update
		 otp = new OrderTotalPrice(Integer.valueOf(tableNo), Integer.valueOf(totalPrice));
		 int totalUpdate = oService.updateTotalPrice(otp);
	
		 request.getRequestDispatcher("/main/mainView").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
