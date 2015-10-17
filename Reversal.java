import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
	}
}
