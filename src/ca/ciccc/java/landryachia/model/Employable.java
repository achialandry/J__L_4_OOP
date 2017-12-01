package ca.ciccc.java.landryachia.model;

/**
 * Interface that will have all methods overriden by classes that implement it
 * @author Landry Achia
 *
 */
public interface Employable {
	/**
	 * abstract method for dressCode for each employee
	 * @return string with dresscode
	 */
	public DressCode getDressCode();
	
	/**
	 * abstract method for salary of employee
	 * @return true or false if employee is paid
	 */
	public boolean isPaidSalary();
	
	/**
	 * abstract method for post secondary education requirements for each employee
	 * @return true or false if an employee requiires post secondary education or not
	 */
	public boolean postSecondaryEducationRequired();
	
	/**
	 * abstract method for the work verb for each employee
	 * @return a string determing the work verb for each employee
	 */
	public String getWorkVerb();
}
