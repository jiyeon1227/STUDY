package member;

import java.sql.Timestamp;

public class MemberInfo {
	private String id;
	private String password;// 입력한 값이 아님 (즉, 넘어오지 않는 값)
	private String name;
	private String email;
	private String address;
	private Timestamp registerDate;// 입력한 값이 아님 (즉, 넘어오지 않는 값)
	
	public String getId() {
		return id;
	}
	public String getpassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public Timestamp getRegisterDate() {
		return registerDate;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setRegisterDate(Timestamp registerDate) {
		this.registerDate = registerDate;
	}
	
	
	
}
