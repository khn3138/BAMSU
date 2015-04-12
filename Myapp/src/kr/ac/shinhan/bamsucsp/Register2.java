package kr.ac.shinhan.bamsucsp;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Register2 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain");
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<h1>");
		resp.getWriter().println("등록이 완료되었습니다!");
		resp.getWriter().println("</h1>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
		
		String name = req.getParameter("name");
		String num = req.getParameter("num");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");
		String kaka = req.getParameter("kaka");
		String leader;
		if (req.getParameter("leader") == null)
			leader = "팀원";
		else
			leader = "팀장";
		String gitid = req.getParameter("gitid");
		
		MemberManager.addMember(name, num, phone, email, kaka, leader, gitid);
		
		resp.getWriter().println("<table>");
		resp.getWriter().println("<tr><td>이름 : " + name + "</td></tr>");
		resp.getWriter().println("<tr><td>학번 : " + num + "</td></tr>");
		resp.getWriter().println("<tr><td>전화번호 : " + phone + "</td></tr>");
		resp.getWriter().println("<tr><td>이메일 : " + email + "</td></tr>");
		resp.getWriter().println("<tr><td>카카오톡 아이디 : " + kaka + "</td></tr>");
		resp.getWriter().println("<tr><td>팀장 여부 : " + leader + "</td></tr>");
		resp.getWriter().println("<tr><td>GitHub 아이디 : " + gitid + "</td></tr>");
		resp.getWriter().println("</table>");
	}
}
