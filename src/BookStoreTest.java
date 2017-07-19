import java.util.Date;

import org.junit.Test;

import junit.framework.Assert;

public class BookStoreTest {

	@Test
	public void TotalPrice(){
		
		Publisher p = new Publisher("d.k.patel","olathe,kansas");
		Author au = new Author("mansi", "shah", "farmersbranch");
		Book b = new Book(au, "senior design");
		Publisher pu = new Publisher("kunal", "123 main st");
		Magazine m = new Magazine(pu,au,"electromagnetics");
		Date d= new Date();
		ElectronicBook eb = new ElectronicBook(d,au,"electromagnetics");
		Book [] booklist = new Book[3];
		booklist[0] = m;
		booklist[1]= eb;
		booklist[2]= b;
		Assert.assertEquals(118, BookStore.calculateTotalPrice(booklist));
		
		
	}
	
	
	
}
