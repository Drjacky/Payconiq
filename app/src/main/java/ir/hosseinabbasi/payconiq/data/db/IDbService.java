package ir.hosseinabbasi.payconiq.data.db;

import java.util.List;

import ir.hosseinabbasi.payconiq.data.db.model.Response;

/**
 * Created by Dr.jacky on 2018/04/26.
 */
public interface IDbService {
    List<Response> loadResponses();
    void saveResponses(List<Response> responseList);
}
