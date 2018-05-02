package ir.hosseinabbasi.payconiq.di.module;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;
import ir.hosseinabbasi.payconiq.di.ActivityContext;
import ir.hosseinabbasi.payconiq.di.PerActivity;
import ir.hosseinabbasi.payconiq.ui.main.IMainActivityPresenter;
import ir.hosseinabbasi.payconiq.ui.main.IMainActivityView;
import ir.hosseinabbasi.payconiq.ui.main.MainActivityPresenter;

/**
 * Created by Dr.jacky on 2018/04/26.
 */
@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideActivityContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    @PerActivity
    IMainActivityPresenter<IMainActivityView> provideMainActivityPresenter(MainActivityPresenter<IMainActivityView>
                                                                                   presenter) {
        return presenter;
    }

}
