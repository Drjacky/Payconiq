package ir.hosseinabbasi.payconiq.utils.rx;

import javax.inject.Inject;

import ir.hosseinabbasi.payconiq.utils.rx.impl.CompositeDisposablesImpl;

/**
 * Created by Dr.jacky on 2018/04/27.
 */
public class RxDisposableFactory {
    @Inject
    public RxDisposableFactory() {
    }

    public RxDisposables get() {
        return new CompositeDisposablesImpl();
    }
}
