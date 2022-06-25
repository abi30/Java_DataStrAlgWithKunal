package Udemy;


import java.util.ArrayList;

/**
 * Created by dev on 23/08/15.
 */
public class GroceryList105 {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem,String newItem){
        int position =this.findItem(currentItem);
        if(position>=0){
            modifyGroceryItem(position,newItem);
        }

    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(String newItem) {
        int position =this.findItem(newItem);
        if(position>=0){
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }


    // extra function
    public boolean removeGroceryItemByName(String theItem) {

        boolean exists= groceryList.contains(theItem);

        if(exists){
            int position=groceryList.indexOf(theItem);
            groceryList.remove(position);
            return true;
         }
        return false;
    }


    private int findItem(String searchItem) {

    return groceryList.indexOf(searchItem);
    }


    public boolean onFile(String searchItem){
        int position=findItem(searchItem);
        if(position>=0){
            return true;
        }
        return true;
    }
}
