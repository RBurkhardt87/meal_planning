package rb.practice.meal_planning.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class RecipeLink extends AbstractEntity{


    //fields
    @NotBlank
    @Pattern(regexp = "^(https?|ftp):\\/\\/[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)+([\\/\\w\\-\\?%&=]*)?$", message = "Invalid URL format")
    private String url;


    //TODO: this will become a one to one relationship with recipes, proper annotation will be needed.
    //think on if this needs to bidirectional or not. I don't think it does. The link doesn't need to access the recipe, the recipe is what needs to be aware of the link, right?
    private Recipe recipe;

    //empty constructor
    public RecipeLink() {
    }

    //loaded constructor that calls the parent class
    public RecipeLink(String name, String url) {
        super(name);
        this.url = url;
    }

    //getters/setters for field
    public @NotBlank @Pattern(regexp = "^(https?|ftp):\\/\\/[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)+([\\/\\w\\-\\?%&=]*)?$", message = "Invalid URL format") String getUrl() {
        return url;
    }

    public void setUrl(@NotBlank @Pattern(regexp = "^(https?|ftp):\\/\\/[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)+([\\/\\w\\-\\?%&=]*)?$", message = "Invalid URL format") String url) {
        this.url = url;
    }
}
