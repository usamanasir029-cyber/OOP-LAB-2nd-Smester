public class FindMax{

int max (int num1, int num2){
int result = 0;
if (num1>num2)
result = num1;
else if (num2>num1)
result=num2;

return result;
}

public double max(double num1, double num2){

return num2>num1? num2:num1;
}
// we can use method shown in double section instead of method in int section

public String max(String num1, String num2){
	String result="";
	if(num1.compareTo(num2) > num2.compareTo(num1)) result = num1;
	else result = num2;
	return result;
}
}