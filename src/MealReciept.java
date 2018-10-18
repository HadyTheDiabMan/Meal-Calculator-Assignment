import java.util.Scanner;

/**
 * 
 * @author Hady Diab (hdiab22) (HadyTheDiabMan)
 *
 */
public class MealReciept 
{

	public static void main(String[] args) 
	{
		Scanner calculator = new Scanner (System.in);
		
		System.out.println("TAX AND TIP CALCULATOR!");
		System.out.print("PRESS ENTER TO CONTINUE");
		calculator.nextLine();
		System.out.println("Please enter the name of your appetizer: ");
		String appetizerStr=calculator.nextLine();
		System.out.println("Please enter the price for the appetizer: ");
		String appetizerPriceStr= calculator.nextLine();
		System.out.println("Please enter the name of your entrée: ");
		String entreeStr=calculator.nextLine();
		System.out.println("Please enter the price of your entrée: ");
		String entreePriceStr=calculator.nextLine();
		System.out.println("Please enter the name oof your dessert: ");
		String dessertStr=calculator.nextLine();
		System.out.println("Please enter the price of your dessert: ");
		String dessertPriceStr=calculator.nextLine();
		System.out.println("What percentage would you like to tip(as a decimal): ");
		String tipStr=calculator.nextLine();
		
		double appetizerPrice=Double.parseDouble(appetizerPriceStr);
		double entreePrice=Double.parseDouble(entreePriceStr);
		double dessertPrice=Double.parseDouble(dessertPriceStr);
		double tip=Double.parseDouble(tipStr);
		
		System.out.println("Item                              Price");
		System.out.println(appetizerStr       +       appetizerPrice);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	}


}
