package com.creativeerror.createrr.creativeerror.apps;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.creativeerror.createrr.creativeerror.R;
import com.creativeerror.createrr.creativeerror.apps.interactor.MainInterface;
import com.creativeerror.createrr.creativeerror.apps.presenter.MainPresenter;
import com.creativeerror.createrr.creativeerror.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements MainInterface {
    private ActivityMainBinding mBinding;
    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainPresenter = new MainPresenter(this);
        mBinding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.login(mBinding.username.getText().toString(),mBinding.password.getText().toString());
            }
        });
    }

    @Override
    public void invaliddata() {
        Toast.makeText(this,R.string.text_login,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void emptydata() {
        Toast.makeText(this,R.string.text_login,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void success(String username) {
        Toast.makeText(this,R.string.text_login, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,MenuActivity.class);
        intent.putExtra("username",username);
        startActivity(intent);

    }
}
