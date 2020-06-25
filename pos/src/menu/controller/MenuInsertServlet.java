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
 * Servlet implementation class MenuInsertServlet
 */
@WebServlet("/menuInsert.mn")
public class MenuInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			
			request.setCharacterEncoding("UTF-8");
			
			String mnName = request.getParameter("mnName");
			String cate = request.getParameter("cate");
			int inPrice = Integer.valueOf(request.getParameter("inPrice"));
			String mnStatus = request.getParameter("mnStatus");
			
			int cateNo = 0;
			
			if(cate.equals("밥")) {
				cateNo = 1;
			}else if(cate.equals("면")) {
				cateNo = 2;
			}else if(cate.equals("주류/음료")) {
				cateNo = 3;
			}else {
				cateNo = 4;
			}
			
			
//			public Menu(String mENU, String pRICE, String mENU_YN, String cATEGORY, int cATE_NO) {
//				MENU = mENU;
//				PRICE = pRICE;
//				MENU_YN = mENU_YN;
//				CATEGORY = cATEGORY;
//				CATE_NO = cATE_NO;
//			}
			
			Menu menu = new Menu(mnName, mnStatus, cate, cateNo, inPrice);
			
			int result = new MenuServiceImpl().insertMenu(menu);
			
			System.out.println("servlet에서의 menu insert result : " + result);
			
			String insertMsg = mnName + "메뉴가 등록되었습니다.";
			String iErrorMsg = mnName + "메뉴 등록에 실패했습니다.";
			
			if(result>0) {
				request.setAttribute("insertMsg", insertMsg);
				request.getRequestDispatcher("/views/menu/menuList.jsp").forward(request, response);
			}else {
				request.setAttribute("iErrorMsg", iErrorMsg);
				request.getRequestDispatcher("/views/menu/menuList.jsp").forward(request, response);
			}
			
			
		}catch(NumberFormatException e) {
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
