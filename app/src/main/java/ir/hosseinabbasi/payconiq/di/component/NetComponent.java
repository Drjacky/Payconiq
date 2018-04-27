package ir.hosseinabbasi.payconiq.di.component;

import javax.inject.Singleton;

import ir.hosseinabbasi.payconiq.data.network.IApiService;

/**
 * Created by Dr.jacky on 2018/04/26.
 */
@Singleton
public interface NetComponent {
    @Singleton
    IApiService exposeIApiService();
}
