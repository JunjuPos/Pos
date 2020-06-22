package main.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import order.model.service.OrderServiceImpl;
import order.model.vo.OrderTotalPrice;


/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/main/mainView")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<OrderTotalPrice> list = new OrderServiceImpl().selectOrderTotalList();
	
		if(list.isEmpty()) {
			request.setAttribute("list", list);
			request.getRequestDispatcher("/views/main/mainTable.jsp").forward(request, response);;
			
		}else {
			request.setAttribute("list", list);
			request.getRequestDispatcher("/views/main/mainTable.jsp").forward(request, response);
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
