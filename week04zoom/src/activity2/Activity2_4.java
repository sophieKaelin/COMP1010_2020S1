package activity2;

public class Activity2_4 {

	public static void main(String[] args) {
		String s = "23rd april 2014,5th may 2010      ,     18th december 2009";

		while(s.indexOf("  ") >= 0) {
			s = s.replace("  ", " ");
		}
		s = s.replace(" ,",",");
		s = s.replace(", ",",");
		String[] a = s.split(",");
		for(int i=0; i < a.length; i++) {
			System.out.println("["+i+"]: \""+a[i]+"\"");
			String current = a[i];
			String[] b = current.split(" ");
			for(int k=0; k < b.length; k++) {
				System.out.println("   ["+k+"]: \""+b[k]+"\"");
			}
		}
	}
}
