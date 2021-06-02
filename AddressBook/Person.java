public class Person {
    // Field Variables
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String town;
    private int zip;
    private String state;
    private String altAddress;
    private static int ids = 10000;
    private int idNumber;

    // Constructors
    public Person() {

    }

    public Person(String pN, String fN, String lN, String sA, String t, int z, String s, String aA) {
        phoneNumber = pN;
        firstName = fN;
        lastName = lN;
        streetAddress = sA;
        town = t;
        zip = z;
        state = s;
        altAddress = aA;
        idNumber = ids++;
    }

    // Getter Methods
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getTown() {
        return town;
    }

    public int getZip() {
        return zip;
    }

    public String getState() {
        return state;
    }

    public String getAltAddress() {
        return altAddress;
    }

    public int getIDNumber() {
        return idNumber;
    }

    // Setter Methods
    public void setPhoneNumber(String str) {
        phoneNumber = str;
    }

    public void setFirstName(String str) {
        firstName = str;
    }

    public void setLastName(String str) {
        lastName = str;
    }

    public void setStreetAddress(String str) {
        streetAddress = str;
    }

    public void setTown(String str) {
        town = str;
    }

    public void setZip(int num) {
        zip = num;
    }

    public void setState(String str) {
        state = str;
    }

    public void setAltAddress(String str) {
        altAddress = str;
    }

    public void setIDNumber(int num) {
        idNumber = num;
    }

    // toString

    public String toString() {
        return "Name: " + lastName + ", " + firstName + "\nPhone Number: " + phoneNumber + "\nAddress: \n"
                + streetAddress + "\n" + town + ", " + state + " " + zip + "\nAlternate Address:\n" + altAddress + "\n"
                + town + ", " + state + " " + zip + "\nID Number: " + idNumber;
    }
}
