package ca.ciccc.java.landryachia.model;


/**
 * Class for the profession of Hockey player taking into account the employee number of goals, dress code in Jersey, mode of payment
 * @author Landry Achia
 *
 */
public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer>{

	

	/**
	 * int variable for number of goals scored by employees whose jobs is Hockey
	 */
	private int numberOfGoals;
	
	/**
	 * double variable for overtime pay rate for each employee with such jobs
	 */
	private static final double OVERTIME_PAY_RATE = 0.0;

	/**
	 * two argument constructor for the hockey player taking name of player and number of goals scored by player
	 * @param name
	 * @param numberOfGoals
	 */
	public HockeyPlayer(String name, int numberOfGoals) {
		super(name);
		this.numberOfGoals = numberOfGoals;
		// TODO Auto-generated constructor stub
	}

	@Override
	public DressCode getDressCode() {
		return DressCode.JERSEY;

	}

	@Override
	public boolean isPaidSalary() {
		return true;
	}

	@Override
	public boolean postSecondaryEducationRequired() {
		return false;
	}

	@Override
	public String getWorkVerb() {
		return "play";
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
		result = prime * result + numberOfGoals;
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
		if (!(obj instanceof HockeyPlayer)) {
			return false;
		}
		HockeyPlayer other = (HockeyPlayer) obj;
		if (numberOfGoals != other.numberOfGoals) {
			return false;
		}
		return true;
	}
	
	

	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HockeyPlayer [numberOfGoals=" + numberOfGoals + ", getName()=" + getName() + "]";
	}

	@Override
	public int compareTo(HockeyPlayer o) {
		if (this.numberOfGoals < o.numberOfGoals) {
			return 1;
		}else if(this.numberOfGoals > o.numberOfGoals){
			return -1;
		}else {
			return 0;
		}
	}
}
