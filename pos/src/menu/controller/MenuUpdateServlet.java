package menu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import menu.model.service.MenuServiceImpl;
import menu.model.vo.Menu2;

/**
 * Servlet implementation class MenuUpdateServlet
 */
@WebServlet("/menuUpdate.mn")
public class MenuUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			request.setCharacterEncoding("UTF-8");
			
			String MENU =request.getParameter("MENU");
			String name = request.getParameter("mnName");
			String cate = request.getParameter("cate");
			int price = Integer.valueOf(request.getParameter("price"));
			String status = request.getParameter("mnStatus");
			
//			System.out.println("servlet에서 MENU" + MENU);
			
			
			int cateNo = 0;
			if(cate.equals("rice")) {
				cateNo=1;
			}else if(cate.equals("noddle")) {
				cateNo=2;
			}else if(cate.equals("drinks")){
				cateNo=3;
			}else {
				cateNo=4;
			}
			
			Menu2 m = new Menu2(MENU, name, price, status, cate, cateNo);
			
			int result = new MenuServiceImpl().updateMenu(m);
			System.out.println("servelt에서 update result : " + result);
			
			String updateMsg = name + " 메뉴의 정보가 수정되었습니다.";
			String uErrorMsg = name + " 메뉴의 정보 수정에 실패했습니다.";
			
			if(result>0) {
				request.setAttribute("updateMsg", updateMsg);
				request.getRequestDispatcher("/views/menu/menuList.jsp").forward(request, response);
			}else {
				request.setAttribute("uErrorMsg", uErrorMsg);
				request.getRequestDispatcher("/views/menu/menuDetail.jsp").forward(request, response);
			}
			
			
		}catch(NumberFormatException e){
			e.printStackTrace();
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
