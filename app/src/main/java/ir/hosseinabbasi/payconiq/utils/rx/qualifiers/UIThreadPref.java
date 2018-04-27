package ir.hosseinabbasi.payconiq.utils.rx.qualifiers;

import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Dr.jacky on 2018/04/27.
 */
@Qualifier
@Retention(RUNTIME)
public @interface UIThreadPref {
}
