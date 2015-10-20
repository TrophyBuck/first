import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import junit.framework.Assert;

import org.junit.Test;


public class ReversalTest
{
	String path = "C:" + File.separator + "Users" + File.separator + "Chris" + File.separator + 
			"workspace" + File.separator + "501_Project2" + File.separator + "src" + File.separator;
	
	@Test
	public void whoCares()
	{
		Reversal blah = new Reversal();
	}
	
	@Test
	public void testOne() 
	{
		File input = new File(path + "inputOne");
		File output = new File(path + "outputOne");
		
		try
		{
			Reversal.reverseFile(input, output);
		}
		catch (FileNotFoundException e)
		{
			throw new AssertionError("One of the files was not found by the reverseFile method.");
		}
		
		try
		{
			Scanner asdf = new Scanner(output);
			
			assertEquals("Line 1 is 'two line'","two line",asdf.nextLine());
			assertEquals("Line 2 is 'one line'","one line",asdf.nextLine());
			
			asdf.close();
		}
		catch (FileNotFoundException e)
		{
			Assert.fail("The output file was not found when asserting result.");
		}
	}
	
	@Test
	public void testTwo() 
	{
		File input = new File(path + "inputTwo");
		File output = new File(path + "outputTwo");
		String expected;
		try
		{
			Reversal.reverseFile(input, output);
		}
		catch (FileNotFoundException e)
		{
			Assert.fail("One of the files was not found by the reverseFile method.");
		}
		
		try
		{
			Scanner asdf = new Scanner(output);
			
			expected = "program my test to here words some are there";
			assertEquals("Line 1 is " + expected,expected,asdf.nextLine());
			
			asdf.close();
		}
		catch (FileNotFoundException e)
		{
			Assert.fail("The output file was not found when asserting result.");
		}
	}
	
	@Test(expected = FileNotFoundException.class)
	public void testException() throws FileNotFoundException
	{
		File input = new File("inputThree");
		File output = new File("outputThree");
		try
		{
			Reversal.reverseFile(input, output);
			Assert.fail("File does not exist, but no error was returned by reverseFile()");
		}
		catch (FileNotFoundException e)
		{
			throw new FileNotFoundException();
		}
	}
}
