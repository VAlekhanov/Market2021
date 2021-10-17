package Controllers;

import Entities.User;
import History.History;
import MarketData.DataItems;
import Service.IDGenerator;

public class UserController {

	public static IDGenerator idGenerator;
	public static History history;
	public static DataItems items;

	public User createUser(String firstName, String lastName, Long userID) {
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setID(userID);
		return user;
	}
	
	/*Registration*/
	
	
	/*Authorization*/
	
	
}
