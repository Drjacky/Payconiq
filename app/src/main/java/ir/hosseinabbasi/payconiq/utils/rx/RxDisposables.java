package ir.hosseinabbasi.payconiq.utils.rx;

import io.reactivex.disposables.Disposable;

/**
 * Created by Dr.jacky on 2018/04/27.
 */
public interface RxDisposables {
    void add(Disposable disposable);

    void clear();
}
