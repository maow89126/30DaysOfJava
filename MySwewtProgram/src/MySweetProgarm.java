import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class MySweetProgarm {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("students.txt"));
		
		List<String> students = new ArrayList<String>();
		// ArrayList -> class
		// List -> Interface
		
		//In case of int -> List <Integer>
		while(in.hasNextLine())
		{
			students.add(in.nextLine());
		}
		
		for (int i=0; i< students.size();i++)
		{
			System.out.println("name: " + students.get(i));
		}
		in.close();
		
	}
}


// class -instantiation--> object 
//		 -instantiation--> object