package Controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Entities.User;
import Service.PasswordValidator;

public class UserController {

	private List<User> registredUsersData = new ArrayList<>();
	private Map<String,String> registredUsers = new HashMap<>();
	private PasswordValidator passwordValidator = new PasswordValidator();

	public User createUser(String userName,String firstName, String lastName, Long userID, String password) {
		User user = new User();
		user.setUserName(userName);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setID(userID);
		if(!passwordValidator.isValid(password))
			registredUsers.put(userName, password);
		else throw new IllegalArgumentException("Unvalid password.");
		return user;
	}

	/* Registration */
	public void registration(User user) {
		registredUsersData.add(user);
	}

	/* Authorization */
	public boolean authorization(String userName, String password) {
		if(password == registredUsers.get(userName)) {
			return true;
		}
		throw new IllegalArgumentException("Wrong username or password.");
	}

}
