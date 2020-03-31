package activity2;

public class Activity2_2 {

	public static void main(String[] args) {
		String iStr = "250";
		int a = Integer.parseInt(iStr);
		System.out.println("integer: "+a);

		String dStr = "250";
		double b = Double.parseDouble(dStr);
		System.out.println("double: "+b);

		String bStr = "FaLsE";
		boolean c = Boolean.parseBoolean(bStr);
		System.out.println("boolean: "+c);
		
		String world = "world";
		System.out.println(world.charAt(2));
		
		
		String cStr = "a";
		char d = cStr.charAt(0); //no need for parseChar
		System.out.println("char: "+d);
	}
}
