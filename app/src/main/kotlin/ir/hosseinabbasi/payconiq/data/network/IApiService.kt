package ir.hosseinabbasi.payconiq.data.network

import io.reactivex.Observable
import ir.hosseinabbasi.payconiq.data.db.model.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

/**
 * Created by Dr.jacky on 2018/04/26.
 */
interface IApiService {
    @GET("repos")
    fun getResponse(@QueryMap params: Map<String, String>): Observable<List<Response>>
}
