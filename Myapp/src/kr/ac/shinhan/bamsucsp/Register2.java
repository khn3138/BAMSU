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
		resp.getWriter().println("����� �Ϸ�Ǿ����ϴ�!");
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
			leader = "����";
		else
			leader = "����";
		String gitid = req.getParameter("gitid");
		
		MemberManager.addMember(name, num, phone, email, kaka, leader, gitid);
		
		resp.getWriter().println("<table>");
		resp.getWriter().println("<tr><td>�̸� : " + name + "</td></tr>");
		resp.getWriter().println("<tr><td>�й� : " + num + "</td></tr>");
		resp.getWriter().println("<tr><td>��ȭ��ȣ : " + phone + "</td></tr>");
		resp.getWriter().println("<tr><td>�̸��� : " + email + "</td></tr>");
		resp.getWriter().println("<tr><td>īī���� ���̵� : " + kaka + "</td></tr>");
		resp.getWriter().println("<tr><td>���� ���� : " + leader + "</td></tr>");
		resp.getWriter().println("<tr><td>GitHub ���̵� : " + gitid + "</td></tr>");
		resp.getWriter().println("</table>");
	}
}
