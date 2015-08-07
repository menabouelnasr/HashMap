import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashmapApp 

{
	public static void main(String[] args) throws IOException 
	{
		String choice="y", spell;
		int num;
		
		Scanner keyboard = new Scanner(System.in);
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		myMap.put(0, "zero");
		myMap.put(1, "one");
		myMap.put(2, "two");
		myMap.put(3, "three");
		myMap.put(4, "four");
		myMap.put(5, "five");
		
		
		//get a filename
				System.out.println((System.getProperty("user.dir") + File.separatorChar +"mybooks.txt"));
				String filename = (System.getProperty("user.dir") + File.separatorChar +"mybooks.txt");
				
				System.out.println(Paths.get("c:\\myfolder\\myfile.txt"));
				PrintWriter writer;
				writer = new PrintWriter(new File(filename));
				FileWriter fstream  = new FileWriter("mybooks.txt"); ; 
				BufferedWriter out = new BufferedWriter(fstream); 
				
		while (choice.equalsIgnoreCase("y"))
		{
			System.out.println("Enter a number: ");
			num=keyboard.nextInt();
			
			
			if(myMap.containsKey(num))
			{
				writer.println(myMap.get(num));
			}
			else
			{
				System.out.println("You have entered a number which is not in the map.");
				System.out.println("Please provide the spelling of the number.");
				spell=keyboard.next();
				writer.println(myMap.put(num,spell));
				String value = myMap.get(num);
			}
			
			System.out.println("Would you like enter another number? (Y/N)");
			choice=keyboard.next();
		}
			writer.close(); //closes the PrintWriter
			Iterator<Entry<Integer, String>> it = myMap.entrySet().iterator(); //iterates through the hashmap to print
			while (it.hasNext())
			{
				Map.Entry<Integer, String> values = it.next(); //gets the keys and values at each point in the hashmap
				out.write("You entered: "+values.getKey() + "-->   " +values.getValue() + "\n"); //writes each line of the hashmap to the file
			}
			out.close(); // closes the BufferedWriter
		}
	

}
