package com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.ui.main;

import com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.ui.detail.DetailsFragment;
import com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.ui.list.ListFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by ruhul on 18,December,2018
 */
@Module
public abstract class MainFragmentBindingModule {

    @ContributesAndroidInjector
    abstract ListFragment provideListFragment();

    @ContributesAndroidInjector
    abstract DetailsFragment provideDetailsFragment();
}
