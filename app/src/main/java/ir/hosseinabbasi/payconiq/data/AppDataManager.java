package ir.hosseinabbasi.payconiq.data;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

import ir.hosseinabbasi.payconiq.data.db.IDbService;
import ir.hosseinabbasi.payconiq.di.ApplicationContext;

/**
 * Created by Dr.jacky on 2018/04/26.
 */
@Singleton
public class AppDataManager implements DataManager {
    private static final String TAG = "AppDataManager";

    private final Context mContext;
    private final IDbService mDbService;

    @Inject
    public AppDataManager(@ApplicationContext Context context,
                          IDbService dbService) {
        mContext = context;
        mDbService = dbService;
    }
}
