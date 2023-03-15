package list_of_guest;

import java.util.Scanner;

public class GuestList {
    static Scanner scanner = new Scanner(System.in);
    static String[] guests = new String[10];

    public static void main(String[] args) {

        do {
            printGuests();
            menu();

            int option = getInput();
            if (option == 1) {
                addGuest();
                System.out.println("______________________");
            } else if (option == 2) {
                removeGuest();
                System.out.println("______________________");
            } else if (option == 3) {
                insertTestNames();
                System.out.println("______________________");
            } else if (option == 4) {
                renameGuest();
                System.out.println("______________________");
            } else if (option == 5) {
                switchPosition();
                System.out.println("______________________");
            } else if (option == 6) {
                System.out.println("Exiting...");
                break;
            }
        } while (true);
    }

    private static void switchPosition() {
        System.out.print("index num: ");
        int guestIndex = scanner.nextInt();
        scanner.nextLine();

        if (guestIndex > 0 && guests[guestIndex - 1] != null) {
            System.out.println("Write new name below:");
            String name = scanner.nextLine();

            for (int i = guests.length - 1; i > guestIndex - 1; i--) {
                guests[i] = guests[i - 1];
            }
            guests[guestIndex - 1] = name;

        } else {
            System.out.println("There is no name under that number.");
        }
    }


    private static void renameGuest() {
        System.out.println("Which of the guest do you want to rename?");
        System.out.print("index num: ");

        int guestIndex = scanner.nextInt();
        scanner.nextLine();
        if (guestIndex > 0 && guests[guestIndex - 1] != null) {
            System.out.println("Write new name below:");
            guests[guestIndex - 1] = scanner.nextLine();
        } else {
            System.out.println("There is no name under that number.");
        }
    }

    private static int getInput() {
        System.out.print("Option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    private static void menu() {
        System.out.println("1 - Add Guest");
        System.out.println("2 - Remove Guest");
        System.out.println("3 - Test names");
        System.out.println("4 - Rename Guest ");
        System.out.println("5 - Switch position");
        System.out.println("6 - Exit");
        System.out.println("______________________");
        System.out.println("");
    }

    static void printGuests() {
        System.out.println(" - Menu - \n\nGuests list:");
        String[] temp = new String[guests.length];
        int ti = 0;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                temp[ti] = guests[i];
                ti++;
            }
        }
        guests = temp;
        int isEmpty = 0;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                System.out.print((i + 1) + ". ");
                System.out.println(guests[i]);
            } else {
                isEmpty++;
            }
        }
        if (isEmpty == guests.length) {
            System.out.println("Guest list is empty");
        }
        System.out.println("______________________");
    }

    static void addGuest() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print("Name: ");
                guests[i] = scanner.nextLine();
                break;
            }
        }
    }

    static void removeGuest() {
        boolean removeGuest = true;
        while (removeGuest) {

            System.out.println("Delete position by:");
            System.out.println("1. Name");
            System.out.println("2. Index number");
            System.out.println("3. Quit");
            System.out.print("Your choice:");

            int userChoose = scanner.nextInt();
            scanner.nextLine();

            switch (userChoose) {
                case 1:
                    System.out.println("(Type 'Exit' to quit)");
                    System.out.print("Name: ");
                    String name = scanner.next();
                    for (int i = 0; i < guests.length; i++) {
                        if (guests[i] != null && guests[i].equals(name)) {
                            guests[i] = null;
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("(Type 'Exit' to quit)");
                    System.out.println("Index of a position");
                    int positionToDelete = scanner.nextInt();
                    scanner.nextLine();

                    int numOfGuest = 0;
                    for (int temp = 0; temp < guests.length; temp++) {
                        if (guests[temp] != null) {
                            numOfGuest++;
                        }
                    }
                    if (positionToDelete > numOfGuest || positionToDelete < 0) {
                        System.out.println("Error: There is no guest with that number.");
                    } else {
                        guests[positionToDelete - 1] = null;
                    }
                    break;

                case 3:
                    removeGuest = false;
                    break;

                default:
                    System.out.println("There is only option for 1 or 2. Try again");
            }
        }

        String[] temp = new String[guests.length];
        int ti = 0;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                temp[ti] = guests[i];
                ti++;
            }
        }
        guests = temp;
        System.out.println("______________________");
    }

    static void insertTestNames() {
        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Molly";
        guests[4] = "Christopher";

    }

}
