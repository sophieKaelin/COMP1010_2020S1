package activity2;

public class GroupActivity2 {

	public static void main(String[] args) {
		String s = "gaurav.gupta@mq.edu.au";
		String usr=null, dmain=null;
		//emails are of the form username@domain. 
		//Given that s contains a valid email ID, store the username in variable usr, and domain in variable dmain
		//test the correctness with some other data samples

		//to be completed
		System.out.println("Username: "+usr+"\nDomain: "+dmain);

		String t = "20/15 Bart Street, Ryde, NSW 2113";
		int pCode=0;
		//assuming address to be of the form <street details>, <suburb>, <STATE> <postcode>, 
		//and further that postcode is numerical, store the postcode in a variable pCode
		//test the correctness with some other data samples

		//to be completed

		System.out.println(pCode);

		String v = "15th floor"; //or "1st floor" or "253trd floor"
		int flr=0;
		//assuming String is of the format <floor number><suffix> "floor",
		//store the floor number in a variable flr

		//to be completed

		System.out.println(flr);
	}
}
