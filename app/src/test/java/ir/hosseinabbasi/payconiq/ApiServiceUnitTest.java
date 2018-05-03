package ir.hosseinabbasi.payconiq;

import android.content.Context;
import android.util.Log;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import ir.hosseinabbasi.payconiq.data.AppDataManager;
import ir.hosseinabbasi.payconiq.data.db.IDbService;
import ir.hosseinabbasi.payconiq.data.db.model.Response;
import ir.hosseinabbasi.payconiq.data.network.IApiService;

import static org.mockito.Mockito.*;

/**
 * Created by Dr.jacky on 2018/05/03.
 */
public class ApiServiceUnitTest {

    Map<String, String> params;

    @Rule public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Before
    public void setUp(){
        params = new HashMap<>();
        params.put("page", "1");
        params.put("per_page", "15");
    }

    @Mock
    Context context;

    @Mock
    IApiService iApiService;

    @Mock
    IDbService iDbService;

    @InjectMocks
    AppDataManager appDataManager;

    @Test
    public void getResponseTest() {
        List<Response> results;
        results = appDataManager.getResponse(params).blockingFirst();
        Assert.assertEquals(15, results.size());
    }
}
