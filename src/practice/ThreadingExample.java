package practice;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ThreadingExample {

	public static void main(String[] args) {
		
		
	Runnable myRunnable = ()->{
		
		
		for(int num =2; num<=100 ; num++) {
			
			if(isPrime(num))
				System.out.println(num);
		}
	};
	
	ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
	
	newFixedThreadPool.execute(myRunnable);
	}
	
	public static boolean isPrime(int num) {
		
		return IntStream.range(2, num).noneMatch(n -> num%n==0);
	}
}
