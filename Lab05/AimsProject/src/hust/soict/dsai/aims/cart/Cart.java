	package hust.soict.dsai.aims.cart;
import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();

    public void addMedia(Media media) throws LimitExceededException {
        int size = itemsOrdered.size();
        if(size < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("The media has been added");
        }
        else {
            throw new LimitExceededException("ERROR: The number of media has reached its limit");
        }
    }

    public boolean removeMedia(Media media) {
        if (!itemsOrdered.contains(media)) {    // Check if the item existed
            System.out.println("No such item found");
            return false;
        } else {
            itemsOrdered.remove(media);
            System.out.println("Item removed");
            return true;
        }
    }

    public float totalCost() {
        float sum = 0f;
        // Iterate over the whole list of ordered items and sum up the prices
        for (Media item : itemsOrdered) {
            sum += item.getCost();
        }
        return sum;
    }

    public Media search(int id) {
        for (Media item : itemsOrdered) {
            if (item.getId() == id) {   // Iterate over the ordered item list and check if there is an id matching
                System.out.println("Item found");    // Return the item that matches
                return item;
            }
        }
        System.out.println("No item found");
        return null;    // If there is no item found, inform and return null
    }

    public Media search(String title) {
        for (Media item : itemsOrdered) {   // Iterate over the ordered item list and check if there is title matching
            if (item.getTitle().equals(title)) {
                System.out.println("Item found");
                return item;    // Return the item that matches
            }
        }
        System.out.println("No item found");
        return null;    // If there is no item found, notify and return null
    }

    public void print() {
        System.out.println("*********************** CART ***********************");
        for (Media item : itemsOrdered) {
            System.out.println(item.toString());
        }
        System.out.println("Total cost: $" + totalCost());   // Show the total cost
        System.out.println("****************************************************");
    }

    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
}
