


public class Book {	
		

	 private Author a;
	 private String title;
	 
	 //constructor
	 public Book( Author a, String title)
	 {
		 this.a = a;
		 this.title = title;
		 
	 }
	
	 public  int calculatePrice ()
	 {
	
		int price = ( a.getFirstName().length() + a.getLastName().length());
		return price;
		
	}
	 @Override
	 public String toString()
	 {
		 
		 return "This is book with title :" + title ;
	 }
	
}
