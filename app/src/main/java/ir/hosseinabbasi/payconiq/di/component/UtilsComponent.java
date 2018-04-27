package ir.hosseinabbasi.payconiq.di.component;

import ir.hosseinabbasi.payconiq.utils.rx.ThreadTransformer;

/**
 * Created by Dr.jacky on 2018/04/27.
 */
public interface UtilsComponent {
    ThreadTransformer exposeThreadTransformer();
}
