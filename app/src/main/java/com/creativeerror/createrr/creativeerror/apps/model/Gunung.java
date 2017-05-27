package com.creativeerror.createrr.creativeerror.apps.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by yudha on 5/27/2017.
 */

public class Gunung {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("pulau")
    @Expose
    private String pulau;
    @SerializedName("gunung")
    @Expose
    private List<QuotesEntity> gunung = null;
    @SerializedName("lati")
    @Expose
    private Float lati;
    @SerializedName("longi")
    @Expose
    private Float longi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPulau() {
        return pulau;
    }

    public void setPulau(String pulau) {
        this.pulau = pulau;
    }

    public List<QuotesEntity> getGunung() {
        return gunung;
    }

    public void setGunung(List<QuotesEntity> gunung) {
        this.gunung = gunung;
    }

    public Float getLati() {
        return lati;
    }

    public void setLati(Float lati) {
        this.lati = lati;
    }

    public Float getLongi() {
        return longi;
    }

    public void setLongi(Float longi) {
        this.longi = longi;
    }

}
