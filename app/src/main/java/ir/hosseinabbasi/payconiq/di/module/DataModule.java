package ir.hosseinabbasi.payconiq.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ir.hosseinabbasi.payconiq.data.RealmManager;

/**
 * Created by Dr.jacky on 2018/04/26.
 */
@Module
public class DataModule {

    @Provides
    @Singleton
    RealmManager realmManager(){
        return new RealmManager();
    }
}
