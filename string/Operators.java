package string;

public class Operators {

	public static void main(String[] args) {
		System.out.println('a' + 'b');
		System.out.println("a" + "b");
		System.out.println('a' + 3);
		System.out.println((char) ('a' + 3));
		System.out.println("a" + 3); // integer will be converted to Integer(Wrapper class)
										// which calls toString()

		System.out.println("Shivansh" + 3);
	}
}
