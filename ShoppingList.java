import java.util.ArrayList;

public class ShoppingList {

    private final ArrayList<String> shoppingList = new ArrayList<>();

    public void addShoppingItem(String item){
        shoppingList.add(item);
    }

    public void printShoppingList(){
        System.out.println("You have " + shoppingList.size() + " items in your shopping list");
        for (int i = 0; i<shoppingList.size(); i++){
            System.out.println((i+1) + " . " + shoppingList.get(i));
        }
    }

    public void modifyShoppingList(String currentItem, String newItem){
        int position = searchItem(currentItem);
        if (position>=0){
            modifyShoppingList(position,newItem);
            System.out.println(currentItem + " has been modified to "+ newItem);
        }
    }

    private void modifyShoppingList(int position, String newItem){
        shoppingList.set(position, newItem);
    }

    public void removeShoppingItem(String item){
        int position = searchItem(item);
        if (position>=0){
            removeShoppingItem(position);
            System.out.println(item + " has been deleted successfully!!");
        }
    }

    private void removeShoppingItem(int position){
        shoppingList.remove(position);
    }

    private int searchItem(String item){
        return shoppingList.indexOf(item);
    }

    public int searchItems(String item){
        return shoppingList.indexOf(item);
    }

    public boolean itemExist(String item){
        int position = searchItem(item);
        return position >= 0;
    }

}