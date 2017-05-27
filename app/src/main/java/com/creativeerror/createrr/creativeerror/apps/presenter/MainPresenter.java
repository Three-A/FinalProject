package com.creativeerror.createrr.creativeerror.apps.presenter;

import android.text.TextUtils;

import com.creativeerror.createrr.creativeerror.apps.MainActivity;
import com.creativeerror.createrr.creativeerror.apps.interactor.LoginInterface;
import com.creativeerror.createrr.creativeerror.apps.interactor.MainInterface;

/**
 * Created by yudha on 5/27/2017.
 */

public class MainPresenter implements LoginInterface {
    private MainInterface mainInterface;
    public MainPresenter(MainActivity mainActivity) {
        this.mainInterface = mainActivity;
    }

    @Override

    public void login(String username, String password) {
        if(TextUtils.isEmpty(username) || TextUtils.isEmpty(password)){
            mainInterface.emptydata();
        } else {
            if(username.equals("yudha")&& password.equals("patria")) {
                mainInterface.success(username);
            } else {
                mainInterface.invaliddata();
            }
        }
    }
}
