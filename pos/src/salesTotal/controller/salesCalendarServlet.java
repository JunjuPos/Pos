package salesTotal.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import salesTotal.model.controller.SalesCalendarService;
import salesTotal.model.vo.SalesTotalPrice;

/**
 * Servlet implementation class salesCalendarServlet
 */
@WebServlet("/sales/cal")
public class salesCalendarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public salesCalendarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		SalesCalendarService scs = new SalesCalendarService();
		
		ArrayList<SalesTotalPrice> salesTotalPrice = new ArrayList<>();
		
//		salesTotalPrice = scs.salesTotalPrice();
		
		RequestDispatcher view=null;
		
		view=request.getRequestDispatcher("/views/salesTotal/salesCalendar.jsp");
		
		request.setAttribute("menu", "서블릿에서 온 메뉴입니다");
		request.setAttribute("price", "서블릿에서 온 갯수입니다.");
		view.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
