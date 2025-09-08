package module2._07strings;

public class E02ReverseString {

	//Exercise 2: What would happen if you started the loop at 1 instead? You don't get the first letter of hello in the reversed word.
	//What would happen if you used <= instead of <? You get an error because the index of the length doesn't exist (the greatest index of a string is length-1)
	//What would happen if you changed the order in which you added the ithLetter in line 12? Then it wouldn't do anything cuz we haven't set ithletter to anything yet.
	public static void main(String[] args) {
		String s = "Hello";
		String sReversed = "";
		String ithLetter;

		for(int i=0; i < s.length(); i++) {
			ithLetter = s.substring(i,i+1);
			// add the letter at index i to what's already reversed.
			sReversed = ithLetter + sReversed;
		}
		System.out.println(s + " reversed is " + sReversed);
	}
}

