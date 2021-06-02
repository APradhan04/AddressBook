import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        boolean flag = true;
        while (flag) {
            if (addressBook.getSize() < 1) {
                System.out.println("1. Add Person to Address Book");
                System.out.println("2. Quit");
                int y = scan.nextInt();
                if (y == 1) {
                    addressBook.addPerson();
                } else if (y == 2) {
                    flag = false;
                } else {
                    System.out.println("Please Choose Again");
                }
            }
            System.out.println("\nAddress Book Menu: ");
            System.out.println("1. Display Address Book");
            System.out.println("2. Search Address Book");
            System.out.println("3. Add Person to Address Book");
            System.out.println("4. Delete Person from Address Book");
            System.out.println("5. Edit Person from Address Book");
            System.out.println("6. Quit");
            System.out.println("Choose a number: ");
            int x = scan.nextInt();
            if (x == 1) {
                addressBook.printBook();
            } else if (x == 2) {
                addressBook.searchBook();
            } else if (x == 3) {
                addressBook.addPerson();
            } else if (x == 4) {
                addressBook.delPerson();
            } else if (x == 5) {
                addressBook.editPerson();
            } else if (x == 6) {
                flag = false;
            } else {
                System.out.println("Please Choose Again");
            }
        }

    }
}
