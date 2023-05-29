package edu.jsp.userapp.bean;

import java.util.ArrayList;

public class UserOperationOnList {

	public static ArrayList<User> userList = new ArrayList<>();

	public void addUsertoArrayList(User user) {
		userList.add(user);
	}

	public User displayUserById(int id) {
		for (int index = 0; index < userList.size(); index++) {
			User user = userList.get(index);
			if (user.getId() == id) {
				return user;
			}
		}
		return null;

	}

	public void removeUserById(int id) {
		User user = displayUserById(id);
		if (user != null) {
			userList.remove(user);
			System.out.println("User with the Given Id = " + id + " Is Removed");
		} else {
			System.out.println("User with the Given Id = " + id + " Not Existes");
		}

	}
}
