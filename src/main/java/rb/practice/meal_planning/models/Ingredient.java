package rb.practice.meal_planning.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
public class Ingredient extends AbstractEntity {

    @Min(value = 1, message = "Quantity must be at least one.")
    private int quantity;

    //TODO: this will end up being a one to many with stores. It will become a list
    @NotNull
    private Store store;

    //Generate an empty constructor for hibernate
    public Ingredient() {
    }

    //Generate a loaded constructor that calls to the parent one
    public Ingredient(String name, int quantity, Store store) {
        super(name);
        this.quantity = quantity;
        this.store = store;
    }

    //getters for the fields
    @Min(value = 1, message = "Quantity must be at least one.")
    public int getQuantity() {
        return quantity;
    }

    public @NotNull Store getStore() {
        return store;
    }

    //setters for the fields
    public void setQuantity(@Min(value = 1, message = "Quantity must be at least one.") int quantity) {
        this.quantity = quantity;
    }

    public void setStore(@NotNull Store store) {
        this.store = store;
    }
}