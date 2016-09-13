import java.util.Date;

public class Invoice {
 private int invNumber;
 private Date invDate;
 private LineItem[] invLineItem;
 
 public Invoice(int invNumber, Date invDate, LineItem[] invLineItem ){
	 
 }
 public int getInvoiceNumber(){
	 return invNumber;
 }
 
 
 public LineItem[] getLineItem(){
		return invLineItem;
 }
 
 
 
}
