import java.util.Scanner; 
public class PrimeNumberLocatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char contin = 'y'; 
		System.out.println("Let's locate some primes!\n"); 
		Scanner scan = new Scanner(System.in); 
		
		while (contin == 'y') {
			System.out.println("This application will find you any prime, in order, from first prime number on.\nWhich prime number are you looking for");
			int nthPrime = Validator.validateInt(scan); 
			System.out.println("The " + nthPrime + "th prime is " + PrimeNumberLocator.findNthPrime(nthPrime) + "."); 
			System.out.println("Do you want to find another prime number? (y/n)"); 
			contin = Validator.validateChar(scan); 
			
			if (contin == 'n') {
				System.out.println("Have a nice day!"); 
			}
		}
	}

}
