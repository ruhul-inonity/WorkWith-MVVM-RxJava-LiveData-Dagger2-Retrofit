package com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.R;
import com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.base.BaseActivity;
import com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.ui.list.ListFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected int layoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null)
            getSupportFragmentManager().beginTransaction().add(R.id.screenContainer, new ListFragment()).commit();
    }
}
