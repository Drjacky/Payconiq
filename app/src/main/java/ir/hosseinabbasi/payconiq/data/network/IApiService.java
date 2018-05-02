package ir.hosseinabbasi.payconiq.data.network;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import ir.hosseinabbasi.payconiq.data.db.model.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * Created by Dr.jacky on 2018/04/26.
 */
public interface IApiService {
    @GET("repos")
    Observable<List<Response>> getResponse(@QueryMap Map<String, String> params);
}
