package kr.ac.shinhan.bamsucsp;

import java.util.List;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class MemberManager {

	public static Member addMember(String name, String num, String phone,
			String email, String kaka, String leader, String gitid) {
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory(
				"transactions-optional").getPersistenceManager();
		Member m = new Member(name, num, phone, email, kaka, leader, gitid);
		pm.makePersistent(m);
		pm.close();

		return m;
	}

	public static Member getMember(String key) {
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory(
				"transactions-optional").getPersistenceManager();
		Long lkey = Long.parseLong(key);
		Member m = pm.getObjectById(Member.class, lkey);
		pm.close();
		
		return m;
	}

	public static void updateMember(String key, String name) {
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory(
				"transactions-optional").getPersistenceManager();
		Long lkey = Long.parseLong(key);
		Member m = pm.getObjectById(Member.class, lkey);pm.
		m.setName(name);
		pm.makePersistent(m);
		pm.close();

	}
	
	public static void deleteMember(String key) {
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory(
				"transactions-optional").getPersistenceManager();
		Long lkey = Long.parseLong(key);
		Member m = pm.getObjectById(Member.class, lkey);
		pm.deletePersistent(m);
		pm.close();
	}

	public static List<Member> getAllMembers() {
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory(
				"transactions-optional").getPersistenceManager();
		Query qry = pm.newQuery(Member.class);
		List<Member> memberList = (List<Member>) qry.execute();
		pm.close();

		return memberList;
	}
}
