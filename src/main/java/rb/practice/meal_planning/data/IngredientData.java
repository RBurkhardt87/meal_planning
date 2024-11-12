package rb.practice.meal_planning.data;

import rb.practice.meal_planning.models.Ingredient;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class IngredientData {
    private static final Map<Integer, Ingredient> ingredients = new HashMap<>();

    public static Collection<Ingredient> getAll() {
        return ingredients.values();
    }

    public static Ingredient getById(int id) {
        return ingredients.get(id);
    }

    public static void add(Ingredient ingredient) {
        ingredients.put(ingredient.getId(), ingredient);
    }

    public static void remove(int id) {
        ingredients.remove(id);
    }
}
