package ir.hosseinabbasi.payconiq;

import android.content.Context;
import android.support.multidex.MultiDexApplication;

/**
 * Created by Dr.jacky on 2018/04/26.
 */

public class MyApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }
}
