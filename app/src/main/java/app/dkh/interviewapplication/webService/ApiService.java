package app.dkh.interviewapplication.webService;

import java.util.List;

import app.dkh.interviewapplication.models.FoodItem;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

public interface ApiService {

    @GET("bins/kvdzh")
    public Call<List<FoodItem>> GetFoodItems();

}
