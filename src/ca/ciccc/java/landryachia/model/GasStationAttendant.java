package ca.ciccc.java.landryachia.model;

/**
 * Class for the Gas Station attendant, determing names and how much they steal per day
 * @author Landry Achia
 *
 */
public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant> {


	/**
	 * a double variable for number of dollars stollen per day by gas station attendants
	 */
	private double numberOfDollarsStollenPerDay;
	
	/**
	 * final double variable for over time pay rate for each gas station attendant
	 */
	private static final double OVERTIME_PAY_RATE = 1.5;

	/**
	 * two argument constructor for GasStationAttendant taking variables name and number of dollars stollen per day
	 * @param name of each gas station attendant
	 * @param numberOfDollarsStollenPerDay double var stollen per day by gas station attendant with name
	 */
	public GasStationAttendant(String name, double numberOfDollarsStollenPerDay) {
		super(name);
		this.numberOfDollarsStollenPerDay = numberOfDollarsStollenPerDay;

	}

	@Override
	public DressCode getDressCode() {

		return DressCode.UNIFORM;
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

		return "pump";
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
		long temp;
		temp = Double.doubleToLongBits(numberOfDollarsStollenPerDay);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (!(obj instanceof GasStationAttendant)) {
			return false;
		}
		GasStationAttendant other = (GasStationAttendant) obj;
		if (Double.doubleToLongBits(numberOfDollarsStollenPerDay) != Double
				.doubleToLongBits(other.numberOfDollarsStollenPerDay)) {
			return false;
		}
		return true;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GasStationAttendant [numberOfDollarsStollenPerDay=" + numberOfDollarsStollenPerDay + ", getName()="
				+ getName() + "]";
	}

	@Override
	public int compareTo(GasStationAttendant o) {
		if(this.numberOfDollarsStollenPerDay < o.numberOfDollarsStollenPerDay) {
			return 1;
		}else if(this.numberOfDollarsStollenPerDay > o.numberOfDollarsStollenPerDay) {
			return -1;
		}else {
			return 0;
		}

	}



}
