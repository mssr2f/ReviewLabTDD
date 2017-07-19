import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import junit.framework.Assert;

public class ElectronicBookTest {

	@Test
	public void calculatepriceTest() {
		Author au = new Author("mansi", "shah", "farmersbranch");
		Date d= new Date();
		ElectronicBook b = new ElectronicBook(d,au,"electromagnetics");
		Assert.assertTrue( b.calculatePrice()==1);
		
	}
	@Test
	public void toStringTest(){
		Author au = new Author("mansi", "shah", "farmersbranch");
		Date d=new Date();
		ElectronicBook eb = new ElectronicBook(d,au,"electromagnetics");
		Assert.assertEquals("This is electronicbook with publishing date:"+d.toString(),eb.toString());
		
		
	}


}
