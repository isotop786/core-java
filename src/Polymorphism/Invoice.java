package Polymorphism;

public class Invoice implements Payable{
	private final String partNumber;
	private final String partDescription;
	private final int quantity;
	private final double pricePerItem;
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem)
	{
		
		if(quantity < 0) {
			throw new IllegalArgumentException("Quantity must be greater than 0");
		}
		
		if(pricePerItem < 0.0)
		{
			throw new IllegalArgumentException("Price per item must be >= 0");
		}
		
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	@Override
	public String toString()
	{
		return String.format("Part number: %s"
				+ "\nPart Description: %s"
				+ "\nQuantity: %d"
				+ "\nPrice per item: %.2f", getPartNumber(), getPartDescription(),getQuantity(),getPricePerItem());
	}

	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem();
	}

}
