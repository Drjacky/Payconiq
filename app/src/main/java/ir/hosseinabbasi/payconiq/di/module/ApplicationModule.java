package ir.hosseinabbasi.payconiq.di.module;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ir.hosseinabbasi.payconiq.di.ApplicationContext;

/**
 * Created by Dr.jacky on 2018/04/26.
 */
@Module
public class ApplicationModule {
    private final Application mApplication;

    public ApplicationModule(Application application) {
        this.mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideApplicationContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    Resources provideAppResources() {
        return mApplication.getResources();
    }
}
