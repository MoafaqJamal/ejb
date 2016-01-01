package library_catalogue;

public class Manual {
	private String serialNo;
	private String title;
	private String author;

	public Manual(){
		serialNo = "????";
		title = "Untitled";
		author = "Unknown";	
	}

	public Manual(String serialNoUI, String titleUI, String authorUI){
		serialNo = serialNoUI;
		title = titleUI;
		author = authorUI;
	}

	public void setserialNo(String newserialNo){
		serialNo = newserialNo;
	}

	public String getserialNo(){
		return serialNo;

	}

	public void settitle(String newtitle){
		title = newtitle;
	}

	public String gettitle(){
		return title;
	}

	public void setauthor(String newauthor){
		author = newauthor;
	}

	public String getauthor(){
		return author;
	}

	public String toString(){
		return "Serial Number: "+serialNo+ "\tTitle Name: "+title+ "\tAuthor: "+author; 
	}

	public void ask(){
		System.out.println("Enter the Details of the Manual");
		setserialNo(Console.askString("Enter the Serial Number:").toUpperCase());
		settitle(Console.askString("Enter The Title: "));
		setauthor(Console.askString("Name of The Author: "));
	}
}
