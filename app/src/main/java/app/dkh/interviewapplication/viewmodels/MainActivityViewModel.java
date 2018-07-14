package app.dkh.interviewapplication.viewmodels;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

public class MainActivityViewModel extends RealmViewModel {

public  static  String TAG = MainActivityViewModel.class.getSimpleName();

    public MainActivityViewModel() {
        super();

        // Call getRealm() to get a Realm instance that is managed by the view model
    }

    // TODO: Fill out the rest of the class

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void HandleWhenLifeCycleResumed(){
        Log.d(TAG , "View Model Resumed");
    }

}
