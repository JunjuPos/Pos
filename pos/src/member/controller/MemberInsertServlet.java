package member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberServiceImpl;
import member.model.vo.Member;

/**
 * Servlet implementation class MemberInsertServlet
 */
@WebServlet("/memberInsert.me")
public class MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			request.setCharacterEncoding("UTF-8");
			
			String cName = request.getParameter("cName");
			String dept = request.getParameter("dept");
			String phone = request.getParameter("phone");
			int charge = Integer.valueOf(request.getParameter("charge"));
			int prePaid = Integer.valueOf(request.getParameter("prePaid"));
			String status = request.getParameter("status");
			
			Member m = new Member(cName, dept, phone, charge, prePaid, status);
			
			int result = new MemberServiceImpl().insertMember(m); 
			
//			System.out.println("servlet에서의 result : " + result);
			
			String insertMsg = cName + " 회원 등록에 성공했습니다.";
			String iErrorMsg = cName + " 회원 등록에 실패했습니다.";
			
			if(result>0) {
				request.setAttribute("insertMsg", insertMsg);
				request.getRequestDispatcher("/memberList.me").forward(request, response);	
			}else {
				request.setAttribute("iErrorMsg", iErrorMsg);
				request.getRequestDispatcher("/views/member/memberInsert.jsp").forward(request, response);;
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
