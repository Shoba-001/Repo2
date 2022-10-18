package class4;

public class UsePen {
	public static void main(String args[]) {
		Pen pen1=new Pen();
		pen1.color="black";
		pen1.price=10;
		pen1.iswaterproof=true;
		Pen pen2=new Pen();
		pen2.color="blue";
		pen2.price=20;
		pen2.iswaterproof=false;
		Pen pen3=new Pen();
		pen3.color="red";
		pen3.price=25;
		pen3.iswaterproof=true;
		if(pen1.price>=pen2.price&&pen1.price>=pen3.price) {
			System.out.println("pen1 is not greater");
		}
		else if(pen2.price>=pen3.price&&pen2.price>=pen1.price) {
			System.out.println("pen2 is greater");
		}
	}

}
