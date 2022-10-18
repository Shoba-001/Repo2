package class4;

public class Condition11 {
	public static void main(String args[]) {
		String name="door";
		if(name.length()%2==1) {
			System.out.println("it is odd"+" "+name.charAt(name.length()/2));
		}
		else if(name.length()%2==0) {
			System.out.println("it is even"+name.charAt(name.length()/2-1)+name.charAt(name.length()/2));
		}
		else {
			System.out.println("none");
		}
	}

}

