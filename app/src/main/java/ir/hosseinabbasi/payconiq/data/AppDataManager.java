package ir.hosseinabbasi.payconiq.data;

import android.content.Context;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import ir.hosseinabbasi.payconiq.data.db.IDbService;
import ir.hosseinabbasi.payconiq.data.db.model.Response;
import ir.hosseinabbasi.payconiq.data.network.IApiService;
import ir.hosseinabbasi.payconiq.di.ApplicationContext;

/**
 * Created by Dr.jacky on 2018/04/26.
 */
@Singleton
public class AppDataManager implements DataManager {
    private static final String TAG = "AppDataManager";

    private final Context mContext;
    private final IApiService mIApiService;
    private final IDbService mDbService;

    @Inject
    public AppDataManager(@ApplicationContext Context context,
                          IApiService IApiService,
                          IDbService dbService) {
        mContext = context;
        mIApiService = IApiService;
        mDbService = dbService;
    }

    @Override
    public Observable<List<Response>> getResponse(Map<String, String> params) {
        return mIApiService.getResponse(params);
    }

    @Override
    public List<Response> loadResponses() {
        return mDbService.loadResponses();
    }

    @Override
    public void saveResponses(List<Response> responseList) {
        mDbService.saveResponses(responseList);
    }
}
