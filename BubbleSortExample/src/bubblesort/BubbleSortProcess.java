package bubblesort;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

import model.Person;
import util.ShowProcess;

public class BubbleSortProcess {

	private static ArrayList<Person> sortedpersonList = new ArrayList<>();
	private static Person[] sortedPersonArray = null;

	public static void byId(ArrayList<Person> personList) {

		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				return Long.compare(p0.getId(), p1.getId());
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = bubbleSort(persons, compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);

	}

	public static void byLastName(ArrayList<Person> personList) {

		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				Collator collator = Collator.getInstance(new Locale("tr", "TR"));
				return collator.compare(p0.getLastname(), p1.getLastname());
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = bubbleSort(persons,  compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);
	}

	public static void byName(ArrayList<Person> personList) {

		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				Collator collator = Collator.getInstance(new Locale("tr", "TR"));
				return collator.compare(p0.getName(), p1.getName());
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = bubbleSort(persons, compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);
	}

	public static void byAge(ArrayList<Person> personList) {

		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				return Integer.compare(p0.getAge(), p1.getAge());
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = bubbleSort(persons, compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);
	}

	public static void byRegisterDate(ArrayList<Person> personList) {

		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				if (p0.getRegisterDate().before(p1.getRegisterDate())) {
					return -1;
				} else if (p0.getRegisterDate().after(p1.getRegisterDate())) {
					return 1;
				} else {
					return 0;
				}
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = bubbleSort(persons, compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);
	}

	private static Person[] convertListToArray(ArrayList<Person> personList) {
		Person[] persons = personList.toArray(new Person[personList.size()]);
		return persons;
	}

	private static ArrayList<Person> convertArrayToList(Person[] persons) {
		ArrayList<Person> personList = new ArrayList<>(Arrays.asList(persons));
		return personList;
	}

	public static Person[] bubbleSort(Person[] persons,Comparator comp) {

		for (int a = 1; a < persons.length; a++) {
			for (int b = 0; b < persons.length - a; b++) {
				if (greaterThan(comp, persons[b], persons[b + 1])) {
					Person temp = persons[b];
					persons[b] = persons[b + 1];
					persons[b + 1] = temp;
				}
			}
		}

		return persons;
	}

	// ASC
	private static boolean greaterThan(Comparator comp, Person x, Person y) {
		return comp.compare(x, y) > 0;
	}

	// DESC
	private static boolean lessThan(Comparator comp, Person x, Person y) {
		return comp.compare(x, y) < 0;
	}
}
