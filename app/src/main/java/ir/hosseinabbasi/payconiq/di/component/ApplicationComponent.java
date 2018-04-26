package ir.hosseinabbasi.payconiq.di.component;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Component;
import ir.hosseinabbasi.payconiq.MyApplication;
import ir.hosseinabbasi.payconiq.data.RealmManager;
import ir.hosseinabbasi.payconiq.di.ApplicationContext;
import ir.hosseinabbasi.payconiq.di.module.ApplicationModule;
import ir.hosseinabbasi.payconiq.di.module.DataModule;

/**
 * Created by Dr.jacky on 2018/04/26.
 */
@Singleton
@Component(modules = {ApplicationModule.class, DataModule.class})
public interface ApplicationComponent extends DataComponent{
    void inject(MyApplication app);

    @ApplicationContext
    Context context();

    Resources exposeResources();

    Application exposeApplication();

    RealmManager exposeRealmManager();
}
