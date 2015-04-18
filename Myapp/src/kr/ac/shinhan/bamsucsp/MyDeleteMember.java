package kr.ac.shinhan.bamsucsp;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyDeleteMember extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain");
		
		MemberManager.deleteMember(req.getParameter("key"));

		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<h1>");
		resp.getWriter().println("삭제가 완료되었습니다!");
		resp.getWriter().println("</h1>");
		resp.getWriter().println("<a href='index.html'>처음으로<a>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}

}
