package kr.ac.shinhan.bamsucsp;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Member {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;

	@Persistent
	private String name;

	@Persistent
	private String num;

	@Persistent
	private String phone;

	@Persistent
	private String email;

	@Persistent
	private String kaka;

	@Persistent
	private String leader;

	@Persistent
	private String gitid;

	public Member(String name, String num, String phone, String email,
			String kaka, String leader, String gitid) {
		super();
		this.name = name;
		this.num = num;
		this.phone = phone;
		this.email = email;
		this.kaka = kaka;
		this.leader = leader;
		this.gitid = gitid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getKaka() {
		return kaka;
	}

	public void setKaka(String kaka) {
		this.kaka = kaka;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public String getGitid() {
		return gitid;
	}

	public void setGitid(String gitid) {
		this.gitid = gitid;
	}

	public Long getId() {
		return id;
	}



}