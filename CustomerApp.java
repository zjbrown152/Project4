/**This class is my Application class, as well as the Child class for PizzaPlace. This program acts as a server at a pizza place called Billy Bobs. 
 * @author Zane Brown
 * @version Project #4 
 * 
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class CustomerApp extends PizzaPlace{

	public static void main(String[] args) {
		PizzaPlace A = new PizzaPlace();		//creates a new instance of PizzaPlace.
		
		 String response;
		 
		 
		 
		 
	       
	       /*Creates a scanner and then takes the String that was inputed to the prompt and splits each word up and puts them in a arraylist.
	        * Honestly I might not even need that in there.*/
				Scanner aScanner = new Scanner(System.in);
				System.out.println("Hello! Welcome to Billy Bobs Pizzeria! Do you need a menu?");
				response=aScanner.nextLine();
				String [] words=response.split(" ");
				ArrayList<String> wordList= new ArrayList<String>(Arrays.asList(words));
				
				 if(wordList.contains("yes"))		//If the inputed response has yes in it. It will draw the Menu. Using the drawMenu method from PizzaPlace.
				 {
					 System.out.println("Here you go!\n"+ A.drawMenu()+"\n"+"Order when you are ready.");
					 response=aScanner.nextLine(); 		//Allows the user to input a String.
				 }else
				 {
					 System.out.println("Sweet! What can I get for you then?");
					 response=aScanner.nextLine();
				 }
				 if(response.contains("large")) //If the response contains large, it will ask how many and then tell you the cost of that quantity of pizzas.
				 {
						 System.out.println("How many large pizzas? (Enter digit)");
				    	 double amountb=aScanner.nextInt();  	//This allows to user to input an integer number not a string.
				 
				    	 System.out.println(amountb+" large pizzas cost:\n"+"$"+A.addLarge(amountb)+"\n");  //Calls the addLarge method from PizzaPlace.
				    		 
					 }
				 if(response.contains("medium")) //Does the same thing as the one above but for medium pizzas.
				    	 {
				    		 System.out.println("How many Medium Pizzas?(Enter an integer)");
				    		 double amountm=aScanner.nextInt();
				    		 
				    		 System.out.println(amountm+" medium pizzas cost:\n"+"$"+A.addMedium(amountm)+"\n");  //Calls the addMedium method from parent class
				    	 }
				 if(response.contains("small"))
					 {
						 System.out.println("How many Small pizzas? (Enter an integer)"); //Same as above but for small pizzas.
						 double amounts=aScanner.nextInt();
						 
						 System.out.println(amounts+" small pizzas costs:\n"+"$"+A.addSmall(amounts)+"\n");	//Calls the addSmall method from parent class.
					 }
				 if(response.contains("calzone"))
					 {
						 System.out.println("How many Calzones? (Enter an integer)"); 	//Same as above but for Calzones.
						 double amountc=aScanner.nextInt();
						 
						 System.out.println(amountc+" calzones cost:\n"+"$"+A.addCalzone(amountc)+"\n");	//Calls the addCalzone method from parent class.
						 
					 }
				 if(response.contains("wings"))
				 {
					 System.out.println("How many orders of wings? (Enter an integer)");	//Same as above but for wings.
					 double amountw=aScanner.nextInt();
					 System.out.println(amountw+" orders of wings cost:\n"+"$"+A.addWings(amountw)+"\n");	//Calls the addWings method from parent class.
					 
				 }
				 System.out.println("Here is your total!\n"+"$"+A.addTotal());	//Calls the addTotal method from parent class that adds all the subtotals of each different type of food.
					 }
	
			} 
	        
	         
	         
	        
	    
	    



		
	
		

	


