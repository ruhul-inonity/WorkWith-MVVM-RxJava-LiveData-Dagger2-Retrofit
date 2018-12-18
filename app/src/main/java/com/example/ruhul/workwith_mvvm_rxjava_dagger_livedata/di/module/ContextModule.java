package com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.di.module;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by ruhul on 17,December,2018
 */

@Module
public abstract class ContextModule {

    @Binds
    abstract Context provideContext(Application application);
}
