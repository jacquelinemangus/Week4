
public class Week4project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93
	//for zoom video, add an extra number to show it works with multiple lengths
	
	int ages []=new int [] {3, 9, 23, 64, 2,8, 28, 93};


	//a.	Programmatically subtract the value of the first element in the
	//array from the value in the last element of the array 
	//(i.e. do not use ages[7] in your code). Print the result to the console.  
	System.out.println(ages[ages.length -1]-ages [0]); 
	//b. You can add an additional value to it to show that it can work with different numbers
	//c. c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
	int agesTotal=0;
	int x=0;
	while (x<ages.length) {
		agesTotal+=ages[x];
		x++;
	} System.out.println(agesTotal/ages.length);
	//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	
	String [] names ={"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; 
	      
	      
	

	//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//show in the zoom video that everything is working with the print outs
	int sum = 0;
	for (String n : names) {
		System.out.println("n " + n+"\n");
	    sum += n.length();
	    System.out.println("sum " + sum);
	    // System.out.println("sum " + sum);
	   
	    
	} 
	int avgLength = sum / names.length;
	System.out.println("The average name length is " + avgLength + ".");

	//b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
	String allNames = "";
	for ( int i = 0; i < names.length; i++ ) {
    allNames += names [i] + " " ;
    
}
	System.out.println(allNames);


	//5.	Create a new array of int called nameLengths. Write a loop to iterate over the
	//previously created names array and add the length of each name to the nameLengths array.
	int [] nameLengths = new int [names.length] ;
 for (int i = 0; i < names.length; i++) {
	 nameLengths [i] += names[i].length(); 
 }
	//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.

	double [] Lengths = {10, 20, 30, 40, 50};
 int total = 0; 

    for (int i = 0; i < nameLengths.length; i++) {
    	total  += nameLengths [i];
        //System.out.println(nameLengths[i]);
    }
    System.out.println(total);
     System.out.println(concat (3, "Hello"));
     System.out.println (fullName ("Bob", "Thompson"));
     canDrinkAlcohol(16);
     System.out.println(willBuyDrink (true, 21));
     System.out.println(isArrayGreatThan100(ages));
     System.out.println(returnSum(Lengths));

	} //End of main method



	//7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to 
	//itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
  public static String concat (int n, String word) {
	  String concatString = "";
	  for (int i=0; i < n ; i++) {
		  concatString += word; 
				 
				 
				  
		  
	  }
	return concatString;
	
  }
	
	   

	//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name
	//(the full name should be the first and the last name as a String separated by a space).
  public static String fullName (String firstName, String lastName) {
	  return (firstName + " " + lastName);
  }
	 
 

	  
	//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
public static boolean isArrayGreatThan100(int[] array) {
	int sum = 0;
	 for (int i = 0; i < array.length;  i++) {
		 sum += array[i];
	 }
	 if (sum>100) {
		 return true; 
	 }
	
	else {
	return  false;
	}
}
	


	//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		 
	public static double returnSum (double[] addition) {
			 double sum= 0;
	  for (int i=0; i<addition.length; i++) {
		 sum += addition [i];
	  }
	  return sum /addition.length;
	  
	
}
     
     
     

	//11.	Write a method that takes two arrays of double and returns true if the average of the 
	//elements in the first array is greater than the average of the elements in the second array.
            public static boolean isFirstArrayGreater (double [] c, double [] d) {
            	return returnSum (c) > returnSum (d);
            }

	

     

	//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a 
	//double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		//boolean isHotOutside, returns true if it is hot outside and 
		//if moneyInPocket is greater than 10.50.
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
     
   //public static willBuyDrink (boolean isHotOutside, double moneyInPocket);
		 //return true
    	
    //}
    
		 
  
	//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.




//canDrinkAlcohol (age);

	//Output: "You cannot legally drink alcohol yet!"

	//The method determines whether someone is old enough or not to drink alcohol. 
	//I think it might be useful in the liquor store or bar settings (although I am not much of a drinker)





	 //end of main


public static void canDrinkAlcohol (int age) {
	boolean canDrinkAlcohol;
	if (age >= 21){
		canDrinkAlcohol = true;
	} else {
		canDrinkAlcohol = false;
	}

	if (canDrinkAlcohol){
	    System.out.println("You can buy at the liquor store!");
	} else {
	    System.out.println("You cannot legally drink alcohol yet!");
	}
}
	
	
	
	
	
	
} //end of class	