package library_catalogue;

public class MainClass {

	public static void main(String[] args) {

		boolean end = false;
		char option;
		Manual manual;
		Library library = new Library();

		while( !end ){
			option = Console.askOption("\nA)Add Manual S)Search Manual R)Remove Manual  P)Print Manual  Q)Quit");
			switch (option){
			case 'A':
				manual = new Manual();
				manual.ask();
				if (library.find(manual.getserialNo()) != null )
					System.out.println("sorry A book with the same serialNo already Exist\n");
				else
				{
					library.addManual(manual);
					System.out.println("Manual added successfully");
				}
				break;

			case 'S':

				Manual search = library.find(Console.askString("Enter the SerialNO").toUpperCase());
				if (search != null )
				{
					System.out.println("Manual Found");
					System.out.println(search);
				}
				else
				{
					System.out.println("The SerialNO doesn't Exist in the Library");
				}
				break;

			case 'R':

				Manual remove  = library.find(Console.askString("Enter the SerialNO").toUpperCase());
				if (remove != null )
				{
					library.removeManual(remove);
					System.out.println("Manual Removed");
				}
				else
				{
					System.out.println("The SerialNO doesn't Exist in the Library");
				}
				break;

			case 'P':
				library.print();
				System.out.print("Total Number of Manual is: "+library.getSize());
				break;
			case 'Q':
				System.out.println("Thanks For Using This Program");
				end = true;
				break;
			default: 
				System.out.println("ERROR: Invalid option");
				break;

			}
		}
	}
}
