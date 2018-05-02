package ir.hosseinabbasi.payconiq.ui.main;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import ir.hosseinabbasi.payconiq.R;
import ir.hosseinabbasi.payconiq.data.db.model.Response;
import ir.hosseinabbasi.payconiq.di.ActivityContext;
import ir.hosseinabbasi.payconiq.ui.base.BaseActivity;

/**
 * Created by Dr.jacky on 2018/05/02.
 */
public class MainActivity extends BaseActivity implements IMainActivityView {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    @ActivityContext
    Context mContext;

    @Inject
    IMainActivityPresenter<IMainActivityView> mPresenter;

    @BindView(R.id.activity_main_RcyResponse)
    RecyclerView mRcyResponse;

    private ResponseAdapter adapter;
    private LinearLayoutManager mLayoutManager;
    private boolean mIsRecyclerViewLoading = false;
    private boolean mBottomReached = false;
    private int mCurrentPage = 1;
    private int mPageSize = 15;
    private int mTotal = 100;
    private List<Response> mResponseList = new ArrayList<>();
    private boolean isOfflineMode = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(this);
        initViews();
    }

    @Override
    public void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    private void initViews() {
        mLayoutManager = new LinearLayoutManager(mContext);
        mRcyResponse.setLayoutManager(mLayoutManager);
        mRcyResponse.setHasFixedSize(true);
        mRcyResponse.addOnScrollListener(recyclerViewOnScrollListener);
        adapter = new ResponseAdapter(mContext, this);
        mRcyResponse.setAdapter(adapter);

        if (isNetworkConnected()) {
            isOfflineMode = false;
            getResponseList();
        }
        else {
            isOfflineMode =  true;
            getLocalResponse();
        }
    }

    public void getResponseList() {
        Map<String, String> params = new HashMap<>();
        params.put("page", mCurrentPage + "");
        params.put("per_page", mPageSize + "");
        mPresenter.getResponse(params);
        mCurrentPage++;
    }

    private void getLocalResponse() {
        mPresenter.getLocalResponse();
    }

    @Override
    public void loadResponseList(List<Response> responseList) {
        mResponseList = responseList;
        adapter.addAll(mResponseList);
        adapter.notifyDataSetChanged();
    }

    private RecyclerView.OnScrollListener recyclerViewOnScrollListener = new RecyclerView.OnScrollListener() {
        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            View view = (View) recyclerView.getChildAt(recyclerView.getChildCount() - 1);
            int diff = (view.getBottom() - (recyclerView.getHeight() + recyclerView.getScrollY()));
            mBottomReached = diff <= 0;

            if (dy > 0) {
                int mVisibleItemCount = mLayoutManager.getChildCount();
                int mTotalItemCount = mLayoutManager.getItemCount();
                int mFirstVisibleItemPosition = mLayoutManager.findFirstVisibleItemPosition();

                if (!isRecyclerViewLoading()) {
                    if (((mVisibleItemCount + mFirstVisibleItemPosition) >= mTotalItemCount) && mBottomReached && (mTotalItemCount < mTotal)) {
                        if (isNetworkConnected() && !isOfflineMode)
                            getResponseList();
                        else if(isNetworkConnected() && isOfflineMode) onError(R.string.internet_connection_after_offline_data);
                        else onError(R.string.no_internet_connection);
                    }
                }
            }

            super.onScrolled(recyclerView, dx, dy);
        }
    };

    @Override
    public void setIsLoading(Boolean isLoading) {
        this.mIsRecyclerViewLoading = isLoading;
    }

    public boolean isRecyclerViewLoading() {
        return mIsRecyclerViewLoading;
    }
}
