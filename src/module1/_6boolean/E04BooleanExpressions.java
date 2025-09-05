package module1._6boolean;

public class E04BooleanExpressions {
	public static void main(String[] args) {
		boolean isRaining = true;
		boolean hasMoney = false;

		// Will these print true or false?
		System.out.println( isRaining ); //true
		System.out.println( !isRaining ); //false
		System.out.println( hasMoney ); //false
		System.out.println( !hasMoney ); //true
		System.out.println( 5 == 7 ); //false
		System.out.println( !(5 == 7) ); //true

	}
}
