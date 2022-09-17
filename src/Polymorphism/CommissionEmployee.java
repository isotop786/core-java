package Polymorphism;

public class CommissionEmployee extends Employee{
	private double grossSale;
	private double commissionRate;
	
	public CommissionEmployee(String first, String last, String ssn, double grossSale, double commissionRate) {
		super(first, last, ssn);
		// TODO Auto-generated constructor stub
		if(grossSale < 0.0) {
			throw new IllegalArgumentException("Gross Sale can not be less than 0");
		}
		
		if(commissionRate < 0.0)
		{
			throw new IllegalArgumentException("Commission rate can not be less than 0");
		}
		
		if(commissionRate > 1.0)
		{
			throw new IllegalArgumentException("Commission rate can not be greater than 1.00");
		}
		
		this.commissionRate = commissionRate;
		this.grossSale = grossSale;
	}

	public double getGrossSale() {
		return grossSale;
	}

	public void setGrossSale(double grossSale) {
		if(grossSale < 0.0)
		{
			throw new  IllegalArgumentException("Gross sale can not be less than 0");
		}else {
			this.grossSale = grossSale;
		}
	}
	
	

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if(commissionRate < 0.0)
		{
			throw new IllegalArgumentException("Commission rate can not be less than 0");
		}
		else {
			this.commissionRate = ((commissionRate> 0.0 && commissionRate <1.0) ? commissionRate : 0.0 );
		}
	}
	
	public double earnings()
	{
		return this.getCommissionRate() * this.getGrossSale();
	}
	
	public String toString()
	{
		return String.format("Commissioned Employee: %s"
				+ "\nGross Sale: %.2f"
				+ "\nCommission rate: %.2f"
				,super.toString(), this.getGrossSale(),this.getCommissionRate());
	}
	
	
	
}
