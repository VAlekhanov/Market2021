package Controllers;

import java.util.ArrayList;
import java.util.List;

import Entities.User;

public class UserController {

	private List<User> registredUsers = new ArrayList<>();

	public User createUser(String userName,String firstName, String lastName, Long userID, String password) {
		User user = new User();
		user.setUserName(userName);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setID(userID);
		user.setPassword(password);
		return user;
	}

	/* Registration */
	public void registration(User user) {
		registredUsers.add(user);
	}

	/* Authorization */
	public boolean authorization(String userName, String password) {
		for(User iterUser : registredUsers) {
			if(userName == iterUser.getUserName() && password == iterUser.getPassword()) {
				return true;
			}
		}
		throw new IllegalArgumentException("Wrong username or password.");
	}

}
