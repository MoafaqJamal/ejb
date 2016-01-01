package library_catalogue;
import java.util.ArrayList;

public class Library {
	ArrayList<Manual> manuals;
	ArrayList<String> keys;

	public Library(){
		manuals = new ArrayList<Manual>();
		keys = new ArrayList<String>();

	}

	public void addManual(Manual aManual){
		manuals.add(aManual);
		keys.add(aManual.getserialNo());
	}

	public void removeManual(Manual aManual){
		manuals.remove(aManual);
		keys.remove(aManual.getserialNo());
	}

	public Manual find(String aSerialNo){
		int index = keys.indexOf(aSerialNo);
		if(index == -1)
			return null;
		else
			return manuals.get(index);

	}

	public int getSize(){
		return manuals.size();
	}

	public void print(){
		for(int i=0;i<manuals.size(); i++)
			System.out.println(manuals.get(i));
	}

}
