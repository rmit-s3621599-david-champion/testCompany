public class Product {
	
	private String Code;
	private double Cost;
	private String Name;
	
	
	Product(String productCode,double productCost,String productName)
	{
	Code = productCode;
	Cost = productCost;
	Name = productName;
	}
	public String getProductName(){
		return Name;
	}
	public String getName(){
		return Name;
	}
	public double getPrice(){
		return Cost;
	}
}