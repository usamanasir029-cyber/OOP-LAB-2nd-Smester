public class Test01{

	public static void main(String args[]){

	System.out.println("Application to fil=nd Maximum Number!");

	FindMaxPro ob1=new FindMaxPro();
	System.out.println("Maximum Number is: "+ ob1.max(3,ob1.max(4,9)));
	System.out.println("Maximum Number is: "+ ob1.max(20.0,35.56));
	System.out.println("Maximum Number is: "+ ob1.max("Usama", "Saoud"));
	System.out.println("Maximum Number is: "+ ob1.max(3,9.0f));
}

}