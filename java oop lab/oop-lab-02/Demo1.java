public class Demo1{

	public static void main(String args[]){
	
	student s = new student();
	s.name = "Abdul Rehman Azam";
	s.completedCredits =  12;

	System.out.println(s.name);
	System.out.println(s.completedCredits);

	s.addCredits(3);
	s.addCredits(3, 1);
	System.out.println(s.remainingCredits(130));
}

}