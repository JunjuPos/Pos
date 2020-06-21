package member.controller;

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
import static common.Pagination.*;

/**
 * Servlet implementation class MemberListServlet
 */
@WebServlet("/memberList.me")
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MemberServiceImpl bService = new MemberServiceImpl();
		
		int currentPage = 1;
		
		if(request.getParameter("currentPage") != null) {
			currentPage = Integer.valueOf(request.getParameter("currentPage"));
		}
		
		int listCount = bService.getListCount();
		PageInfo pi = getPageInfo(currentPage,listCount);
		
//		System.out.println("servlet에서 listCount : " + listCount);
//		System.out.println("servlet에서 currentPage : " + currentPage);
//		System.out.println("servlet에서 pi : " + pi);
		
		ArrayList<Member> list = bService.selectMemberList(pi);
		
		System.out.println("servlet에서 list : " + list);
		
		request.setAttribute("pi", pi);
		request.setAttribute("mlist", list);
		
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
