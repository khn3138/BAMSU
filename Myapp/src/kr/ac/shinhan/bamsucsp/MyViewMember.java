package kr.ac.shinhan.bamsucsp;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyViewMember extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		List<Member> memberList = MemberManager.getAllMembers();
		
		resp.setCharacterEncoding("EUC-KR");

		resp.getWriter().println("<HTML>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<table border = 1>");
		for (Member m : memberList) {
			resp.getWriter().println("<tr>");
			resp.getWriter().println(
					"<td>" + "<a href = '/myupdatemember?key="
							+ m.getId() + "' name='qwer'>" + m.getName() + "</a>"
							+ "</td><td>" + m.getNum() + "</td><td>"
							+ m.getPhone() + "</td><td>" + m.getEmail()
							+ "</td><td>" + m.getKaka() + "</td><td>"
							+ m.getLeader() + "</td><td>" + m.getGitid()
							+ "</td><td>"
							+ "<a href = '/mydelete?key=" + m.getId()
							+ "'>" + "삭제</a></td>");
			resp.getWriter().println("</tr>");
		}
		resp.getWriter().println("</table>");
		resp.getWriter().println("<a href='index.html'>처음으로<a>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</HTML>");

	}

}
