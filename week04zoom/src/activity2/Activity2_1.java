package activity2;

public class Activity2_1 {

	public static void main(String[] args) {
		String s = "this is       so, so cool!!!!!";
//		String[] words = s.split(" ");
//		System.out.println("Splitting on a single space:");
//		for(int i=0; i < words.length; i++) {
//			System.out.println("["+i+"]: \""+words[i]+"\"");
//		}

//		System.out.println();
		System.out.println("Splitting on a comma FOLLOWED BY space:");

//		String[] words2 = s.split(", "); //comma followed by a space (doesn't work for space followed by comma)
//		for(int i=0; i < words2.length; i++) {
//			System.out.println("["+i+"]: \""+words2[i]+"\"");
//		}
//
//		System.out.println();
		System.out.println("Splitting on one or more spaces:");

		String[] words1 = s.split(" +"); //+ implies one or more spaces
		for(int i=0; i < words1.length; i++) {
			System.out.println("["+i+"]: \""+words1[i]+"\"");
		}
	}
}
