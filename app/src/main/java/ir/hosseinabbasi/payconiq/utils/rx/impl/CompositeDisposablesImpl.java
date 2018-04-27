package ir.hosseinabbasi.payconiq.utils.rx.impl;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import ir.hosseinabbasi.payconiq.utils.rx.RxDisposables;

/**
 * Created by Dr.jacky on 2018/04/27.
 */
public final class CompositeDisposablesImpl implements RxDisposables{

    CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Inject
    public CompositeDisposablesImpl() {
    }

    @Override
    public void add(Disposable subscription) {
        compositeDisposable.add(subscription);
    }

    @Override
    public void clear() {
        compositeDisposable.clear();
    }
}
