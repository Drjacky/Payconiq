package ir.hosseinabbasi.payconiq.di.component;

import dagger.Component;
import ir.hosseinabbasi.payconiq.di.PerActivity;
import ir.hosseinabbasi.payconiq.di.module.ActivityModule;

/**
 * Created by Dr.jacky on 2018/04/26.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
}