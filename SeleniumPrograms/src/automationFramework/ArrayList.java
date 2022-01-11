package automationFramework;

//import java.util.ArrayList;
import java.util.HashSet;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet <String> names =  new HashSet <String>();
		//ArrayList <String> Names = new ArrayList<String> ();
		names.add("Kohli");
		names.add("Rohit");
		names.add("Dhoni");
		names.add("Sachin");
		names.add("Bumrah");
		names.add("Rohit");
		names.add("Kohli");
		
		for(String Output:names) {
			System.out.println(Output);
		}
		

	}

}
