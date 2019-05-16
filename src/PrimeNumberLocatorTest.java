import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PrimeNumberLocatorTest {

	@Test
	void numTest() {
		// assertEquals(13, PrimeNumberLocator.findNthPrime(6));
		assertEquals(401, PrimeNumberLocator.findNthPrime(79)); 
	}

}
