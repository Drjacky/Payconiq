package ir.hosseinabbasi.payconiq;

import android.content.Context;
import android.support.multidex.MultiDexApplication;

import ir.hosseinabbasi.payconiq.di.component.ApplicationComponent;
import ir.hosseinabbasi.payconiq.di.component.DaggerApplicationComponent;
import ir.hosseinabbasi.payconiq.di.module.ApplicationModule;

/**
 * Created by Dr.jacky on 2018/04/26.
 */

public class MyApplication extends MultiDexApplication {
    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

    private void initComponents(){
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        mApplicationComponent.inject(this);
    }
}
