package com.creativeerror.createrr.creativeerror.apps;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.creativeerror.createrr.creativeerror.R;
import com.creativeerror.createrr.creativeerror.databinding.ActivityMenuBinding;

public class MenuActivity extends AppCompatActivity {
    private ActivityMenuBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding  = DataBindingUtil.setContentView(this,R.layout.activity_menu);
        mBinding.calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,CalculatorActivity.class);
                startActivity(intent);
            }
        });
        mBinding.hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,GunungActivity.class);
                startActivity(intent);
            }
        });
    }
}
