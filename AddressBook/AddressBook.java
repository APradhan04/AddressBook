import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    // Field Variables
    private ArrayList<Person> people;

    // Constructors
    public AddressBook() {
        people = new ArrayList<Person>();
    }

    // Methods
    public void printBook() {
        if (people.size() < 1) {
            System.out.println("There are no people in this Address Book");
        } else {
            for (int i = 0; i < people.size(); i++) {
                System.out.println((i + 1) + ". " + people.get(i).toString() + "\n");
            }
        }
    }

    public void addPerson() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Information: ");
        System.out.println("\nFirst Name:");
        String firstName = scan.nextLine();
        System.out.println("\nLast Name:");
        String lastName = scan.nextLine();
        System.out.println("\nPhone Number: ");
        String phoneNumber = scan.nextLine();
        System.out.println("\nAddress: ");
        String address = scan.nextLine();
        System.out.println("\nTown: ");
        String town = scan.nextLine();
        System.out.println("\nState: ");
        String state = scan.nextLine();
        System.out.println("\nZip Code: ");
        try {
            int zip = scan.nextInt();
            scan.nextLine();
        } catch (Exception e) {
            System.out.println("Please Print a Number");
        }
        System.out.println("\nAlternative Address: ");
        String altAddress = scan.nextLine();

        people.add(new Person(phoneNumber, firstName, lastName, address, town, zip, state, altAddress));
        System.out.println("\nNew Person Added");

    }

    public void searchBook() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which way would you like to search");
        System.out.println("1. First Name");
        System.out.println("2. Last Name:");
        System.out.println("3. Phone Number: ");
        System.out.println("4. Address: ");
        System.out.println("5. Town: ");
        System.out.println("6. State: ");
        System.out.println("7. Alternative Address: ");
        int input = scan.nextInt();

        System.out.println("\nSearch:");
        String str = scan.nextLine();
        System.out.println("Results: ");
        switch (input) {
            case 1:
                for (Person p : people) {
                    if (p.getFirstName().equals(str)) {
                        System.out.println(p);
                    }
                }
                break;
            case 2:
                for (Person p : people) {
                    if (p.getLastName().equals(str)) {
                        System.out.println(p);
                    }
                }
                break;
            case 3:
                for (Person p : people) {
                    if (p.getPhoneNumber().equals(str)) {
                        System.out.println(p);
                    }
                }
                break;
            case 4:
                for (Person p : people) {
                    if (p.getStreetAddress().equals(str)) {
                        System.out.println(p);
                    }
                }
                break;
            case 5:
                for (Person p : people) {
                    if (p.getTown().equals(str)) {
                        System.out.println(p);
                    }
                }
                break;
            case 6:
                for (Person p : people) {
                    if (p.getState().equals(str)) {
                        System.out.println(p);
                    }
                }
                break;
            case 7:
                for (Person p : people) {
                    if (p.getAltAddress().equals(str)) {
                        System.out.println(p);
                    }
                }
                break;
            default:
                System.out.println("Invalid Option");
        }

    }

    public void delPerson() {
        Scanner scan = new Scanner(System.in);
        if (people.size() < 1) {
            System.out.println("There are no Addresses to delete");
        } else {
            System.out.println("Which Address Would You Like to Delete?");
            this.printBook();
            int i = scan.nextInt() - 1;
            if (i < 0 || i > people.size()) {
                System.out.print("Invalid Option");
            }
            people.remove(i);
        }

    }

    public void editPerson() {
        Scanner scan = new Scanner(System.in);
        this.printBook();
        System.out.println("Which Address Would You Like to edit?");
        int i = scan.nextInt() - 1;

        int input = -1;
        while (input != 9) {
            System.out.println("What Would You Like to Edit");
            System.out.println("1. First Name:");
            System.out.println("2. Last Name:");
            System.out.println("3. Phone Number: ");
            System.out.println("4. Address: ");
            System.out.println("5. Town: ");
            System.out.println("6. State: ");
            System.out.println("7. Zip Code: ");
            System.out.println("8. Alternative Address: ");
            System.out.println("9. Quit");

            input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("\nEnter new First Name: ");
                    people.get(i).setFirstName(scan.nextLine());
                    break;
                case 2:
                    System.out.println("\nEnter new Last Name: ");
                    people.get(i).setLastName(scan.nextLine());
                    break;
                case 3:
                    System.out.println("\nEnter new Phone Number: ");
                    people.get(i).setPhoneNumber(scan.nextLine());
                    break;
                case 4:
                    System.out.println("\nEnter new Street Address: ");
                    people.get(i).setStreetAddress(scan.nextLine());
                    break;
                case 5:
                    System.out.println("\nEnter new Town");
                    people.get(i).setTown(scan.nextLine());
                    break;
                case 6:
                    System.out.println("\nEnter new State: ");
                    people.get(i).setState(scan.nextLine());
                    break;
                case 7:
                    System.out.println("\nEnter new Zip Code");
                    people.get(i).setZip(scan.nextInt());
                    break;
                case 8:
                    System.out.println("\nEnter new alternative address: ");
                    people.get(i).setAltAddress(scan.nextLine());
                    break;

                case 9:
                    break;
                default:
                    System.out.println("Invalid Option");
            }

        }
    }

    public int getSize() {
        return people.size();
    }
}
