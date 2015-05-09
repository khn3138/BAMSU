package kr.ac.shinhan.bamsucsp;

import java.io.IOException;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyUpdateMember2 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain");
		
		String key = req.getParameter("key");
		MemberManager.getMember(key);	

	PersistenceManager pm = JDOHelper.getPersistenceManagerFactory(
			"transactions-optional").getPersistenceManager();
	Long lkey = Long.parseLong(key);
	Member m = pm.getObjectById(Member.class, lkey);
	}
}