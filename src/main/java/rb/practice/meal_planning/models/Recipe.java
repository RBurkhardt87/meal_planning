package rb.practice.meal_planning.models;

import jakarta.persistence.Entity;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Recipe extends AbstractEntity {

    //fields
    @NotBlank
    private String description;

    @Min(1)
    private int servings;

    @Min(1)
    private int cookTimeMins;

    //TODO: this will become a many to many relationship
    //it will need to become a list and correct annotation added
    @NotNull
    private Ingredient ingredient;

    //TODO: this will become a one to one relationship
    //it will need to have proper annotation for one link per recipe
    @NotNull
    private RecipeLink recipeLink;


}
