package activity2;

public class Activity2_3 {

	public static void main(String[] args) {
		String s = "hallelujah        ,      and   done!!!!!!!";
		s = s.replace("  ", " "); //replace multiple spaces by a single one
		System.out.println(s);
		
		s = "hallelujah        ,      and   done!!!!!!!";
		while(s.indexOf("  ") >= 0) { //as long as you find two consecutive spaces
			s = s.replace("  ", " ");
		}
		System.out.println(s);
		
		s = "hallelujah        ,      and   done!!!!!!!";
		while(s.indexOf("  ") >= 0) {
			s = s.replace("  ", " ");
		}
		s = s.replace(" ,",","); //one final change
		System.out.println(s);
	}
}
