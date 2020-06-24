package salesTotal.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import salesTotal.model.controller.SalesCalendarServiceImpl;
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
	
		SalesCalendarServiceImpl scs = new SalesCalendarServiceImpl();
		
		List<SalesTotalPrice> salesTotalPrice = scs.salesTotalPriceaboutMonth();
		List<SalesTotalPrice> salesCardTotalPrice = scs.salesCardTotalPrice();
		List<SalesTotalPrice> salesCashTotalPrice = scs.salesCashTotalPrice();
		List<SalesTotalPrice> salesCreditTotalPrice = scs.salesCreditTotalPrice();
		System.out.println(salesTotalPrice);
		System.out.println(salesCardTotalPrice);
		System.out.println(salesCashTotalPrice);

		RequestDispatcher view=null;
		
		view=request.getRequestDispatcher("/views/salesTotal/salesCalendar.jsp");
		
		request.setAttribute("salesTotalPriceList", salesTotalPrice);
		request.setAttribute("salesCardTotalPrice", salesCardTotalPrice);
		request.setAttribute("salesCashPrice", salesCashTotalPrice);
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
