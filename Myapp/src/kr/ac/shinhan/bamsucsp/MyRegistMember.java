package kr.ac.shinhan.bamsucsp;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class MyRegistMember extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain");
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<table>");
		resp.getWriter().println("<form method='post' action='/regit2'>");
		resp.getWriter().println("<tr><td>이름</td><td><input type='text' name='name'></td></tr>");
		resp.getWriter().println("<tr><td>학번</td><td><input type='text' name='num'></td></tr>");
		resp.getWriter().println("<tr><td>전화번호</td><td><input type='text' name='phone'></td></tr>");
		resp.getWriter().println("<tr><td>이메일</td><td><input type='text' name='email'></td></tr>");
		resp.getWriter().println("<tr><td>카카오톡</td><td><input type='text' name='kaka'></td></tr>");
		resp.getWriter().println("<tr><td>팀장 여부</td><td><input type='checkbox' name='leader'></td></tr>");
		resp.getWriter().println("<tr><td>GitHub ID</td><td><input type='text' name='gitid'></td></tr>");
		resp.getWriter().println("<tr><td><input type='submit' name='commit' value='등록'></td></tr>");
		resp.getWriter().println("</form>");
		resp.getWriter().println("</table>");
		resp.getWriter().println("<a href='index.html'>처음으로<a>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}
}
