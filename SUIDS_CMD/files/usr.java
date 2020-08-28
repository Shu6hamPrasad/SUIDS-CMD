package files;
import textio.TextIO;
public class usr {

	public void usr() {
		// TODO Auto-generated method stub
		System.out.println("Hello cred1, What you'd like to do today!");
		System.out.println();
		System.out.println("To navigate in the menu please write the S.No. given before the options");
		System.out.println("For help, type 'help'.");
		System.out.println("To terminate this program, just press Enter.");
		System.out.println();
		System.out.println("S.No.: "+"Program Name:");
		System.out.println();
		System.out.println("   1.  "+"About this Software");
		System.out.println("   2.  "+"Calculator");
		System.out.println("   3.  "+"Card Builder");
		
		String options;
		System.out.print("Enter a Choice.");
		options=TextIO.getlnString();
		if (options.equals("1")) {
			System.out.println("Entering About Page....");
			abt abtObject =  new  abt();
            abtObject.abt();
		}
		else if (options.equals("2")) {
			System.out.println("Opening Calculator....");
			cal calObject =  new  cal();
            calObject.cal();
		}
		else if (options.equals("3")) {
			System.out.println("Opening Card Builder...");
			car carObject =  new  car();
            carObject.car();
		
		}
		else if (options.equals("help")) {
			System.out.println("Entering Help Page....");
			hel helObject =  new  hel();
	        helObject.hel();
		}
		else if (options.equals("")) {}
		else {System.out.println("You entered a Wrong choice!");
		System.out.println("S.No.: "+"Program Name:");
		System.out.println();
		System.out.println("   1.  "+"About this Software...");
		System.out.println("   2.  "+"Calculator");
		System.out.println("   3.  "+"Card Builder");
		
		System.out.print("Enter a Choice.");
		options=TextIO.getlnString();
		if (options.equals("1")) {
			System.out.println("Entering About Page....");
			abt abtObject =  new  abt();
            abtObject.abt();
		}
		else if (options.equals("2")) {
			System.out.println("Opening Calculator....");
			cal calObject =  new  cal();
            calObject.cal();
		}
		else if (options.equals("3")) {
			System.out.println("Opening Card Builder...");
			car carObject =  new  car();
            carObject.car();
		
		}
		else if (options.equals("help")) {
			System.out.println("Entering Help Page....");
			hel helObject =  new  hel();
	        helObject.hel();
		}
		else {System.out.println("Again a bad output! Quitting.....");}
	}
  }
}