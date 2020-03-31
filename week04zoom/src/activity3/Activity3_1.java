package activity3;

public class Activity3_1 {
	public static void main(String[] args) {
		String[] data = {   "George Orwell, 1984",
							",Animal Farm", 
							"WodeHouse           , Pigs have wings",
							"     ,   My man Jeeves", 
							"Joanne Rowling   ,        Harry Potter Series", 
							"     WODEhouSE        , Aunts aren't Gentlemen"};
		
		String requestedAuthor = "Wodehouse";

		int i = 0; 
		int start = -1; //requested author not found yet
		int bookCount = 1;

		System.out.println("Books by "+requestedAuthor+":");
		while(i < data.length) {
			String cur = data[i];

			while(cur.indexOf("  ")>=0) {
				cur = cur.replaceAll("  "," ");
			}
			while(cur.indexOf(", ")>=0) {
				cur = cur.replaceAll(", ",",");
			}
			while(cur.indexOf(" ,")>=0) {
				cur = cur.replaceAll(" ,",",");
			}  
			String[] tokens = cur.split(",");

			//the above can be replaced with just: 
			//String[] tokens = data[i].split(" +, +"); 
			//meaning: one or more space followed by a comma followed by one or more space

			String author = tokens[0].trim(); //trim removes leading and trailing spaces

			if(author.equalsIgnoreCase(requestedAuthor)) {
				start = i; 
			}
			if(start >= 0) {
				if(author.isEmpty() || author.equalsIgnoreCase(requestedAuthor)) {
					System.out.println("\t"+bookCount+". "+tokens[1]);
					bookCount++;
				}
				else { //next author
					start = -1; //finish (but wodehouse might occur again later!)
				}
			}   
			i++;
		}
	}
}
