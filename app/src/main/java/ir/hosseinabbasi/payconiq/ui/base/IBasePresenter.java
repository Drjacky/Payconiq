package ir.hosseinabbasi.payconiq.ui.base;

/**
 * Created by Dr.jacky on 2018/04/27.
 */
public interface IBasePresenter<V extends IBaseView> {
    void onAttach(V baseView);
    void onDetach();
}
