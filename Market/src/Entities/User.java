package Entities;

public class User {
	private String firstName;
	private String lastName;
	private Long ID;

	public User() {
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
}