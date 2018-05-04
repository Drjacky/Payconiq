package ir.hosseinabbasi.payconiq;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import ir.hosseinabbasi.payconiq.data.network.IApiService;

import static org.mockito.Mockito.*;

/**
 * Created by Dr.jacky on 2018/05/03.
 */
public class ApiServiceUnitTest2 {

    Map<String, String> params;

    @Before
    public void setUp(){
        params = new HashMap<>();
        params.put("page", "1");
        params.put("per_page", "15");

        TestComponent component = DaggerTestComponent.builder().myModule(new TestModule()).build();
        component.inject(this);
    }

    @Inject
    IApiService iApiService;

    @Test
    public void testDoSomething() {
        //when(iApiService.getResponse(params));
        iApiService.getResponse(params);
        //verify(iApiService).getResponse(params).;
    }
}
