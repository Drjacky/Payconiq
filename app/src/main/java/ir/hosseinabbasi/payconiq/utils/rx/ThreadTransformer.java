package ir.hosseinabbasi.payconiq.utils.rx;

import io.reactivex.ObservableTransformer;

/**
 * Created by Dr.jacky on 2018/04/27.
 */
public interface ThreadTransformer {
    <T> ObservableTransformer<T, T> applySchedulers();
}
