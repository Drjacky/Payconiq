package ir.hosseinabbasi.payconiq;

import org.mockito.Mockito;

import ir.hosseinabbasi.payconiq.data.network.IApiService;
import ir.hosseinabbasi.payconiq.di.module.NetModule;
import retrofit2.Retrofit;

/**
 * Created by Dr.jacky on 2018/05/03.
 */
public class TestModule extends NetModule {
    @Override
    public IApiService provideApiService(Retrofit retrofit) {
        return Mockito.mock(IApiService.class);
    }

    @Override
    public Retrofit provideRetrofit() {
        return Mockito.mock(Retrofit.class);
    }
}
