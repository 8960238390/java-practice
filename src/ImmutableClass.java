public class ImmutableClass {

	public static void main(String[] args) {
		
		String s1= new String("abc");
		String s2 = s1;
		String s3 = "abc";
		String s4 = "abc";
		System.out.println(s3==s4);
		System.out.println(s1.equals(s3));
		
	}
}
