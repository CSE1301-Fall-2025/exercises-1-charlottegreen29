package module3._2traversing;

public class E02Trace2 {

	//Exercise 2: Trace the execution of the following code,
	//then run it to see if you were correct
	public static void main(String[] args) {
		String[ ] names = {"Jamal", "Freddie", "Destiny", "Mateo", "Sofia"};

		int index = 1;
		System.out.println(names[index - 1]);
		index++;
		System.out.println(names[index]);
		System.out.println(names[index/2]);
		names[index] = "Charlotte";
		index--;
		System.out.println(names[index+1]);
	}
}

// I think this code will print "Jamal" and then print "Destiny" and then print "Emily" 
//and then change "Destiny" to "Rafi" and then print "Rafi"
//So the output would look like this:
	//Jamal
	//Destiny
	//Emily
	//Rafi

// Yay I was right!

// Now I'm gonna change Rafi to my name and Emily to Freddie
