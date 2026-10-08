public class Main{

	public static void main(String args[]){
	
		Product p001 = new Product("Laptop", 100000, 2);
		Product p002 = new Product("Mouse", 1500, 5);
		Product p003 = new Product("Keyboard", 3000, 3);

		p001.displayProduct();
		p002.displayProduct();
		p003.displayProduct();	

		Date d1 = new Date(8,10,26);
		Product p004 = new Product("Laptop", 100000, 2, d1);

		p004.displayProduct();		

	}

}