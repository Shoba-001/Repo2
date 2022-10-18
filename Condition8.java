package class4;

public class Condition8 {
	public static void main(String args[]) {
		int num1=46;
		if(num1>=0&&num1<=12) {
			System.out.println(num1+"he/she is a child");
		}
		else if(num1>=13&&num1<=19) {
			System.out.println(num1+"he/she is a teenager");
		}
		else if(num1>=20&&num1<=45) {
		System.out.println(num1+"he/she is a adult");
		}
		else if(num1>45) {
			System.out.println("senior citizen");
		}
	}

}
