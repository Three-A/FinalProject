package com.creativeerror.createrr.creativeerror.apps;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.creativeerror.createrr.creativeerror.R;
import com.creativeerror.createrr.creativeerror.apps.adapter.GAdapter;
import com.creativeerror.createrr.creativeerror.apps.interactor.GunungContract;
import com.creativeerror.createrr.creativeerror.apps.model.QuotesEntity;
import com.creativeerror.createrr.creativeerror.apps.presenter.GunungPresenter;
import com.creativeerror.createrr.creativeerror.apps.service.CoreInteractorImpl;
import com.creativeerror.createrr.creativeerror.databinding.ActivityGunungBinding;

import java.util.List;

public class GunungActivity extends AppCompatActivity implements GunungContract.View{
    private ActivityGunungBinding
            mBinding;

    private GAdapter mAdapterMain;

    private RecyclerView mRecyclerView;

    private List<QuotesEntity> mGunung;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding= DataBindingUtil.setContentView(this, R.layout.activity_gunung);
        initRecyclerView();
        GunungContract.Presenter mPresenter = initPresenter();
        mPresenter.bind(this);

        showProgress();
        mPresenter.getGunungHistory();
    }



    private void initRecyclerView() {
        mRecyclerView = mBinding.listItem;
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public GunungContract.Presenter initPresenter() {
        return new GunungPresenter(new CoreInteractorImpl(getApplicationContext()));
    }

    @Override
    public void updateGunung(List<QuotesEntity> gunungs) {
        mGunung = gunungs;
        mAdapterMain = new GAdapter(this,gunungs);
        mRecyclerView.setAdapter(mAdapterMain);
    }

    @Override
    public void showProgress() {
        Toast.makeText(this, "Tunggu Sebentar", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideProgress(String e) {
        Toast.makeText(this, "ERROR :"+e, Toast.LENGTH_LONG).show();

    }
}
