package kr.ac.shinhan.bamsucsp;

import java.io.IOException;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyUpdateMember extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain");
		
		String key = req.getParameter("key");
		String name = "dfsfsdf";
		
		MemberManager.updateMember(key, name);
		resp.getWriter().println("<a href='index.html'>처음으로<a>");
		
	}

}
