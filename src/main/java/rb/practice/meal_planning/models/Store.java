package rb.practice.meal_planning.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Store extends AbstractEntity {

    //fields
    @NotBlank
    private String location;

    //empty constructor
    public Store() {
    }

    //loaded constructor that calls
    public Store(String name, String location) {
        super(name);
        this.location = location;
    }

    //getters/setters for location field
    public @NotBlank String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank String location) {
        this.location = location;
    }
}
