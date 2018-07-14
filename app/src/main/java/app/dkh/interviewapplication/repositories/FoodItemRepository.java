package app.dkh.interviewapplication.repositories;

import java.util.Collection;

import app.dkh.interviewapplication.models.FoodItem;
import io.realm.Realm;
import retrofit2.Retrofit;

public class FoodItemRepository {
    // TODO: return all food items

    // Use this realm instance for all database queries
    private Realm _realm;

    public FoodItemRepository(Realm realm) {
        _realm = realm;
    }

    // TODO: This is just an example, you are allowed to change all the functions (names, arguments, return types, remove them, add new)
    public Collection<FoodItem> getFoodItems() {
        return null;
    }

    public FoodItem getFoodItem(String id) {
        return null;
    }
}
