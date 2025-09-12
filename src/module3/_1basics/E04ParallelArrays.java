package module3._1basics;

public class E04ParallelArrays {
	
	//Exercise 4: Can you print out Mateo's score?
	//Can you change Sofia's score to 97 using an assignment statement in the code? 
	//Can you change the arrays so that they have 6 elements and add your name and score and print them out? 
	public static void main(String[] args) {
		// declare, create, initialize arrays
		int[ ] highScores = {99,98,98,88,68,100};
		String[ ] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia","Charlotte"};

		// Print corresponding names and scores //teehee i made a for loop to print all of them at once :D
		for(int i=0; i<names.length; i++){
			System.out.println(names[i] + " has a score of " + highScores[i]);
		}

		highScores[4]=97;
		System.out.println();

		for(int i=0; i<names.length; i++){
			System.out.println(names[i] + " has a score of " + highScores[i]);
		}
		
	}
}

