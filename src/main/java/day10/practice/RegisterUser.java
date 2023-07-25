package day10.practice;

import java.util.ArrayList;

public class RegisterUser {
	public static ArrayList<User> arr = new ArrayList();

	public ArrayList<User> getArr() {
		return arr;
	}

	public ArrayList<User> register(User user) throws UserAlreadyException {

		if (user.getEmailId().isEmpty()) {
			throw new UserAlreadyException("Email id is empty");

		}
		for (User exist : arr) {
			if (exist.getEmailId().equals(user.getEmailId())) {
				throw new UserAlreadyException(user.getEmailId() + " is alrady Exists");
			}
		}
		arr.add(user);
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegisterUser registerUser = new RegisterUser();

		User user1 = new User(1, "muthu", "ms@gmail.com");
		User user2 = new User(2, "muthu", "selvam@gmail.com");
		User user3 = new User(3, "muthu", "sri@gmail.com");

		try {
			registerUser.register(user1);
			registerUser.register(user2);
			registerUser.register(user3);

			for (User user : arr) {

				System.out.println("Id:" + user.getId() + " Name:" + user.getName() + " Email Id:" + user.getEmailId());

			}

		} catch (UserAlreadyException e) {
			e.printStackTrace();
	}

}}