public class Date{

	private int day;
	private int month;
	private int year;

public Date(int d,int m,int y){
	day=d;
	month=m;
	year=y;
}
public void displayDate(){ 
	System.out.println("Date: "+day+"-"+month+"-"+year);
  }
}