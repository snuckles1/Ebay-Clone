package cs359HW6;

public class Item {
	private int itemNumber; //unique item number
	private String shortSum; //short summary of item
	private String longSum; //long summary of item
	private boolean canBid; //whether or not a person can bid on this item
	private int sellerId;  //the id of the seller, -1 if the seller is anonymous
	
	//Constructor
	public Item(int itemNumber, String shortSum, String longSum, boolean canBid, int sellerId) {
		this.itemNumber = itemNumber;
		this.shortSum = shortSum;
		this.longSum = longSum;
		this.canBid = canBid;
		this.sellerId = sellerId;
	}
	
	//Getter and Setter Methods
	//
	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	
	public String getShortSum() {
		return shortSum;
	}
	
	public void setShortSum(String shortSum) {
		this.shortSum = shortSum;
	}
	
	public String getLongSum() {
		return longSum;
	}
	
	public void setLongSum(String longSum) {
		this.longSum = longSum;
	}
	
	public boolean isCanBid() {
		return canBid;
	}
	
	public void setCanBid(boolean canBid) {
		this.canBid = canBid;
	}
	
	public int getSellerId() {
		return sellerId;
	}
	
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	
}
