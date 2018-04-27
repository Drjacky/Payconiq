package ir.hosseinabbasi.payconiq.ui.base;

import javax.inject.Inject;

import ir.hosseinabbasi.payconiq.data.DataManager;
import ir.hosseinabbasi.payconiq.utils.rx.RxDisposableFactory;
import ir.hosseinabbasi.payconiq.utils.rx.RxDisposables;
import ir.hosseinabbasi.payconiq.utils.rx.ThreadTransformer;

/**
 * Created by Dr.jacky on 2018/04/27.
 */
public class BasePresenter<V extends IBaseView> implements IBasePresenter<V> {

    private static final String TAG = "BasePresenter";

    private final DataManager mDataManager;
    private final ThreadTransformer mThreadTransformer;
    private final RxDisposables mDisposables;

    private V mBaseView;

    @Inject
    public BasePresenter(DataManager dataManager,
                         ThreadTransformer threadTransformer,
                         RxDisposableFactory rxDisposableFactory) {
        this.mDataManager = dataManager;
        this.mThreadTransformer = threadTransformer;
        this.mDisposables = rxDisposableFactory.get();
    }

    @Override
    public void onAttach(V view) {
        mBaseView = view;
    }

    @Override
    public void onDetach() {
        mDisposables.clear();
        mBaseView = null;
    }


    public boolean isViewAttached() {
        return mBaseView != null;
    }

    public V getBaseView() {
        return mBaseView;
    }

    public void checkViewAttached() {
        if (!isViewAttached()) throw new BaseViewNotAttachedException();
    }

    public DataManager getDataManager() {
        return mDataManager;
    }

    public ThreadTransformer getThreadTransformer() {
        return mThreadTransformer;
    }

    public RxDisposables getRxDisposables() {
        return mDisposables;
    }

    public static class BaseViewNotAttachedException extends RuntimeException {
        public BaseViewNotAttachedException() {
            super("Please call Presenter.onAttach(IBaseView) before" +
                    " requesting data to the Presenter");
        }
    }
}
