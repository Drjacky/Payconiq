package ir.hosseinabbasi.payconiq.di.component;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Component;
import ir.hosseinabbasi.payconiq.MyApplication;
import ir.hosseinabbasi.payconiq.data.DataManager;
import ir.hosseinabbasi.payconiq.data.db.RealmManager;
import ir.hosseinabbasi.payconiq.data.network.IApiService;
import ir.hosseinabbasi.payconiq.di.ApplicationContext;
import ir.hosseinabbasi.payconiq.di.module.ApplicationModule;
import ir.hosseinabbasi.payconiq.di.module.DataModule;
import ir.hosseinabbasi.payconiq.di.module.NetModule;

/**
 * Created by Dr.jacky on 2018/04/26.
 */
@Singleton
@Component(modules = {ApplicationModule.class, DataModule.class, NetModule.class})
public interface ApplicationComponent extends DataComponent, NetComponent{
    void inject(MyApplication app);

    @ApplicationContext
    Context context();

    Resources exposeResources();

    Application exposeApplication();

    DataManager getDataManager();

    RealmManager exposeRealmManager();

    @Override
    IApiService exposeIApiService();
}
