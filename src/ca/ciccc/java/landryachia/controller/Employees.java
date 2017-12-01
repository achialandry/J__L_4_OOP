package ca.ciccc.java.landryachia.controller;

import java.util.ArrayList;
import java.util.Collections;


import ca.ciccc.java.landryachia.model.Employee;
import ca.ciccc.java.landryachia.model.GasStationAttendant;
import ca.ciccc.java.landryachia.model.HockeyPlayer;
import ca.ciccc.java.landryachia.model.Parent;
import ca.ciccc.java.landryachia.model.Professor;

public class Employees {

	/**
	 * final int value To set a capacity for the Employee array list
	 */
	private static final int ARRAY_LIST_CAPACITY = 20;
	
	/**
	 * Initializing hockey Players array list
	 */
	private ArrayList<HockeyPlayer> hockeyPlayers;
	
	/**
	 * Initializing professor list
	 */
	private ArrayList<Professor> professors;
	
	/**
	 * intializing parents array list
	 */
	private ArrayList<Parent> parents;
	
	/**
	 * initializing gas station attendants list
	 */
	private ArrayList<GasStationAttendant> gasStationAttendants;
	
	/**
	 * initializing employees list
	 */
	private ArrayList<Employee> employees;

	/**
	 * Constructor for the employee class
	 */
	public Employees() {
		employees = new ArrayList<Employee>(ARRAY_LIST_CAPACITY);
		employees.add(new HockeyPlayer("Wayne Gretsky", 894));
		employees.add(new HockeyPlayer("Who Ever", 0));
		employees.add(new HockeyPlayer("Brent Gretsky", 1));
		employees.add(new HockeyPlayer("Pavel Bure", 437));
		employees.add(new HockeyPlayer("Jason Bourne", 0));

		//hockey players array list
		hockeyPlayers = new ArrayList<HockeyPlayer>();
		hockeyPlayers.add(new HockeyPlayer("Wayne Gretsky", 894));
		hockeyPlayers.add(new HockeyPlayer("Who Ever", 0));
		hockeyPlayers.add(new HockeyPlayer("Brent Gretsky", 1));
		hockeyPlayers.add(new HockeyPlayer("Pavel Bure", 437));
		hockeyPlayers.add(new HockeyPlayer("Jason Bourne", 0));

		//print out hockey players
		//		printMethodsForHockeyPlayers();

		employees.add(new Professor("Albert Einsten", "Physics"));
		employees.add(new Professor("Alan Turin", "Computer Systems"));
		employees.add(new Professor("Richard Feynman", "Physics"));
		employees.add(new Professor("Tim Berners-Lee", "Computer Systems"));
		employees.add(new Professor("Kurt Godel", "Logic"));

		//professor array list
		professors = new ArrayList<>();
		professors.add(new Professor("Albert Einsten", "Physics"));
		professors.add(new Professor("Alan Turin", "Computer Systems"));
		professors.add(new Professor("Richard Feynman", "Physics"));
		professors.add(new Professor("Tim Berners-Lee", "Computer Systems"));
		professors.add(new Professor("Kurt Godel", "Logic"));

		//print out professor
		//		printMethodsForProfessors();




		employees.add(new Parent("Tiger Woods", 1));
		employees.add(new Parent("Super Mom", 168));
		employees.add(new Parent("Lazy Harry", 20));
		employees.add(new Parent("Ex Hausted", 168));
		employees.add(new Parent("Super Dad", 167));

		//Teachers Array List
		parents = new ArrayList<>();
		parents.add(new Parent("Tiger Woods", 1));
		parents.add(new Parent("Super Mom", 168));
		parents.add(new Parent("Lazy Harry", 20));
		parents.add(new Parent("Ex Hausted", 168));
		parents.add(new Parent("Super Dad", 167));


		//print out parents
		//		printMethodsForParents();



		employees.add(new GasStationAttendant("Joe Smith", 10));
		employees.add(new GasStationAttendant("Tony Baloney", 100));
		employees.add(new GasStationAttendant("Benjamin Franklin", 100));
		employees.add(new GasStationAttendant("Mary Fairy", 101));
		employees.add(new GasStationAttendant("Bee See", 1));

		//Gas Station Attendants Array List
		gasStationAttendants = new ArrayList<>();
		gasStationAttendants.add(new GasStationAttendant("Joe Smith", 10));
		gasStationAttendants.add(new GasStationAttendant("Tony Baloney", 100));
		gasStationAttendants.add(new GasStationAttendant("Benjamin Franklin", 100));
		gasStationAttendants.add(new GasStationAttendant("Mary Fairy", 101));
		gasStationAttendants.add(new GasStationAttendant("Bee See", 1));


		//print out Gas Station attendants
		//		printMethodsForGasStationAttendants();


	}

	//method to print out all 
	/**
	 * method to print out sorted and unsorted list of hockey players
	 */
	public void printMethodsForHockeyPlayers() {
		//printing out hockey players array list unsorted
		System.out.println("Printing Unsorted for Hockey Players");
		for(HockeyPlayer hockeyPlayer : hockeyPlayers) {
			System.out.println(hockeyPlayer);
		}

		//Sorting Hockey Players array list with collections.sort()
		System.out.println("Printing Sorted for Hockey Players");
		Collections.sort(hockeyPlayers);
		for(HockeyPlayer hockeyPlayerSorted : hockeyPlayers) {
			System.out.println(hockeyPlayerSorted);
		}



	}

	/**
	 * Method to print out list sorted and unsorted professors
	 */
	//method to print out all Professors
	public void printMethodsForProfessors() {
		//printing out professors  array list unsorted
		System.out.println("Printing Unsorted for Professors");
		for(Professor professor : professors) {
			System.out.println(professor);
		}

		//Sorting Professors array list with collections.sort()
		System.out.println("Printing Sorted for Professors");
		Collections.sort(professors);
		for(Professor professorSorted : professors) {
			System.out.println(professorSorted);
		}



	}

	/**
	 * Method to print out list of sorted and unsorted parents
	 */
	//method to print out all Parents
	public void printMethodsForParents() {
		//printing out parent  array list unsorted
		System.out.println("Printing Unsorted for Parents");
		for(Parent parent : parents) {
			System.out.println(parent);
		}

		//Sorting parents  array list with collections.sort()
		System.out.println("Printing Sorted for Parents");
		Collections.sort(parents);
		for(Parent parentSorted : parents) {
			System.out.println(parentSorted);
		}



	}
	
	/**
	 * method to print sorted and unsorted list of Gas station attendants
	 */
	//method to print out all Gas Station Attendants
	public void printMethodsForGasStationAttendants() {
		//printing out Attendants  array list unsorted
		System.out.println("Printing Unsorted for Gas Station Attendants");
		for(GasStationAttendant gasStationAttendant : gasStationAttendants) {
			System.out.println(gasStationAttendant);
		}

		//Sorting Gas Station Attendants  array list with collections.sort()
		System.out.println("Printing Sorted for Gas Station Attendants");
		Collections.sort(gasStationAttendants);
		for(GasStationAttendant gasStationAttendantSorted : gasStationAttendants) {
			System.out.println(gasStationAttendantSorted);
		}
		

	}
	
	//method to compare all objects that are equal to one another
	/**
	 * Compare objects that are same in the employee class
	 */
	public void compareObjects() {
		final int  TOTAL_EMPLOYEES_IN_LIST = employees.size();
		for(int i = 0; i < TOTAL_EMPLOYEES_IN_LIST; i++) {
			for(Employee objs : employees) {
				if(objs.equals(employees.get(i))) {
					System.out.println("Printing All Employee Objects that are thesame");
					System.out.println(employees.get(i));
					System.out.println(objs);
				}
			}
			
		}
	}



	/**
	 * Main method for the Employee class
	 * @param args for the main method
	 */
	public static void main(String[] args) {
		Employees employee = new Employees();
		employee.printMethodsForGasStationAttendants();
		employee.printMethodsForHockeyPlayers();
		employee.printMethodsForParents();
		employee.printMethodsForProfessors();
		
		employee.compareObjects();
	}

}
