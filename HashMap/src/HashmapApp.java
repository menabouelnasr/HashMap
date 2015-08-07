import java.util.HashMap;
import java.util.Scanner;

public class HashmapApp 

{
	public static void main(String[] args) 
	{
		/*HashMap<String,String> map = new HashMap<String,String>();
		map.put("cat", "map"); // 1) key 2) sounds
		map.put("dog", "woof");
		System.out.println("map = " + map);
		System.out.println("A cat says..."+ map.get("cat: "));
		*/
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
		
		while (choice.equalsIgnoreCase("y"))
		{
			System.out.println("Enter a number: ");
			num=keyboard.nextInt();
			
			if(myMap.containsKey(num))
			{
				System.out.println("here");
				System.out.println("Response: You entered "+ myMap.get(num) + "" );
			}
			else
			{
				System.out.println("You have entered a number which is not in the map.");
				System.out.println("Please provide the spelling of the number.");
				spell=keyboard.next();
				myMap.put(num,spell);
				String value = myMap.get(num);
				System.out.println("Response: You entered "+ value + ".");
			}
	
			System.out.println("Would you like to try again? (Y/N)");
			choice=keyboard.next();
		}
	}

}
