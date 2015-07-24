package cs359HW6;

public class Person {
	private int personId;  //ID number of the person
	private String firstName; //First name of person
	private String lastName;  //Last name of person
	private String emailAddress;  //The email address of the person
	
	//Constructor
	//
	public Person(int personId, String firstName, String lastName, String emailAddress) {
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}
	
	//Getter and Setter Methods
	//
	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
