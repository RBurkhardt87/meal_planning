package rb.practice.meal_planning.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;


public class Ingredient extends AbstractEntity {

    @Min(value = 1, message = "Quantity must be at least one.")
    private int quantity;

    //TODO: this will end up being a one to many with stores. It will become a list
   //TODO: add validation back on so it can't be blank
//    private Store store;

    //Generate an empty constructor for hibernate
    public Ingredient() {
    }

    //Generate a loaded constructor that calls to the parent one
    public Ingredient(String name, int quantity) {
        super(name);
        this.quantity = quantity;

    }

    //getters for the fields
    @Min(value = 1, message = "Quantity must be at least one.")
    public int getQuantity() {
        return quantity;
    }



    //setters for the fields
    public void setQuantity(@Min(value = 1, message = "Quantity must be at least one.") int quantity) {
        this.quantity = quantity;
    }

}
