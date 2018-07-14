package app.dkh.interviewapplication.views;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.dkh.interviewapplication.R;
import app.dkh.interviewapplication.models.FoodItem;
import app.dkh.interviewapplication.viewmodels.MainActivityViewModel;
import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    private MainActivityViewModel _viewModel;

    // TODO: Implement the views. You decide whether you want to use fragments, activities or
    // something else for displaying the content of the app

    // TODO: Feel free to restructure the classes (add more folders, classes, move classes)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _viewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);
    }
}
