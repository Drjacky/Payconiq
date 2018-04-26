package ir.hosseinabbasi.payconiq.di.component;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Component;
import ir.hosseinabbasi.payconiq.MyApplication;
import ir.hosseinabbasi.payconiq.di.ApplicationContext;
import ir.hosseinabbasi.payconiq.di.module.ApplicationModule;

/**
 * Created by Dr.jacky on 2018/04/26.
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(MyApplication app);

    @ApplicationContext
    Context context();

    Resources exposeResources();

    Application exposeApplication();
}
