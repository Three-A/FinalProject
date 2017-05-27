package com.creativeerror.createrr.creativeerror.apps.interactor;

import com.creativeerror.createrr.creativeerror.apps.model.Gunung;

import java.util.List;

import rx.Observable;

/**
 * Created by yudha on 5/27/2017.
 */

public interface GunungInteractor {
    Observable<List<Gunung>> getGunungHistoryTransaction();
}
