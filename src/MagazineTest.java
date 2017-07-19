import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MagazineTest {

	@Test
	public void calculatepriceTest() {
		Author au = new Author("mansi", "shah", "farmersbranch");
		Publisher p = new Publisher("kunal", "123 main st");
		Magazine b = new Magazine(p,au,"electromagnetics");
		Assert.assertTrue( b.calculatePrice()==9*12);
		
	}
	@Test
	public void toStringTest(){
		Author au = new Author("mansi", "shah", "farmersbranch");
		Publisher p = new Publisher("kunal", "123 main st");
		Magazine m = new Magazine(p,au,"electromagnetics");
		Assert.assertEquals("This is Magazine with Publisher :kunal",m.toString());
		
		
	}


}
