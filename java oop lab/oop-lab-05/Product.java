public class Product{

	private  String ID;
	private String name;
	private int quantity;
	private double price;
	private static int count=1;
	private static double maxprice=00;
	private static double minprice=00;
	private Date date;
	
	public Product(String n,double p,int q){
		this.name=n;
		this.price=p;
		this.quantity=q;
		this.ID=String.format("SP-BAI-%03d",count++);
		maxprice=10000.00;
		minprice=100.00;
		
		if(maxprice>price){ maxprice = price; }
		if(minprice<price){ minprice = price; }
	}
	
	public Product(String n,double p,int q,Date d){

		this.name=n;
		this.price=p;
		this.quantity=q;
		this.date=d;
		this.ID=String.format("SP-BAI-%03d",count++);
		maxprice=10000.00;
		minprice=100.00;
		
		if(maxprice>price){ maxprice = price; }
		if(minprice<price){ minprice = price; }
	}

	public void displayProduct(){

	System.out.println("All info is mentioned below \n");

	System.out.println("Name: "+name);
	System.out.println("ID: "+ID);
	System.out.println("Price: "+price);
	System.out.println("Quantity: "+quantity);
	
	if (date != null){ date.displayDate(); }

	System.out.println("Max Price: "+maxprice);
	System.out.println("Min Price: "+minprice);

	}

}