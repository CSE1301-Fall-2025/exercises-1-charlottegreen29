package module1._4compound;

public class E02PostfixExample {
	
	//Exercise 2: Try to guess the output before running the program.
	//Use the debugger to step through and see what happens.
	public static void main(String[] args) {
		int count = 7;
		System.out.println(count); //guess: prints 7
		System.out.println(count++); //guess: prints 8
		System.out.println(count); //guess: prints 7
		// huh, it prints 7, then 7, then 8. So the operator in the print statement doesn't actually change what's printed; it just changes the value for next time.
		System.out.println(++count);
		System.out.println(count);
		// now it changes after cuz the ++ happens before count and not after.
	}
}
