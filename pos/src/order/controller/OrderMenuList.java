package order.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import menu.model.vo.Menu;
import order.model.service.OrderServiceImpl;
import order.model.vo.OrderMenu;

/**
 * Servlet implementation class OrderMenu
 */
@WebServlet("/order/orderMenu")
public class OrderMenuList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderMenuList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OrderServiceImpl oService = new OrderServiceImpl();
		String tableNo = request.getParameter("tableNo");

		List<Menu> menuList = oService.selectMenuList(); 
		List<Menu> drinkList = oService.selectDrinkList();
		List<OrderMenu> orderList = oService.selectOrderList(tableNo);
		
		
		if(orderList.isEmpty()) {
			request.setAttribute("orderList", orderList);
			request.setAttribute("menuList", menuList);
			request.setAttribute("drinkList", drinkList);
			request.setAttribute("tableNo", tableNo);
			request.getRequestDispatcher("/views/order/orderList.jsp").forward(request, response);
		}else {
			request.setAttribute("orderList", orderList);
			request.setAttribute("menuList", menuList);
			request.setAttribute("drinkList", drinkList);
			request.setAttribute("tableNo", tableNo);
			request.getRequestDispatcher("/views/order/orderList.jsp").forward(request, response);
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
