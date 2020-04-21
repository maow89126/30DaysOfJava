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
		// push is stack
		System.out.println(names.remove());
		System.out.println(names.remove());
		System.out.println(names.remove());
	}
}
