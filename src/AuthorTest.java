
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class AuthorTest {

	@Test
	public void testAuthorCreation() {
		Author a = new Author("mansi", "shah", "farmersbranch");
		Assert.assertEquals("mansi", a.getFirstName());
		Assert.assertEquals("shah", a.getLastName());
		


	}

}
