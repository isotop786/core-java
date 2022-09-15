package inheritance;

public class CommissionEmployee2 {
	private String firstName;
	private String lastName;
	private String SSN;
	private double grossSale;
	private double commissionRate;
	
	
	public CommissionEmployee2(String firstName, String lastName, String SSN, double grossSale, double commissionRate)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
		setCommissionRate(commissionRate);
		setGrossSale(grossSale);
		
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
		this.commissionRate = ((commissionRate > 0.0 && commissionRate < 1.0) ? commissionRate : 0.0);
	}
	
	public double earning()
	{
		return getCommissionRate() * getGrossSale();
	}
	
	public String toString()
	{
		return String.format("Employee: %s %s"
				+ "\nSSN: %s"
				+ "\nGross Sale: %.2f"
				+ "\nCommission Rate: %.2f"
				+ "\nEarnings: %.2f", getFirstName(),getLastName(),getSSN(),getGrossSale(),getCommissionRate(),this.earning());
	}
	
	

}
