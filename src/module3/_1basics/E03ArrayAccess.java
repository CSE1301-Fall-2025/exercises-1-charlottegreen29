package module3._1basics;

public class E03ArrayAccess {
	
	//Exercise 3: Can you print out 3rd score in the array (remember 
	//that the first score is at index 0)? Can you change last 
	//score to 97 using an assignment statement in the code? 
	//Can you change the array so that it has 6 elements and 
	//add another score and print it out? What happens if you 
	//try to access an element that is not there, for example 
	//at index 7?
	public static void main(String[] args) {
		// declare and create arrays
		int[ ] highScores = new int[6];
		// Print initial highScore
		System.out.println(highScores[0]);
		// put values in highScore using an indexed variable
		highScores[0] = 99;
		highScores[1] = 98;
		highScores[2] = 98;
		highScores[3] = 88;
		highScores[4] = 68;
		highScores[5] = 67;

		// Print first highScore at index 0
		System.out.println( highScores[0] );

		//Can you print out 3rd score in the array?
		System.out.println(highScores[2]);

		//Can you change last score to 97 using an assignment statement in the code?
		System.out.println(highScores[highScores.length-1]);
		highScores[highScores.length-1]=97;
		System.out.println(highScores[highScores.length-1]);

		//What happens if you try to access an element that is not there, for example at index 7?
		System.out.println(highScores[7]); //you get an error message

	}
}

