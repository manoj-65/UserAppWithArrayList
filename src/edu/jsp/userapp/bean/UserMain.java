package edu.jsp.userapp.bean;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		UserOperationOnList useOp = new UserOperationOnList();
		while (true) {
			System.out.println("Select Choice:");
			System.out.println("1.Create User\n2.Diaplay UserDetalies By id\n3.Remove User");
			int choice = read.nextInt();
			switch (choice) {
			case 1:
				useOp.addUsertoArrayList(readUserInfo(read));
				break;
			case 2:
				System.out.println(useOp.displayUserById(displayUserById(read)));
				break;
			case 3:
				useOp.removeUserById(displayUserById(read));
			default:
				break;
			}
		}

	}

	public static int displayUserById(Scanner read) {
		System.out.println("Enter the User Id :- ");
		return read.nextInt();
	}

	public static User readUserInfo(Scanner read) {
		User user = new User();
		System.out.println("Enter the User Id:");
		user.setId(read.nextInt());
		System.out.println("Enter the User Name: ");
		user.setName(read.next());
		System.out.println("Enter the User Email: ");
		user.setEmail(read.next());
		System.out.println("Enter the User Password: ");
		user.setPassword(read.next());
		return user;
	}
}
