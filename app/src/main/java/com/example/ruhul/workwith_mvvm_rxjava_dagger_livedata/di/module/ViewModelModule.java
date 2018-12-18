package com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.di.module;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.di.util.ViewModelKey;
import com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.ui.detail.DetailsViewModel;
import com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.ui.list.ListViewModel;
import com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.util.ViewModelFactory;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by ruhul on 17,December,2018
 */
@Singleton
@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(ListViewModel.class)
    abstract ViewModel bindListViewModel(ListViewModel listViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(DetailsViewModel.class)
    abstract ViewModel bindDetailsViewModel(DetailsViewModel detailsViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);
}
