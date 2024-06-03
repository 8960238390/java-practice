import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8ArrayProblems {

	public static void main(String[] args) {

		int[] numbers = { 5, 2, 8, 3, 1, 1 };

		 fetchSecondSmallest(numbers);
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 4, 5, 6, 7, 8 };

		// fetchCommonElement(array1, array2);

		//reverseGivenArrayInPlace(array1);
		
		//String[] strings = {"Apple", "Banana", "Avacado", "Apricot", "Grapes"};
		
		//fetchArrayOfLongestStringInArray(strings);
	}

	public static void fetchSecondSmallest(int[] arr) {

//		int[] sortedNumbers = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
//		
//		for(int number : sortedNumbers) {
//			System.out.println(number);
//		}

		//int secondSmalestElement = Arrays.stream(arr).distinct().sorted().skip(1).findFirst()
			//	.orElseThrow(() -> new IllegalArgumentException("Array does not have a second smallest element"));
		
		int[] array = Arrays.stream(arr).distinct().boxed().sorted().mapToInt(Integer::intValue).toArray();

		System.out.println(array[1]);


	}

	public static void fetchCommonElement(int[] arr1, int[] arr2) {

		List<Integer> commonElements = Arrays.stream(arr1)
				.filter(number -> Arrays.stream(arr2).anyMatch(arr2Number -> arr2Number == number)).boxed()
				.collect(Collectors.toList());

		System.out.println(" Common element in the given array is " + commonElements);
	}

	public static void reverseGivenArrayInPlace(int[] arr) {
		
		IntStream.range(0, arr.length/2).forEach(i -> {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length-i-1]=temp;
		});
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void fetchArrayOfLongestStringInArray(String[] arr) {
		
		int maxLength = Arrays.stream(arr).mapToInt(string -> string.length()).max().orElse(0);
		
		System.out.println("Length of Longest String : "+maxLength);
	}

}
