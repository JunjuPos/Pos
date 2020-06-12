package main.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import order.model.service.OrderServiceImpl;
import order.model.vo.Order;

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
		 Order oneTable = new OrderServiceImpl().selectOneTotalPrice();
		 Order twoTable = new OrderServiceImpl().selectTwoTotalPrice(); 
		 Order threeTable = new OrderServiceImpl().selectThreeTotalPrice(); 
		 Order fourTable =  new OrderServiceImpl().selectFourTotalPrice(); 
		 Order fiveTable = new OrderServiceImpl().selectFiveTotalPrice(); 
		 Order sixTable = new OrderServiceImpl().selectSixTotalPrice(); 
		 Order sevenTable = new OrderServiceImpl().selectSevenTotalPrice(); 
		 Order eightTable = new OrderServiceImpl().selectEightTotalPrice(); 
		 Order nineTable = new OrderServiceImpl().selectNineTotalPrice(); 
		 Order tenTable = new OrderServiceImpl().selectTenTotalPrice();
		
		
		 ArrayList<Order> list = new ArrayList<>(); 
		 list.add(oneTable);
		 list.add(twoTable);
		 list.add(threeTable);
		 list.add(fourTable);
		 list.add(fiveTable);
		 list.add(sixTable);
		 list.add(sevenTable);
		 list.add(eightTable);
		 list.add(nineTable);
		 list.add(tenTable);
		 
		
		if(list.isEmpty()) {
			int zeroPrice = 0;
			request.setAttribute("zeroPrice", zeroPrice);
			request.getRequestDispatcher("/views/main/mainTable.jsp").forward(request, response);;
			
		}else {
			request.setAttribute("list", list);
			request.setAttribute("oneTable", oneTable);
			request.setAttribute("twoTable", twoTable);
			request.setAttribute("threeTable", threeTable);
			request.setAttribute("fourTable", fourTable);
			request.setAttribute("fiveTable", fiveTable);
			request.setAttribute("sixTable", sixTable);
			request.setAttribute("sevenTable", sevenTable);
			request.setAttribute("eightTable", eightTable);
			request.setAttribute("nineTable", nineTable);
			request.setAttribute("tenTable", tenTable);
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
