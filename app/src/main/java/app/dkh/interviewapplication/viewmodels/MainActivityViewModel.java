package app.dkh.interviewapplication.viewmodels;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import java.util.List;

import app.dkh.interviewapplication.models.FoodItem;
import app.dkh.interviewapplication.webService.ApiService;
import app.dkh.interviewapplication.webService.RestClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityViewModel extends RealmViewModel {

public  static  String TAG = MainActivityViewModel.class.getSimpleName();

    MutableLiveData<List<FoodItem>> foodItems;
    public MainActivityViewModel() {
        super();
        foodItems = new MutableLiveData<>();
        HandleLoadItems();
        // Call getRealm() to get a Realm instance that is managed by the view model
    }

    private void HandleLoadItems() {
       ApiService apiService =  RestClient.GetClient().create(ApiService.class);
       Call<List<FoodItem>> callback = apiService.GetFoodItems();
       callback.enqueue(new Callback<List<FoodItem>>() {
           @Override
           public void onResponse(Call<List<FoodItem>> call, Response<List<FoodItem>> response) {
               foodItems.setValue( response.body());
               Log.d(TAG , "items retrieved with size " + response.body().size());
           }

           @Override
           public void onFailure(Call<List<FoodItem>> call, Throwable t) {

           }
       });

    }

    // TODO: Fill out the rest of the class

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void HandleWhenLifeCycleResumed(){
        Log.d(TAG , "View Model Resumed");
    }


}
