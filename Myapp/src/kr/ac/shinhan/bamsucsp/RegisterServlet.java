package kr.ac.shinhan.bamsucsp;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setCharacterEncoding("EUC-KR");
		resp.setContentType("text/plain");
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<table>");
		resp.getWriter().println("<form method='post' action='/regit2'>");
		resp.getWriter().println("<tr><td>�̸�</td><td><input type='text' name='name'></td></tr>");
		resp.getWriter().println("<tr><td>�й�</td><td><input type='text' name='num'></td></tr>");
		resp.getWriter().println("<tr><td>��ȭ��ȣ</td><td><input type='text' name='phone'></td></tr>");
		resp.getWriter().println("<tr><td>�̸���</td><td><input type='text' name='email'></td></tr>");
		resp.getWriter().println("<tr><td>īī����</td><td><input type='text' name='kaka'></td></tr>");
		resp.getWriter().println("<tr><td>���� ����</td><td><input type='checkbox' name='leader'></td></tr>");
		resp.getWriter().println("<tr><td>GitHub ID</td><td><input type='text' name='gitid'></td></tr>");
		resp.getWriter().println("<tr><td><input type='submit' name='commit'></td></tr>");
		resp.getWriter().println("</form>");
		resp.getWriter().println("</table>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}
}
