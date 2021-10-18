package Entities;

public class User {
	private String userName;
	private String firstName;
	private String lastName;
	private Long ID;
	private String password;

	public User() {
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return this.userName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}


	public void setID(Long ID) {
		this.ID = ID;
	}
	
	public Long getID() {
		return this.ID;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
}