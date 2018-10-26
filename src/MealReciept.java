import java.util.Scanner;

/**
 * 
 * @author Hady Diab , Meal Reciept
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
		System.out.println("Please enter the name of your dessert: ");
		String dessertStr=calculator.nextLine();
		System.out.println("Please enter the price of your dessert: ");
		String dessertPriceStr=calculator.nextLine();
		System.out.println("What percentage would you like to tip(as a decimal): ");
		String tipStr=calculator.nextLine();
		
		double appetizerPrice=Double.parseDouble(appetizerPriceStr);
		double entreePrice=Double.parseDouble(entreePriceStr);
		double dessertPrice=Double.parseDouble(dessertPriceStr);
		double tip=Double.parseDouble(tipStr);
		double subtotal= appetizerPrice+entreePrice+dessertPrice;
		double tax= subtotal*0.06;
		double tipthing= tip*10;
		double tiptotal= tip*subtotal;
		double total=tip+subtotal+tax;
		int placeholder=2;
		
		
		
		
		double roundedtax= Math.round(tax*100.0)/100.0;
		double roundedtiptotal=Math.round(tiptotal*100.0)/100.0;
		double roundedtotal=Math.round(total*100.0)/100.0;
		double roundedtipthing=Math.round(tipthing*100.0)/100.0;
		double roundedsubtotal=Math.round(subtotal*100.0)/100.0;
		
		
		
		
		
		
		
		
		System.out.println("Item                              Price");
		System.out.println(appetizerStr+"                    $"+appetizerPrice);
		System.out.println(entreeStr +"                    $"+  entreePrice);
		System.out.println(dessertStr +"                   $"+dessertPrice);
		System.out.println("Subtotal"+"                      $"+roundedsubtotal);
		System.out.println("Tax" +"                           $"+roundedtax);
		System.out.println("Tip @ "+roundedtipthing+"          $"+roundedtiptotal);
		System.out.println("Total" +"                          $"+roundedtotal);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	}


}
