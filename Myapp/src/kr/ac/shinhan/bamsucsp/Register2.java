package kr.ac.shinhan.bamsucsp;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Register2 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setCharacterEncoding("EUC-KR");
		resp.setContentType("text/plain");
		String name = req.getParameter("name");
		String num = req.getParameter("num");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");
		String kaka = req.getParameter("kaka");
		String leader;
		if (req.getParameter("leader") == null)
			leader = "ÆÀ¿ø";
		else
			leader = "ÆÀÀå";
		String gitid = req.getParameter("gitid");
		
		resp.getWriter().println("");
	}
}
