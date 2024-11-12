package rb.practice.meal_planning.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;

public class Store extends AbstractEntity {

    //fields
    @NotBlank
    private String storeLocation;

    //empty constructor
    public Store() {
    }

    //loaded constructor that calls
    public Store(String name, String storeLocation) {
        super(name);
        this.storeLocation = storeLocation;
    }

    //getters/setters for location field
    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }
}
