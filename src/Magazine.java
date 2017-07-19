public class Magazine extends Book {
	
	
	
	
	 private Publisher p;
	 
	 public Magazine(Publisher p, Author a, String title)
	 {
		 super( a,  title);
		 this.p = p;
	 }
	
	 public int calculatePrice ()
	 {		 
			int price = super.calculatePrice();
			return price*12;
					
		}
	 @Override
	 public String toString()
	 {
		 
		 return "This is Magazine with Publisher :" + p.getName() ;
	 }

}
