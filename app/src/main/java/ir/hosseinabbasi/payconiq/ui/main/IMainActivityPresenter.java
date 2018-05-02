package ir.hosseinabbasi.payconiq.ui.main;

import java.util.Map;

import ir.hosseinabbasi.payconiq.data.db.model.Response;
import ir.hosseinabbasi.payconiq.ui.base.IBasePresenter;

/**
 * Created by Dr.jacky on 2018/04/27.
 */
public interface IMainActivityPresenter<V extends IMainActivityView> extends IBasePresenter<V> {
    void getResponse(Map<String, String> params);
}
