package main;

import java.text.ParseException;
import java.util.ArrayList;

import bubblesort.BubbleSortProcess;
import model.Person;
import util.DefineValues;
import util.ShowProcess;

public class Main {

	private static ArrayList<Person> personList = new ArrayList<>();
	private static ArrayList<Person> sortedpersonList = new ArrayList<>();
	
	public static void main(String[] args) throws ParseException {
		
		
		personList = DefineValues.defineValues(personList);
		
		
		System.out.println("---------------------------------");
		System.out.println("BEFORE BUBBLE SORT byId");
		ShowProcess.showValues(personList);	
		

		System.out.println("AFTER BUBBLE SORT byId");
		BubbleSortProcess.byId(personList);	
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE BUBBLE SORT byLastName");		
		ShowProcess.showValues(personList);				
		
		System.out.println("AFTER BUBBLE SORT byLastName");
		BubbleSortProcess.byLastName(personList);	
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE BUBBLE SORT byName");
		ShowProcess.showValues(personList);

		System.out.println("AFTER BUBBLE SORT byName");
		BubbleSortProcess.byName(personList);
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE BUBBLE SORT byAge");		
		ShowProcess.showValues(personList);

		System.out.println("AFTER BUBBLE SORT byAge");
		BubbleSortProcess.byAge(personList);
		System.out.println("---------------------------------");
		
		System.out.println("BEFORE BUBBLE SORT byRegisterDate");		
		ShowProcess.showValues(personList);

		System.out.println("AFTER BUBBLE SORT byRegisterDate");
		BubbleSortProcess.byRegisterDate(personList);
		System.out.println("---------------------------------");
	}
}
