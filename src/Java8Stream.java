import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Stream {

	public static void main(String[] args) {

//		List<Integer> numberList = new ArrayList<>();
//		
//		numberList.add(5);
//		numberList.add(8);
//		numberList.add(1);
//		numberList.add(2);
//		
//		
//		List<Integer> collect = numberList.stream().filter(num -> num>=5).collect(Collectors.toList());
//		
//		System.out.println(collect);

		//List<Integer> list = Arrays.asList(10, 28, 87, 10, 20, 76, 28, 80, 80, 80);

		// duplicateElements(list);

		//multiply();
		
		stringCount();
	}

	public static void duplicateElements(List<Integer> list) {

		Set<Integer> set = new HashSet<>();

		list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(x -> System.out.println(x));

	}

	public static void multiply() {

		BiFunction<Integer, Integer, Integer> mulFunc = (n1, n2) -> n1 * n2;
		System.out.println(mulFunc.apply(2, 3));
	}
	
	public static void stringCount() {
		

		String str = "Welcome to code decode and code decode welcome you";
		
		List<String> list = Arrays.asList(str.split(" "));
		
	Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
//		Map<String, List<String>> collect = list.stream().collect(Collectors.groupingBy(Function.identity()));
		
//		 Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length));
		 
//		list.stream().collect(Collectors.groupingBy(null, null))
		
		System.out.println(collect);
	}
}
