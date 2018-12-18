package com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.base;

import com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.di.component.ApplicationComponent;
import com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.di.component.DaggerApplicationComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by ruhul on 17,December,2018
 */
public class BaseApplication extends dagger.android.support.DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<? extends dagger.android.support.DaggerApplication> applicationInjector() {
        ApplicationComponent component = DaggerApplicationComponent.builder().application(this).build();
        component.inject(this);

        return component;
    }
}

