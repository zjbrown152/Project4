/**This class is the Parent class of CustomerApp. 
 * It contains the methods that we called in CustomerApp.
 * It also has the getters and setters for most the variables we used in this project.
 * @author Zane Brown
 * @version Project #4
 *
 */
public class PizzaPlace {
	//Instantiate the variables
	double large;
	double medium; 
	double small;
	
	double calzone;
	double wings;
	
	int amountb;
	int amountm;
	int amounts;
	int amountc;
	int amountw;
	double total;
	
	

	//Empty constructor sets the items prices to 0.
	public PizzaPlace()
	{
		
		this.large=0;
		this.medium=0;
		this.small=0;
		
		this.calzone=0;
		this.wings=0;
		
		
	}
	
	

	

//Preferred constructor allows parameters to be passed through the variables.
	public PizzaPlace(double large, double medium, double small, double calzone, double wings)
	{
		
		this.large=large;
		this.medium=medium;
		this.small=small;
		
		this.calzone=calzone;
		this.wings=wings;
		
		
	}
	//This method displays the Menu that Billy Bob's has when it is called.
	public String drawMenu()
	{
		StringBuilder a= new StringBuilder();
		a.append("Large Pizza: $19.00"+"\n");
		a.append("Medium Pizza: $14.50"+"\n");
		a.append("Small Pizza: $11.50"+"\n");
		a.append("Calzone: $13.00"+"\n");
		a.append("Basket of Wings: $8.50"+"\n");
		
		
		return a.toString();
	}
	
	public double addLarge(double amountb)
	{
		
		 this.large=+19*amountb; 	//Method that calculates the total cost of the large pizzas.
		return this.large;
	}
	public double addMedium(double amountm)
	{
		this.medium=+14.50*amountm;	//Method that calculates the total cost of the medium pizzas.
		return this.medium;
	}
	public double addSmall(double amounts)
	{
		this.small=+11.50*amounts;	//Method that calculates the total cost of the small pizzas.
		return this.small;
	}
	public double addCalzone(double amountc)
	{
		this.calzone =+13*amountc;	//Method that calculates the total cost of the calzones.
		return this.calzone;
	}
	public double addWings(double amountw)
	{
		this.wings=+8.50*amountw;	//Method that calculates the total cost of the wings.
		return this.wings;
	}
	public double addTotal()		//This method adds up the costs of all the food items in the order and returns the total costs.
	
	{
		double total= this.large+ this.medium+ this.small+ this.calzone+ this.wings;
		return total;
				
		
		
	}

	
		
	//All the getters and setters for this class.

	public double getLarge() {
		return this.large;
	}

	public void setLarge(double large) {
		this.large=large;
		
	}

	public double getMedium() {
		return this.medium;
	}

	public void setMedium(double medium) {
		this.medium = medium;
	}

	public double getSmall() {
		return small;
	}

	public void setSmall(double small) {
		this.small = small;
	}



	public double getCalzone() {
		return calzone;
	}



	public void setCalzone(double calzone) {
		this.calzone = calzone;
	}



	public double getWings() {
		return wings;
	}



	public void setWings(double wings) {
		this.wings = wings;
	}

	

	
	



	
	
	
	
}
