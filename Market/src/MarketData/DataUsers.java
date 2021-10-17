package MarketData;

import java.util.ArrayList;
import java.util.List;

import Entities.Item;
import Entities.User;

public class DataUsers {
	private List<User> users = new ArrayList<>();

	private void defaultUsers() {
//		users.add(new User("John", 100000L));
//		users.add(new User("Sam", 100001L));
//		users.add(new User("Ivan", 100002L));
//		users.add(new User("Sasha", 100003L));
//		users.add(new User("Masha", 100004L));
//		users.add(new User("Vova", 100005L));
//		users.add(new User("Shaun", 100006L));
//		users.add(new User("Ali", 100006L));
//		users.add(new User("Summer", 100007L));
	}

	public List<User> allUsers() {
		if (users.isEmpty()) {
			defaultUsers();
		}
		return users;
	}
}
