package ir.hosseinabbasi.payconiq.ui.main;

import java.util.List;

import ir.hosseinabbasi.payconiq.data.db.model.Response;
import ir.hosseinabbasi.payconiq.ui.base.IBaseView;

/**
 * Created by Dr.jacky on 2018/04/27.
 */
public interface IMainActivityView extends IBaseView {

    void loadResponseList(List<Response> responseList);

    void setIsLoading(Boolean isLoading);
}
