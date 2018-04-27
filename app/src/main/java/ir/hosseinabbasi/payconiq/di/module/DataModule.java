package ir.hosseinabbasi.payconiq.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ir.hosseinabbasi.payconiq.data.db.DbService;
import ir.hosseinabbasi.payconiq.data.db.IDbService;
import ir.hosseinabbasi.payconiq.data.db.RealmManager;

/**
 * Created by Dr.jacky on 2018/04/26.
 */
@Module
public class DataModule {

    @Provides
    IDbService provideIDbService(DbService dbService){
        return dbService;
    }

    @Provides
    @Singleton
    RealmManager provideRealmManager(){
        return new RealmManager();
    }
}
