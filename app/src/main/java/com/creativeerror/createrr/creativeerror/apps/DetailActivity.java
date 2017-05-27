package com.creativeerror.createrr.creativeerror.apps;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.creativeerror.createrr.creativeerror.R;
import com.creativeerror.createrr.creativeerror.databinding.ActivityDetailBinding;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    private ActivityDetailBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
       mBinding= DataBindingUtil.setContentView(this,R.layout.activity_detail);
        setSupportActionBar(mBinding.toolbar);
        ImageView im = mBinding.imageView2;
        Intent intent = getIntent();
        String Nama = intent.getStringExtra("Nama");
        String Pulau = intent.getStringExtra("Pulau");
        String Tinggi = intent.getStringExtra("Tinggi");
        String Foto = intent.getStringExtra("Foto");
        setTitle("Gunung "+intent.getStringExtra("Nama"));
        Picasso.with(getApplicationContext()).load(Foto).fit().into(im);
        mBinding.include.info.setText("Gunung: "+ Nama +"\nPulau: "+Pulau +"\nTinggi: " +Tinggi);
        mBinding.button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
