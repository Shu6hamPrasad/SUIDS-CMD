package files;
import textio.TextIO;
public class cal {

	private Object usr;

	public void cal() {
		// TODO Auto-generated method stub
		System.out.println("==============");
		System.out.println("+ Calculator +");
		System.out.println("==============");
		System.out.println();
		System.out.println("Remember this calculator is just basic.");
		System.out.println("Please enter: ");
		System.out.println("'a' for addition.");
		System.out.println("'s' for subtraction. ");
		System.out.println("'m' for multiplication. ");
		System.out.println("'d' for division. ");
		System.out.println("or just press enter to go back. ");
		String i;
		i=TextIO.getln();
		if (i.equalsIgnoreCase("a")){
			float noa1;
			float noa2;
			float ad1;
			System.out.print("Enter number 1: ");
			noa1=TextIO.getFloat();
			System.out.print("Enter number 2: ");
			noa2=TextIO.getFloat();
			ad1=noa1+noa2;
			System.out.print("The addition is"+ad1);
		}
		else if (i.equalsIgnoreCase("s")){
			float nos1;
			float nos2;
			float su1;
			System.out.print("Enter number 1: ");
			nos1=TextIO.getFloat();
			System.out.print("Enter number 2: ");
			nos2=TextIO.getFloat();
			su1=nos1-nos2;
			System.out.print("The addition is"+su1);
		}
		else if (i.equalsIgnoreCase("m")){
			float nom1;
			float nom2;
			float mu1;
			System.out.print("Enter number 1: ");
			nom1=TextIO.getFloat();
			System.out.print("Enter number 2: ");
			nom2=TextIO.getFloat();
			mu1=nom1*nom2;
			System.out.print("The addition is"+mu1);
		}
		else if (i.equalsIgnoreCase("d")){
			float nod1;
			float nod2;
			float di1;
			System.out.print("Enter number 1: ");
			nod1=TextIO.getFloat();
			System.out.print("Enter number 2: ");
			nod2=TextIO.getFloat();
			di1=nod1+nod2;
			System.out.print("The addition is"+di1);
		}
		else {
			System.out.println("Welcome "+usr);
			usr usrObject = new usr();
			usrObject.usr();
		}
		}
	}


