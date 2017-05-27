package com.creativeerror.createrr.creativeerror.apps.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by yudha on 5/27/2017.
 */

public class QuotesEntity {
    @SerializedName("nama_pulau")
    @Expose
    private String namapulau;
    @SerializedName("nama_gunung")
    @Expose
    private String namaGunung;
    @SerializedName("tinggi_gunung")
    @Expose
    private String tinggiGunung;
    @SerializedName("foto_gunung")
    @Expose
    private String fotoGunung;

    public QuotesEntity(String namapulau, String namaGunung, String tinggiGunung, String fotoGunung) {
        this.namapulau = namapulau;
        this.namaGunung = namaGunung;
        this.tinggiGunung = tinggiGunung;
        this.fotoGunung = fotoGunung;
    }

    public String getNamapulau() {
        return namapulau;
    }

    public void setNamapulau(String namapulau) {
        this.namapulau = namapulau;
    }

    public String getNamaGunung() {
        return namaGunung;
    }

    public void setNamaGunung(String namaGunung) {
        this.namaGunung = namaGunung;
    }

    public String getTinggiGunung() {
        return tinggiGunung;
    }

    public void setTinggiGunung(String tinggiGunung) {
        this.tinggiGunung = tinggiGunung;
    }

    public String getFotoGunung() {
        return fotoGunung;
    }

    public void setFotoGunung(String fotoGunung) {
        this.fotoGunung = fotoGunung;
    }

}
