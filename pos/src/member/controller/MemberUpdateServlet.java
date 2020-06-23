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
 * Servlet implementation class MemberUpdateServlet
 */
@WebServlet("/memberUpdate.me")
public class MemberUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		int mNo = Integer.valueOf(request.getParameter("mNo"));
		String cName = request.getParameter("cName");
		String dept = request.getParameter("dept");
		String phone = request.getParameter("phone");
		int charge = Integer.valueOf(request.getParameter("charge"));
		int prePaid = Integer.valueOf(request.getParameter("prePaid"));
		String status = request.getParameter("status");
		
		Member m = new Member(mNo,cName, dept, phone, charge, prePaid, status);
		
		int result = new MemberServiceImpl().updateMember(m);
		
//		System.out.println("servlet에서 update result : " + result);
		
		String updateMsg = cName+" 회원의 정보가 수정되었습니다.";
		String uErrorMsg = cName + " 회원의 정보 수정에 실패했습니다.";
		
		request.setAttribute("m", m);
		request.setAttribute("updateMsg", updateMsg);
		
	
		
		if(result>0) {
			request.setAttribute("updateMsg", updateMsg);
			request.getRequestDispatcher("/memberList.me").forward(request, response);	
		}else {
			request.setAttribute("uErrorMsg", uErrorMsg);
			request.getRequestDispatcher("/views/member/memberInsert.jsp").forward(request, response);
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
