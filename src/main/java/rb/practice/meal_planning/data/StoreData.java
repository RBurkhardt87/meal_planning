package rb.practice.meal_planning.data;

import rb.practice.meal_planning.models.Ingredient;
import rb.practice.meal_planning.models.Store;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StoreData {
    private static final Map<Integer, Store> stores = new HashMap<>();

    public static Collection<Store> getAll() {
        return stores.values();
    }

    public static Store getById(int id) {
        return stores.get(id);
    }

    public static void add(Store store) {
        stores.put(store.getId(), store);
    }

    public static void remove(int id) {
        stores.remove(id);
    }
}
