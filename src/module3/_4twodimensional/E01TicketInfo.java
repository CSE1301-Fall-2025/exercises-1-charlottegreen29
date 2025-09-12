package module3._4twodimensional;

//What will the E01TicketInfo program print out? 
//Can you change ticketInfo to be an array of 5 rows and 10 columns? 
//Can you declare another array called studentNames that has 10 rows and 5 columns?

public class E01TicketInfo {
	//Exercise
	public static void main(String[] args) {
		// declare arrays
		int[][] ticketInfo = new int[5][10];
		System.out.println(ticketInfo.length + " rows");
		System.out.println(ticketInfo[0].length + " columns");
		
		String[][] studentNames = new String[10][5];
		System.out.println(studentNames.length + " rows");
		System.out.println(studentNames[0].length + " columns");
	}
}

// I think it'll print that there are 2 rows and 3 columns. Yay I'm right! Ok changing it now.