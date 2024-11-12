package rb.practice.meal_planning.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class RecipeLink extends AbstractEntity{

    //fields
    @NotBlank
    @Pattern(regexp = "^(https?|ftp):\\/\\/[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)+([\\/\\w\\-\\?%&=]*)?$", message = "Invalid URL format")
    private String url;

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
