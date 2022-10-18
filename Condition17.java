package class4;

public class Condition17 {
	public static void main(String args[]) {
		String name="shoba";
		if(name.charAt(0)>='a'&&name.charAt(0)<='h') {
			System.out.println("They are A section");
		}
		else if(name.charAt(0)>='i'&&name.charAt(0)<='p') {
			System.out.println("They are B section");
		}
		else if(name.charAt(0)>='q'&&name.charAt(0)<='z') {
			System.out.println("They are C section"); 
		}
			else {
				System.out.println("Not a valid name");
			}
		}
	}


