package files;
import textio.TextIO;
public class login {
	public static void main(String[] args) {
		
		System.out.println("Welcome to SUIDS_CMD Version 2.00");
		System.out.println("Copyright (c) Shubham Prasad.");
		System.out.println("");
		System.out.println("");
		System.out.println("Enter your Credentials Below");
		System.out.println("");
		System.out.print("Enter your Username ");
		String usr;
		usr=TextIO.getln();
		if (usr.equals("cred1")) {
			System.out.print("Ola! "+usr+" Enter your Password ");
			String pwd;
			pwd=TextIO.getln();
			System.out.println("");
			if (pwd.equals("password121")) {
				System.out.println("Welcome "+usr);
				usr usrObject = new usr();
	            usrObject.usr();
			}
			else {System.out.println("Sorry! your Password is Incorrect");}
		}
		else {System.out.println("Sorry! your Username is Incorrect");}
		
	}
}
