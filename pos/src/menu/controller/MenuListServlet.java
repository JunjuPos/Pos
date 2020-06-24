package menu.controller;


import static common.MenuPagination.getPageInfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import menu.model.service.MenuServiceImpl;
import menu.model.vo.Menu;
import menu.model.vo.MenuPageInfo;

/**
 * Servlet implementation class MenuListServlet
 */
@WebServlet("/menuList.mn")
public class MenuListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MenuServiceImpl mnService = new MenuServiceImpl();
		
		int currentPage = 1;
		
		if(request.getParameter("currentPage") != null) {
			currentPage = Integer.valueOf(request.getParameter("currentPage"));
		}
		
		int listCount = mnService.getListCount();
		MenuPageInfo pi = getPageInfo(currentPage,listCount);
		
		ArrayList<Menu> list = mnService.selectMenuList(pi);
		
		System.out.println("servlet에서 list : " + list);
//		System.out.println(list.get(3).getCATE_NO());
		
		
//		request.setAttribute("pi", pi);
//		request.setAttribute("mnlist", list);
//		request.getRequestDispatcher("views/menu/menuList.jsp").forward(request, response);
	
//		response.setContentType("application/json;charset=utf-8");
//		
//		new Gson().toJson(list,response.getWriter());
		
		JSONObject userObj = null;
		JSONArray userArray = new JSONArray();
		
		for(Menu mn : list) {
			userObj = new JSONObject();
			
			userObj.put("MENU", mn.getMENU());
			userObj.put("CATEGORY", mn.getCATEGORY());
		
			userArray.add(userObj);
		}
		
		response.setContentType("application/json;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		System.out.println("userArray는? : " + userArray);
		out.print(userArray);
		out.flush();
		out.close();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
