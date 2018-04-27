package ir.hosseinabbasi.payconiq.ui.base;

import android.support.annotation.StringRes;

/**
 * Created by Dr.jacky on 2018/04/27.
 */
public interface IBaseView {
    void showLoading();
    void hideLoading();
    void onError(@StringRes int resId);
    void onError(String message);
    boolean isNetworkConnected();
}
