


import java.util.Date;

public class ElectronicBook extends Book {

	
	
	 private Date dateSent;
	 
	 public ElectronicBook(Date dateSent,Author a, String title)
	 {
		 
		 super(a,title);
		 this.dateSent = dateSent;
	 }	
	
	public  int calculatePrice ()
	{
		int price = 1;
		return price;	
		
		
	}
	@Override
	 public String toString()
	{
		 
		 return "This is electronicbook with publishing date:" + dateSent ;
	 }
	
	public void trasmitBook(){
		System.out.println("Transmitted");
	}
}
