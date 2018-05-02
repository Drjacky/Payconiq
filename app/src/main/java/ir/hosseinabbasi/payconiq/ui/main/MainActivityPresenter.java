package ir.hosseinabbasi.payconiq.ui.main;

import android.util.Log;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observable;
import ir.hosseinabbasi.payconiq.data.DataManager;
import ir.hosseinabbasi.payconiq.data.db.model.Response;
import ir.hosseinabbasi.payconiq.ui.base.BasePresenter;
import ir.hosseinabbasi.payconiq.ui.base.IBasePresenter;
import ir.hosseinabbasi.payconiq.utils.rx.RxDisposableFactory;
import ir.hosseinabbasi.payconiq.utils.rx.RxDisposables;
import ir.hosseinabbasi.payconiq.utils.rx.ThreadTransformer;

/**
 * Created by Dr.jacky on 2018/04/27.
 */
public class MainActivityPresenter<V extends IMainActivityView> extends BasePresenter<V> implements IMainActivityPresenter<V> {

    private static final String TAG = MainActivityPresenter.class.getSimpleName();

    private final ThreadTransformer threadTransformer;
    private final RxDisposables disposables;

    @Inject
    public MainActivityPresenter(DataManager dataManager,
                                 ThreadTransformer threadTransformer,
                                 RxDisposableFactory rxDisposableFactory) {
        super(dataManager, threadTransformer, rxDisposableFactory);
        this.threadTransformer = getThreadTransformer();
        this.disposables = getRxDisposables();
    }

    @Override
    public void getResponse(Map<String, String> params) {
        getBaseView().showLoading();
        getBaseView().setIsLoading(true);

        disposables.add(getDataManager().getResponse(params)
                .compose(threadTransformer.applySchedulers())
                .subscribe(response -> {
                    getBaseView().hideLoading();
                    getBaseView().setIsLoading(false);
                    getBaseView().loadResponseList(response);
                }, throwable -> {
                    getBaseView().hideLoading();
                    getBaseView().setIsLoading(false);
                    getBaseView().onError(throwable.getMessage());
                    Log.wtf(TAG, throwable.getMessage() + "");
                }));
    }
}
