public class Test{

	public static void main(String args[]){

	System.out.println("Application to find Maximum Number");

	FindMax ob1=new FindMax();
	System.out.println("Maximum Number is: " + ob1.max(3,9));
	System.out.println("Maximum Number is: " + ob1.max(20.0,35.56));
	System.out.println("Maximum String is: " + ob1.max("Saoud","Usama"));
	}

}