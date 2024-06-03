
public class SecondSmallestNumber {

	public static void main(String[] args) {
		
		int[] numbers = { 5, 10, 3, 8, 1, 6 };
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int num : numbers) {
			
			if(num<smallest) {
				secondSmallest=smallest; // 5
				smallest=num;	// 3
			}else if(num<secondSmallest) {
				
			}
		}
		System.out.println(secondSmallest);
	}
}
