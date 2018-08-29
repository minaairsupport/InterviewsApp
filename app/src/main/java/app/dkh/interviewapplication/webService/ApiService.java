package app.dkh.interviewapplication.webService;

import java.util.List;
import java.util.Observable;

import app.dkh.interviewapplication.models.FoodItem;
import app.dkh.interviewapplication.models.FoodResponse;
import io.reactivex.Flowable;
import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

public interface ApiService {

    @GET("bins/kvdzh")
    Single<FoodResponse> GetFoodItems();

}
