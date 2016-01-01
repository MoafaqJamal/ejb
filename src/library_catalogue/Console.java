package library_catalogue;
import java.util.Scanner;

public class Console 
{
	public static Scanner console = new Scanner(System.in); //For String input 

	public static String askString(String aPrompt)
	{
		System.out.print(aPrompt);
		String reply = console.nextLine();
		return reply;
	}

	public static int askInt(String aPrompt)
	{
		String reply = askString(aPrompt);
		return Integer.parseInt(reply);
	}

	public static double askDouble(String aPrompt)  // method for double input
	{
		String reply = askString(aPrompt);
		return Double.parseDouble(reply);  // parseDouble converts string to double
	}

	public static char askOption(String aPrompt)
	{
		System.out.println(aPrompt);
		String reply = askString("Enter option: ");
		if (reply.trim().length() == 0)
			return '\0';
		else
			return Character.toUpperCase(reply.trim().charAt(0));
	}
}
