package cs359HW6;

public class Bid {
	private int itemNumber; //item number that the bid is going towards
	private int bidderId; //ID of the person making the bid
	private int amount; //Amount the person is Bidding
	
	//Constructor
	//
	public Bid(int itemNumber, int bidderId, int amount) {
		this.itemNumber = itemNumber;
		this.bidderId = bidderId;
		this.amount = amount;
	}
	
	//Getter and Setter Methods
	//
	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public int getBidderId() {
		return bidderId;
	}

	public void setBidderId(int bidderId) {
		this.bidderId = bidderId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
