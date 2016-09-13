
public class LineItem {

	private double pricePerItem;
	private int quantity;
	private Product Product;
	
	public LineItem(Product myProduct, int myQuantity){
		Product = myProduct;
		quantity = myQuantity;
	}
	public String getProductName(){
		return Product.getName();
	}
		
		
	}

