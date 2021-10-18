package Main;

import Controllers.OrderController;
import Controllers.UserController;
import Entities.Order;
import Entities.User;
import Enums.OrderActionTypeEnum;
import Service.IDGenerator;

public class Market {

	private static UserController userController;
	private static OrderController orderController;
	private static IDGenerator idGenerator;

	public static void main(String Args[]) {
		User user = new User();
		String firstName = "Dorin";
		String lastName = "John";
		String password = "password";
		String userName = "DorJohn";
		user = userController.createUser(userName,firstName, lastName, idGenerator.generateNewUserID(), password);
		userController.registration(user);
		userController.authorization(userName, password);
		Order order = new Order();
		order = orderController.executeOrderAction(order, OrderActionTypeEnum.CREATE);
	}

}
