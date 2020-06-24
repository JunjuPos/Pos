package member.controller;

import static common.Pagination.getPageInfo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberServiceImpl;
import member.model.vo.Member;
import member.model.vo.PageInfo;
import member.model.vo.SearchCondition;

/**
 * Servlet implementation class MemberSearchServlet
 */
@WebServlet("/memberSearch.me")
public class MemberSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String condition = request.getParameter("searchCondition");
		String value = request.getParameter("searchValue");
		
		System.out.println("servlet에서 condition : " + condition);
		System.out.println("servlet에서 value : " + value);
		
		SearchCondition sc = new SearchCondition();
		
		if(condition.equals("cName")) {
			sc.setcName(value);
		}else if(condition.equals("dept")) {
			sc.setDept(value);
		}
		
		int currentPage = 1;
		
		if(request.getParameter("currentPage") != null) {
			currentPage = Integer.valueOf(request.getParameter("currentPage"));
		}
		
		MemberServiceImpl mService = new MemberServiceImpl();
		
		int listCount = mService.getSearchResultListCount(sc);
		
		PageInfo pi = getPageInfo(currentPage, listCount);
		
		ArrayList<Member> list = mService.selectSearchResultList(sc,pi);
		
		request.setAttribute("pi", pi);
		request.setAttribute("mlist", list);
		
		request.setAttribute("condition", condition);
		request.setAttribute("value", value);
		
		request.getRequestDispatcher("views/member/memberList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
