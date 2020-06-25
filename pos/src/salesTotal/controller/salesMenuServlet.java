package salesTotal.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import menu.model.vo.Menu;
import salesTotal.model.controller.SalesMenuServiceImpl;
import salesTotal.model.vo.SalesTotalMenu;

/**
 * Servlet implementation class salesMenuServlet
 */
@WebServlet("/sales/menu")
public class salesMenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public salesMenuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SalesMenuServiceImpl sms = new SalesMenuServiceImpl();
		List<SalesTotalMenu> menuCountList = sms.selectMenuCountList();
		List<Menu> menu = sms.selectMenuList();
//		System.out.println(menuCountList);
		
		RequestDispatcher view=null;
		view=request.getRequestDispatcher("/views/salesTotal/salesMenu.jsp");
		request.setAttribute("menuCountList", menuCountList);
		request.setAttribute("menu", menu);
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
