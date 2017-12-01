package ca.ciccc.java.landryachia.model;

/**
 * Class at hierachy(abstract) to allocated name of each employee in the company and makes use mutator and accessor methods so it could be accessed by child childres
 * @author Landry Achia
 *
 */
public abstract class Employee implements Employable {
	
	/**
	 * String variable for the name of employee
	 */
	private String name;
	
	

	public abstract double getOverTimePayRate();
	
	/**
	 * Constructor for the employee name field
	 * @param name of each employee
	 */
	public Employee(String name) {
		super();
		this.name = name;
	}
	

	/**
	 * Accessor method for the name of employee
	 * @return the name of employee
	 */
	public String getName() {
		return name;
	}

	/**
	 * mutator method for the the employee name
	 * @param name the employee to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	
}
