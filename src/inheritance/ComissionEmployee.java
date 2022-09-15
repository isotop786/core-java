package inheritance;

public class ComissionEmployee {
	
	protected String firstName;
	protected String lastName;
	protected String SSN;
	protected double grossSale;
	protected double commissionRate;
	
	public ComissionEmployee(String firstName,String lastName, String SSN, double grossSale, double commissionRate)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
		setGrossSale(grossSale);
		setCommissionRate(commissionRate);
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public double getGrossSale() {
		return grossSale;
	}

	public void setGrossSale(double grossSale) {
		this.grossSale = ((grossSale < 0.0) ? 0.0 : grossSale);
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = ((commissionRate >0.0 && commissionRate <1.0) ? commissionRate : 0.0);
	}
	
	public String toString()
	{
		return String.format("Comission Employee: %s %s"
				+ "\nSSN: %s"
				+ "\nGross Sale: %.2f"
				+ "\nCommission Rate: %.2f", this.firstName, this.lastName, this.SSN,getGrossSale(),getCommissionRate());
	}
	

}
