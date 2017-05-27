package com.creativeerror.createrr.creativeerror.apps.service;

import android.content.Context;

import com.creativeerror.createrr.creativeerror.apps.interactor.GunungInteractor;
import com.creativeerror.createrr.creativeerror.apps.model.Gunung;

import java.util.List;

import rx.Observable;

/**
 * Created by yudha on 5/27/2017.
 */

public class CoreInteractorImpl implements GunungInteractor {
    private CoreApiService mCoreApi;
    private Context mContext;

    public CoreInteractorImpl(Context context){
        mCoreApi = CoreApiServiceBuilder.provideCoreApiService();
        mContext = context;
    }

    @Override
    public Observable<List<Gunung>> getGunungHistoryTransaction() {
        return mCoreApi.getGunung();
    }
}
