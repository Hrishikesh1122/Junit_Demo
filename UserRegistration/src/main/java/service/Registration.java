/************************************************************
 * Purpose : Create a user registration system using regex.
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 19-06-2021
 *
 ************************************************************/
package service;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Registration {
	
	
	/**
	 * Contains regex pattern to test Firstname
	 * @param firstName
	 * @return True if matches regex pattern orterwise false
	 */
	public  boolean getFirstName(String firstName) {
		boolean check;
		check = Pattern.matches("[A-Z]+[a-z]{2,}", firstName);
		if(!check) {
			displayErrorMessage("Invalid first name");
		}
		return check;
	}
	
	/**
	 * Contains regex pattern to test Last name
	 * @param lastName
	 * @return True if matches regex pattern orterwise false
	 */
	public boolean getLastName(String lastName) {
		boolean check;
		check= Pattern.matches("[A-Z]+[a-z]{2,}", lastName);
		if(!check) {
			displayErrorMessage("Invalid last name");
		}
		return check;
	}
	
	/**
	 * Contains regex pattern to test phone number
	 * @param phone
	 * @return True if matches regex pattern orterwise false
	 */
	public boolean getPhoneNumber(String phone) {
		boolean check;
		check = Pattern.matches("^[1-9][0-9]\s[1-9]{10}$", phone);
		if(!check) {
			displayErrorMessage("Invalid phone number");
		}
		return check;
	}
	
	/**
	 * Contains regex pattern to test email id.
	 * @param email
	 * @return True if matches regex pattern otherwise false
	 */
	public boolean getEmail(String email) {
		boolean check;
		check = Pattern.matches("^[a-z0-9.+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$", email);
		if(!check) {
			displayErrorMessage("Invalid email");
		}
		return check;
		
	}
	
	/**
	 * Contains regex pattern to test password
	 * @param password
	 * @return True if matches regex pattern orterwise false
	 */
	public boolean getPassword(String password) {
		boolean check;
		check = Pattern.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[a-zA-z0-9!@#$%^&*()_+=-{};':<>,./?~`]).{8,}$", password);	
		if(!check) {
			displayErrorMessage("Invalid password");
		}
		return check;
		
	}
	
	/**
	 * Displays error message using lembda expression
	 * @param message (Error message from the method from which it is called)
	 */
	public void displayErrorMessage(String message) {
		Imessage i=()-> System.out.println(message);
		i.displayError();
	}
	public static void main(String[] args) {
		Registration r = new Registration();
		r.getFirstName("h987i"); //Shows invalid First name message
		r.getFirstName("Hrishi"); //Does not show error message 
	}

}
