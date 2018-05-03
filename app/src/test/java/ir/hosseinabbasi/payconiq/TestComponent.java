package ir.hosseinabbasi.payconiq;

import javax.inject.Singleton;

import dagger.Component;
import ir.hosseinabbasi.payconiq.data.network.IApiService;
import ir.hosseinabbasi.payconiq.di.component.NetComponent;
import ir.hosseinabbasi.payconiq.di.module.NetModule;

/**
 * Created by Dr.jacky on 2018/05/03.
 */
@Singleton
@Component(modules = NetModule.class)
public interface TestComponent extends NetComponent{
    void inject(ApiServiceUnitTest2 test);

    @Override
    IApiService exposeIApiService();
}
