import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PrimeNumberLocatorTest {

	
	@Test
	void numTest() {
		assertEquals(5, PrimeNumberLocator.findNthPrime(3)); 
		
		
	}
	
	@Test
	void numTest2() {
		assertEquals(13, PrimeNumberLocator.findNthPrime(6));
		
		
	}
	
	@Test
	void numTest3() {
		assertEquals(59, PrimeNumberLocator.findNthPrime(17)); 
		
		
	}
	
	@Test
	void numTest4() {
		assertEquals(401, PrimeNumberLocator.findNthPrime(79)); 
		
		
	}
	
	@Test
	void numTest5() {
		assertEquals(997, PrimeNumberLocator.findNthPrime(168)); 
		
		
	}
	
	
	
	
	
	

}
