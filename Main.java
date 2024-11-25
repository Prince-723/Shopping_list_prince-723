import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ShoppingList shoppingList = new ShoppingList();
    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printMenu();

        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printMenu();
                    break;
                case 1:
                    shoppingList.printShoppingList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void searchItem() {
        System.out.print("Enter the item to search for: ");
           String item = scanner.nextLine();
            if (shoppingList.itemExist(item)){
                int position = shoppingList.searchItems(item);
                System.out.println("Found " + item + " in our shopping list" + "at position" + position);
            }else{
                System.out.println(item + " is not in our shopping list");
            }
    }

    private static void removeItem() {

            System.out.print("Enter item name to remove: ");
            String item = scanner.nextLine();
            if (shoppingList.itemExist(item)){
                shoppingList.removeShoppingItem(item);
            }else{
                System.out.println(item + " you wish to delete is not in the list!!");
            }


    }

    private static void modifyItem() {
        System.out.print("Enter the existing item: ");
        String currentItem = scanner.nextLine();
        if (shoppingList.itemExist(currentItem)){
            System.out.print("Enter the replacement item: ");
            String newItem = scanner.nextLine();
            shoppingList.modifyShoppingList(currentItem, newItem);
        }else{
            System.out.println(currentItem + " is not in the list");
        }
    }

    private static void addItem() {
        System.out.print("Enter the item name to add to list: ");
        shoppingList.addShoppingItem(scanner.nextLine());
    }

    private static void printMenu(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print menu options");
        System.out.println("\t 1 - To print the list of shopped items");
        System.out.println("\t 2 - To add item to the list");
        System.out.println("\t 3 - To modify item in the list");
        System.out.println("\t 4 - To remove item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application");
    }
}