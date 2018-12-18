package com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.di.component;

import android.app.Application;

import com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.base.BaseApplication;
import com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.di.module.ActivityBindingModule;
import com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.di.module.ApplicationModule;
import com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.di.module.ContextModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by ruhul on 20,November,2018
 */
@Singleton
@Component(modules = {ContextModule.class, ApplicationModule.class, AndroidSupportInjectionModule.class, ActivityBindingModule.class})
public interface ApplicationComponent extends AndroidInjector<dagger.android.support.DaggerApplication> {

    void inject(BaseApplication application);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        ApplicationComponent build();
    }
}
