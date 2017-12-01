package ca.ciccc.java.landryachia.model;

/**
 * Class for the parent of each kid and determing how much time a parent spends with kid each week and name of parent
 * @author Landry Achia
 *
 */
public class Parent extends Employee implements Comparable<Parent> {


	/**
	 * int variable for number of hours spent per week with kids by parents
	 */
	private int numberOfHoursSpendPerWeekWithKids;
	
	/**
	 * final double variable for overtime pay rate for each parent
	 */
	private static final double OVERTIME_PAY_RATE = -2.0;

	
	/**
	 * two argument constructor for the parent class 
	 * @param name of each parent
	 * @param numberOfHoursSpentPerWeekWithKids variable each parent spends per week with kids
	 */
	public Parent(String name, int numberOfHoursSpentPerWeekWithKids) {
		super(name);
		this.numberOfHoursSpendPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
	}

	@Override
	public DressCode getDressCode() {

		return DressCode.ANYTHING;
	}

	@Override
	public boolean isPaidSalary() {

		return false;
	}

	@Override
	public boolean postSecondaryEducationRequired() {

		return false;
	}

	@Override
	public String getWorkVerb() {

		return "care";
	}

	@Override
	public double getOverTimePayRate() {

		return OVERTIME_PAY_RATE;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfHoursSpendPerWeekWithKids;
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
		if (!(obj instanceof Parent)) {
			return false;
		}
		Parent other = (Parent) obj;
		if (numberOfHoursSpendPerWeekWithKids != other.numberOfHoursSpendPerWeekWithKids) {
			return false;
		}
		return true;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Parent [numberOfHoursSpendPerWeekWithKids=" + numberOfHoursSpendPerWeekWithKids + ", getName()="
				+ getName() + "]";
	}

	@Override
	public int compareTo(Parent o) {
		if(this.numberOfHoursSpendPerWeekWithKids < o.numberOfHoursSpendPerWeekWithKids) {
			return 1;
		}else if(this.numberOfHoursSpendPerWeekWithKids > o.numberOfHoursSpendPerWeekWithKids) {
			return -1;
		}else {
			return 0;
		}
	}
}
