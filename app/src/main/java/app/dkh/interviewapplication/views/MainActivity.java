package app.dkh.interviewapplication.views;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import app.dkh.interviewapplication.R;
import app.dkh.interviewapplication.models.FoodItem;
import app.dkh.interviewapplication.viewmodels.MainActivityViewModel;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    private MainActivityViewModel _viewModel;

    @BindView(R.id.itemsRecyclerView)
    RecyclerView itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        itemList.setLayoutManager(linearLayout);

        _viewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        _viewModel.foodItems.observe(this, foodItems -> {

        });

    }
}
