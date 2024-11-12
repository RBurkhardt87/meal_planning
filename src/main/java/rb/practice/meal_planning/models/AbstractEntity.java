package rb.practice.meal_planning.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotBlank;

import java.util.Objects;


public abstract class AbstractEntity {

    //Add the id and name fields to be shared across all the classes
    //Add @Id & @GeneratedValue to the id field
    @Id
    @GeneratedValue
    private int id;

    //Add validation to name field
    @NotBlank
    private String name;

    //no need to generate a default constructor for hibernate, we will just make one
    // in each of the child classes since we are already going to be calling the loaded constructor defined here
    //? THAT DOESN'T SEEM TRUE. I WENT TO PUT EMPTY CONSTRUCTORS IN THE SUBCLASSES AND GOT ERRORS UNTIL I ADDED ONE HERE

    public AbstractEntity() {
    }

    //Generate a loaded constructor to take in the params
    public AbstractEntity(String name) {
        this.name = name;
    }


    //Getter for id and name
    public int getId() {
        return id;
    }

    public @NotBlank String getName() {
        return name;
    }

    //Setter for name
    public void setName(@NotBlank String name) {
        this.name = name;
    }

    //Generate a toString method
    @Override
    public String toString() {
        return "AbstractEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    //Generate an equals method and a hashcode method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
