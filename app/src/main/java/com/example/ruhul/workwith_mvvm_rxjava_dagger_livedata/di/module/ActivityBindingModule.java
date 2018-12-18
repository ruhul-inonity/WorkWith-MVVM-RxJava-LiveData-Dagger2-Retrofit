package com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.di.module;

import com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.ui.main.MainActivity;
import com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.ui.main.MainFragmentBindingModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by ruhul on 17,December,2018
 */
@Module
public abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = {MainFragmentBindingModule.class})
    abstract MainActivity bindMainActivity();
}
