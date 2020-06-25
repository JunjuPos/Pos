package menu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import menu.model.service.MenuServiceImpl;
import menu.model.vo.Menu;

/**
 * Servlet implementation class MenuDetailServlet
 */
@WebServlet("/menuDetail.mn")
public class MenuDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String MENU = request.getParameter("MENU");
		System.out.println("servlet으로 넘어온 menu : " + MENU);
		
		Menu mn = new Menu();
		
		mn = new MenuServiceImpl().selectMenuDetail(MENU);
		
		request.setAttribute("mn", mn);
		request.getRequestDispatcher("views/menu/menuDetail.jsp").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
