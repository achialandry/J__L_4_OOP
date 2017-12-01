package ca.ciccc.java.landryachia.model;

/**
 * Enum for Dresscode for each job type or profession giving their appropriate means for appearance in public
 * @author Landry Achia
 *
 */
public enum DressCode { 
	JERSEY("jersey"),
	FANCY("fancy"),
	ANYTHING("anything"),
	UNIFORM("uniform")
	
;
	/**
	 * 
	 */
	private String values;
	
	/**
	 * method construct for the enum for respective dresscodes
	 * @param values assiged as argument to allocate dresscode for each profession
	 */
	private DressCode(String values) {
		this.values = values;
	}
}
