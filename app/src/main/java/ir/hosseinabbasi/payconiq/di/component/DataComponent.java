package ir.hosseinabbasi.payconiq.di.component;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import ir.hosseinabbasi.payconiq.data.db.IDbService;

/**
 * Created by Dr.jacky on 2018/04/26.
 */
@Singleton
public interface DataComponent {
    @Singleton
    IDbService exposeIDbService();
}
