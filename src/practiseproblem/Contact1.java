package practiseproblem;

public class Contact1 {
/*
 * Calling toString 	
 */
	 @Override
	    public String toString() {
	        return "Contacts{" +
	                "firstName='" + firstName + '\'' +
	                ", lastName='" + lastName + '\'' +
	                ", address='" + address + '\'' +
	                ", city='" + city + '\'' +
	                ", state='" + state + '\'' +
	                ", zip=" + zip +
	                ", phoneNumber=" + phoneNumber +
	                '}';
	    }

	    private String firstName = " ";
	    private String lastName = " ";
	    private String address = " ";
	    private String city = " ";
	    private String state = " ";
	    private int zip = 0;
	    private long phoneNumber = 0;
/*
 * Creating constructor of class Contact1
 */
	    Contact1(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.address = address;
	        this.city = city;
	        this.state = state;
	        this.zip = zip;
	        this.phoneNumber = phoneNumber;
	    }
/*
 * Using getters and setters for all the variables
 */
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

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public String getState() {
	        return state;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    public int getZip() {
	        return zip;
	    }

	    public void setZip(int zip) {
	        this.zip = zip;
	    }

	    public long getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(long phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

/*
 * creating display method to print the contact details
 */
	    void display() {
	        System.out.println("First name = " + firstName);
	        System.out.println("Last name = " + lastName);
	        System.out.println("Address = " + address);
	        System.out.println("City = " + city);
	        System.out.println("State = " + state);
	        System.out.println("Zip = " + zip);
	        System.out.println("Mobile number = " + phoneNumber);
	    }

}
