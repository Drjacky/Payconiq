package ir.hosseinabbasi.payconiq.ui.main;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import ir.hosseinabbasi.payconiq.R;
import ir.hosseinabbasi.payconiq.data.db.model.Response;
import ir.hosseinabbasi.payconiq.databinding.ResponseItemBinding;

/**
 * Created by Dr.jacky on 2018/05/02.
 */
public class ResponseAdapter extends RecyclerView.Adapter<ResponseAdapter.DataHolder> {

    private Context mContext;
    private IMainActivityView mListener;
    private List<Response> mResponseItems = new ArrayList<>();

    public ResponseAdapter(Context context, IMainActivityView listener) {
        mContext = context;
        mListener = listener;
    }

    @Override
    public DataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ResponseItemBinding bind = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.response_item, parent, false);

        return new DataHolder(bind);
    }

    @Override
    public void onBindViewHolder(DataHolder holder, int position) {
        Response responseModel = mResponseItems.get(holder.getAdapterPosition());
        holder.bind(responseModel);
    }

    @Override
    public int getItemCount() {
        return mResponseItems.size();
    }

    public void addAll(List<Response> albumList) {
        mResponseItems.addAll(albumList);
    }

    class DataHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.response_item_cnsMain)
        ConstraintLayout row;

        ResponseItemBinding activityMainBinding;

        DataHolder(ResponseItemBinding binding) {
            super(binding.getRoot());
            activityMainBinding = binding;
            ButterKnife.bind(this, binding.getRoot());
        }

        public void bind(@NonNull Response scItem) {
            activityMainBinding.setResponseItemModel(scItem);
            row.setOnClickListener(this);
            activityMainBinding.executePendingBindings();
        }

        @Override
        public void onClick(View view) {
            Response sc = mResponseItems.get(getAdapterPosition());
            mListener.showDetail(sc.getId()+"");
        }

    }
}
