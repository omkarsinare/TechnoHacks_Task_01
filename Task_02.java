import java.util.ArrayList;
import java.util.Scanner;

public class To_Do_List {
    private static ArrayList<String> toDoItems = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== To-Do List =====");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    viewItems();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private static void addItem() {
        System.out.print("Enter the new item: ");
        String newItem = scanner.nextLine();
        toDoItems.add(newItem);
        System.out.println("Item added successfully!");
    }

    private static void removeItem() {
        if (toDoItems.isEmpty()) {
            System.out.println("The to-do list is empty. Nothing to remove.");
        } else {
            System.out.println("Current items in the to-do list:");
            viewItems();
            System.out.print("Enter the index of the item to remove: ");
            int index = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (index >= 0 && index < toDoItems.size()) {
                String removedItem = toDoItems.remove(index);
                System.out.println("'" + removedItem + "' removed from the to-do list.");
            } else {
                System.out.println("Invalid index. Please enter a valid index.");
            }
        }
    }

    private static void viewItems() {
        if (toDoItems.isEmpty()) {
            System.out.println("The to-do list is empty.");
        } else {
            System.out.println("Current items in the to-do list:");
            for (int i = 0; i < toDoItems.size(); i++) {
                System.out.println(i + ". " + toDoItems.get(i));
            }
        }
    }
}
