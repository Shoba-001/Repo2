package class4;

public class Condition16 {
	public static void main(String args[]) {
		int num1=100;
		int num2=40;
		char operation = '+';
		switch(operation) {
		case '+':System.out.println("Add="+" "+(num1+num2));
		break;
		case '*':System.out.println("Multiply="+num1*num2);
		break;
		case '/':System.out.println("Divide="+num1/num2);
		break;
		default:System.out.println("not an operator");
		break;
		}
		
	}

}
