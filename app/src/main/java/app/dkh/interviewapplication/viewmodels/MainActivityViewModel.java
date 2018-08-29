package app.dkh.interviewapplication.viewmodels;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import java.util.List;

import app.dkh.interviewapplication.models.FoodItem;
import app.dkh.interviewapplication.models.FoodResponse;
import app.dkh.interviewapplication.webService.ApiService;
import app.dkh.interviewapplication.webService.RestClient;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityViewModel extends RealmViewModel {

public  static  String TAG = MainActivityViewModel.class.getSimpleName();

    public MutableLiveData<FoodItem[]> foodItems;
    public MainActivityViewModel() {
        super();
        foodItems = new MutableLiveData<>();
        HandleLoadItems();
        // Call getRealm() to get a Realm instance that is managed by the view model
    }

    private void HandleLoadItems() {

        ApiService apiService =  RestClient.GetClient().create(ApiService.class);
         apiService.GetFoodItems()
                 // Run on a background thread
                 .subscribeOn(Schedulers.io())
                 // Be notified on the main thread
                 .observeOn(AndroidSchedulers.mainThread())
                 .subscribeWith(new DisposableSingleObserver<FoodResponse>() {


                     @Override
                     public void onSuccess(FoodResponse foodResponse) {
                         foodItems.setValue(foodResponse.getItems());
                     }

                     @Override
                     public void onError(Throwable e) {

                     }
                 });

    }

    // TODO: Fill out the rest of the class

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void HandleWhenLifeCycleResumed(){
        Log.d(TAG , "View Model Resumed");
    }


}
