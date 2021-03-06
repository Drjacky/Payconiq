package ir.hosseinabbasi.payconiq.data;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import ir.hosseinabbasi.payconiq.data.db.IDbService;
import ir.hosseinabbasi.payconiq.data.db.model.Response;
import ir.hosseinabbasi.payconiq.data.network.IApiService;

/**
 * Created by Dr.jacky on 2018/04/26.
 */
public interface DataManager extends IDbService, IApiService {
    @Override
    Observable<List<Response>> getResponse(Map<String, String> params);

    @Override
    List<Response> loadResponses();

    @Override
    void saveResponses(List<Response> responseList);
}
