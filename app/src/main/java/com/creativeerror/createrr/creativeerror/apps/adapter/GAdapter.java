package com.creativeerror.createrr.creativeerror.apps.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.creativeerror.createrr.creativeerror.R;
import com.creativeerror.createrr.creativeerror.apps.model.QuotesEntity;
import com.creativeerror.createrr.creativeerror.apps.DetailActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by yudha on 5/27/2017.
 */

public class GAdapter extends RecyclerView.Adapter<GAdapter.ViewHolder> {

    private List<QuotesEntity> mGunung;
    private Context mContext;

    public GAdapter(Context context, List<QuotesEntity> mGunung) {
        this.mGunung = mGunung;
        this.mContext = context;
    }

    @Override
    public GAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_gunung_view, parent, false);
        return new GAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GAdapter.ViewHolder holder, int position) {

        final QuotesEntity Gunung = mGunung.get(position);
        holder.Judul.setText("Gunung " + Gunung.getNamaGunung());
        holder.Lokasi.setText("Berada di pulau " + Gunung.getNamapulau());
        Picasso.with(mContext).load(Gunung.getFotoGunung()).fit().into(holder.imageView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext.getApplicationContext(), DetailActivity.class);
                intent.putExtra("Nama", Gunung.getNamaGunung());
                intent.putExtra("Pulau", Gunung.getNamapulau());
                intent.putExtra("Foto", Gunung.getFotoGunung());
                intent.putExtra("Tinggi", Gunung.getTinggiGunung());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mGunung.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView Judul, Lokasi;
        //            CardView cardView;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            Judul = (TextView) itemView.findViewById(R.id.tv_nama);
            Lokasi = (TextView) itemView.findViewById(R.id.tv_pulau);
            imageView = (ImageView) itemView.findViewById(R.id.img_vi);

    }
}}

