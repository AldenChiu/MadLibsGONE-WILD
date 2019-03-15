package blah;

import java.util.*;
public class Tester {
	
	public static void main(String args[]) throws InterruptedException
	{
		Scanner kbReader = new Scanner(System.in);
		System.out.println("Welcome to the greatest MadLibs ever! Get ready to enter some wacky words!");
		Thread.sleep(1000);
		//System.out.println("Which MadLib would you like to do? We have Option 1 and Option 2: ");
		//String option = kbReader.nextLine();
		//if (option.equals("Option 1") || option.equals("1"));
		//{
		//
		//}
		System.out.println("Input a noun: ");
		String noun1 = kbReader.nextLine();
		System.out.println("Input a number (in word form): ");
		String number1 = kbReader.nextLine();
		System.out.println("Input an adjective: ");
		String adjective1 = kbReader.nextLine();
		System.out.println("Input a proper noun: ");
		String propernoun1 = kbReader.nextLine();
		System.out.println("Input a verb: ");
		String verb1 = kbReader.nextLine();
		System.out.println("Input a verb: ");
		String verb2 = kbReader.nextLine();
		System.out.println("Input a number (in word form): ");
		String number2 = kbReader.nextLine();
		System.out.println("Input a noun: ");
		String noun2 = kbReader.nextLine();
		System.out.println("Input an expletive: ");
		String expletive1 = kbReader.nextLine();
		System.out.println("Here's your story!");
		Thread.sleep(2000);
		System.out.println("Once upon a " + adjective1 + " time, " + propernoun1 + " did a MadLibs." );
		Thread.sleep(3000);
		System.out.println("They were really gullible. They put in so many " + expletive1 + " words, thinking the story would turn out good.");
		Thread.sleep(3000);
		System.out.println("Well " + propernoun1 + " was wrong. Here's your REAL story!");
		Thread.sleep(3000);
		for(int j=0; j<100; j++)
		{
			System.out.println(expletive1);
		}
			
	}
	
	//public Option1()
}