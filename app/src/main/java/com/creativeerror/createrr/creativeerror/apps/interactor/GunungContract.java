package com.creativeerror.createrr.creativeerror.apps.interactor;

import com.creativeerror.createrr.creativeerror.apps.model.QuotesEntity;
import com.creativeerror.createrr.creativeerror.apps.util.GunungPresenter;
import com.creativeerror.createrr.creativeerror.apps.util.GunungView;

import java.util.List;

/**
 * Created by yudha on 5/27/2017.
 */

public interface GunungContract {
    interface View extends GunungView<Presenter> {

        void updateGunung(List<QuotesEntity> gunungs);

        void showProgress();

        void hideProgress(String e);
    }

    interface Presenter extends GunungPresenter<View> {

        void bind(View view);

        void unbind();

        void getGunungHistory();
        void getGunungsHistory(List<QuotesEntity> gunung);

    }
}
