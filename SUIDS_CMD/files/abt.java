package files;
import textio.TextIO;
public class abt {

	public void abt() {
		// TODO Auto-generated method stub
		System.out.println("=======================");
		System.out.println("+ About this Software +");
		System.out.println("=======================");
		System.out.println();
		System.out.println("Shubham User Identity and Utilities System");
		System.out.println();
		System.out.println("Version 2.00 BTA_INTJ");
		System.out.println("Copyright (c) Shubham Technologies. All Rights Reserved.");
		String input;
		System.out.print("Do you want to go back? (y/n) ");
		input=TextIO.getln();
		if (input.equals("y")) {
			usr usrObject = new usr();
            usrObject.usr();
		}
		else if (input.equals("n")) {
		}
		else {System.out.println("You entered a Wrong Input!");
		System.out.println("Terminating");
		}
	}

}