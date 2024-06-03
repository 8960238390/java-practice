
public class Refactor {

	public static void main(String[] args) {
		
		System.out.println(isPrime(1));
	}
	
	public static boolean isPrime(int num) {
		
		boolean isDivisible = false;
		
		for(int i=2 ; i<num ; i++) {
			if(num%i==0) {
				isDivisible = true;
				break;
			}
		}
		
		return num>1 && !isDivisible;
	}
}
