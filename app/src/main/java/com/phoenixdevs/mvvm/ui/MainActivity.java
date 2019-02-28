package com.phoenixdevs.mvvm.ui;

import com.phoenixdevs.mvvm.BR;
import com.phoenixdevs.mvvm.BaseViewModel.activities.BindingActivity;
import com.phoenixdevs.mvvm.R;
import com.phoenixdevs.mvvm.databinding.ActivityMainBinding;

import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends BindingActivity<ActivityMainBinding, MainViewModel> {

    @Override
    public MainViewModel onCreate() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        return new MainViewModel(this);
    }

    @Override
    public int getVariable() {
        return BR.MainsViewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}