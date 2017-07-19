import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PublisherTest {

	@Test
	public void PublisherCreation() {
		
		Publisher p = new Publisher("d.k.patel","olathe,kansas");
		Assert.assertEquals("d.k.patel", p.getName());
		p.setName("daniel.k.patel");
		Assert.assertEquals("daniel.k.patel", p.getName());
	
	}

}
