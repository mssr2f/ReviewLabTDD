import java.util.Date;

public class BookStore {

	public static void main(String[] args) {
		
		Publisher p = new Publisher("dietle ", "farmersbranch");
		Publisher p1 = new Publisher("mohamad ", "olathe");

		
		Author a = new Author("gandhi", "mehta", "independence");
		Author a1 = new Author("ajit", "shah", "greenvalley");


		Book [] array = new Book[6];
		array[0]= new Magazine(p, a, "electronic circuit");
		array[1]= new Magazine(p1,a1, "fundametal of Engineering");
		array[2]= new Book(a, "verilog");
		array[3]= new Book(a1, "digital Circuit");
		array[4]= new ElectronicBook(new Date(), a1, "analog");
		array[5] = new ElectronicBook(new Date(), a1, "senior design");
		
		int totalPrice = calculateTotalPrice(array);
		System.out.println("total price is:" + totalPrice);
		
	}

	public static int calculateTotalPrice(Book[] array) {
		int totalPrice = 0;
		for( int i =0; i< array.length; i++){
			
			 totalPrice += array[i].calculatePrice();
			 System.out.println(array[i].toString());
			
			
		}
		return totalPrice;
	}

	
}
