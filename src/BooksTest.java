import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class BooksTest {

	@Test
	public void calculatepriceTest() {
		Author au = new Author("mansi", "shah", "farmersbranch");
		Book b = new Book(au,"electromagnetics");
		Assert.assertTrue( b.calculatePrice()==9);
		
	}
	@Test
	public void toStringTest(){
		Author au = new Author("kunal", "parekh", "lakeview");

		Book b = new Book(au, "senior design");
		Assert.assertEquals("This is book with title :" + "senior design",b.toString());
		
		
	}

}
