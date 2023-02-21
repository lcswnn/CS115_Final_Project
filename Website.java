import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Website {

	Scanner scan = new Scanner(System.in);
	
	//instance variables
	private String username;
	private String password;
	private boolean userType;
	
	
	//website constructor
	Website() {
		setUsername("DogLover91");
		setPassword("Dogs123");
		setUserType(false);
	}
	
	
	
	//Website setters
	public void setUsername(String username1) {
		username = username1;
	}
	
	public void setPassword(String password1) {
		password = password1;
	}
	
	public void setUserType(boolean userType1) {
		userType = userType1;
	}
	
	
	//Website getters
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public boolean getUserType() {
		return userType;
	}
	
	
	//singIn method
	public void signIn() {
		//ask for username
		System.out.println("Welcome! Please create a new account.");
		System.out.println("Enter a username: ");
		String userUsername = scan.next();
		setUsername(userUsername);
		System.out.println("Your username is set to: " + username);
		
		
		//ask for password
		System.out.println("Enter a new, strong password (At least 8 characters and 1 special character): ");
		String userPassword = scan.next();
		setPassword(userPassword);
		
		
		//find a special character
		Pattern special = Pattern.compile ("[$!@%&]");
		Matcher m = special.matcher(userPassword);
		boolean b = m.find();
		
		
		//make sure it's a strong password
		if (password.length() >= 8 && b) {
			System.out.println("Your password is strong enough. Your username and password is set.");
			setPassword(userPassword);
		}
		else if (b == false){
			while (b == false) {
				System.out.println("Your password is not strong enough. Enter a stronger password: (Password must be at least 8 characters and contain a special character) ");
				userPassword = scan.next();
				setPassword(userPassword);
				Matcher m1 = special.matcher(userPassword);
				boolean b1 = m1.find();
				if (password.length() >= 8 && b1) {
					System.out.println("Your password is strong enough. Your username and password is set.");
					break;
				}
			}
		}
		else {
			while (password.length() < 8 ) {
				System.out.println("Your password is not strong enough. Enter a stronger password: (Password must be at least 8 characters and contain a special character) ");
				userPassword = scan.next();
				setPassword(userPassword);
				Matcher m1 = special.matcher(userPassword);
				boolean b2 = m1.find();
				if (password.length() >= 8 && b2) {
					System.out.println("Your password is strong enough. Your username and password is set.");
					break;
				}
			}
		
		}
	}
		
	
	
	//ask for userType
	public void askUserType() {
		System.out.println("Are you a Donor or a Patient?: ");
		String Type = scan.next();
		
		if (Type.equals("donor")) {
			setUserType(true);
			System.out.println("Welcome! Thank you for donating!");
		}
		else if (Type.equals("Donor")) {
			setUserType(true);
			System.out.println("Welcome! Thank you for donating!");
		}
		else if (Type.equalsIgnoreCase("D")) {
			setUserType(true);
			System.out.println("Welcome! Thank you for donating!");
		}
		else if (Type.equals("patient")) {
			setUserType(false);
			System.out.println("Welcome! Thank you for coming in!");
		}
		else if (Type.equals("Patient")) {
			setUserType(false);
			System.out.println("Welcome! Thank you for coming in!");
		}
		else if (Type.equalsIgnoreCase("P")) {
			setUserType(false);
			System.out.println("Welcome! Thank you for coming in!");
		}
		
	}
	
	
}