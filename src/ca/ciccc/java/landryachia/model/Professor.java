package ca.ciccc.java.landryachia.model;

/**
 * Class for the Professor who teaches and determining name and teaching major
 * @author Landry Achia
 *
 */
public class Professor extends Employee implements Comparable<Professor> {
	
	/**
	 * variable for teaching major of each teacher
	 */
	private String teachingMajor;
	
	/**
	 * final double variable for overtime pay rate for each professor
	 */
	private static final double OVERTIME_PAY_RATE = 2.0;
	
	
	/**
	 * two arguments constructor for the professor class determining name and teaching majors for each professor
	 * @param name variable of each professor
	 * @param teachingMajor varible for teaching major of each professor
	 */
	public Professor(String name, String teachingMajor) {
		super(name);
		this.teachingMajor = teachingMajor;
		// TODO Auto-generated constructor stub
	}

	@Override
	public DressCode getDressCode() {
		
		return DressCode.FANCY;
	}

	@Override
	public boolean isPaidSalary() {
		
		return true;
	}

	@Override
	public boolean postSecondaryEducationRequired() {
		
		return true;
	}

	@Override
	public String getWorkVerb() {
		
		return "teach";
	}

	@Override
	public double getOverTimePayRate() {
		// TODO Auto-generated method stub
		return OVERTIME_PAY_RATE;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((teachingMajor == null) ? 0 : teachingMajor.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Professor)) {
			return false;
		}
		Professor other = (Professor) obj;
		if (teachingMajor == null) {
			if (other.teachingMajor != null) {
				return false;
			}
		} else if (!teachingMajor.equals(other.teachingMajor)) {
			return false;
		}
		return true;
	}
	
	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Professor [teachingMajor=" + teachingMajor + ", getName()=" + getName() + "]";
	}

	@Override
	public int compareTo(Professor o) {
		return this.teachingMajor.compareTo(o.teachingMajor);
		
	}
	
}
