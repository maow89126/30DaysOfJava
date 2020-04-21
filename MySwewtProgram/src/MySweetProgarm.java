import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class MySweetProgarm {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		try
		{
			Scanner in  = new Scanner (new File("test"));
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		*/
		LinkedList<String> names = new LinkedList<String>();
		names.push("Caleb");
		names.push("Sue");
		names.push("Sally");
		ListIterator<String> it =names.listIterator();
		it.next();
		it.next();
		it.add("Susan");
		//names.add(2,"Susan"); 
		//System.out.println(it.next());
		
		while(it.hasNext())
			System.out.println(it.next());
		
		for (String s :names)
		{
			System.out.println(s);
		}
		
	}
}
