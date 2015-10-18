import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Reversal
{
	public static void reverseFile(File input, File output) throws FileNotFoundException
	{
		ArrayList<String> lines = new ArrayList<>();
		Scanner asdf = new Scanner(input);
		
		while(asdf.hasNextLine())
		{
			lines.add(asdf.nextLine());
		}
		
		ArrayList<String> temp;
		String temp2 = "";
		
		//Stuff left to do: reverse order of each line in for loop, splitting each line into a list of strings and reversing that list
		for( int i = 0; i < lines.size(); i++)
		{
			temp = new ArrayList<String>(Arrays.asList(lines.get(i).split(" ")));
			
			Collections.reverse(temp);
			
			for(int j = 0; j < temp.size(); j++)
			{
				temp2 = temp2 + temp.get(j);
			}
			
			lines.set(i, temp2);
		}
		
		Collections.reverse(lines);
	}
}
