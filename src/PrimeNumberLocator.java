
public class PrimeNumberLocator {

	public static int findNthPrime(int i) {
		int counter = 1; 
		int currNum = 2; 
		boolean increment = true; 
		while (counter <= i) {
			for (int j = 2; j <= currNum/2; j++) {
				if (currNum % j == 0) {
					increment = false; 
				} 
				
			}
			if (increment == true ) {
				counter++; 
			}
			currNum++; 
			increment = true; 
		}
		return currNum - 1;  
	}

}
