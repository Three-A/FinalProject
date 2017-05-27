package com.creativeerror.createrr.creativeerror.apps.service;

import com.creativeerror.createrr.creativeerror.apps.model.Gunung;

import java.util.List;

import retrofit2.http.GET;

/**
 * Created by yudha on 5/27/2017.
 */

public interface CoreApiService {
    String END_POINT = "questions";

    @GET(END_POINT)
    rx.Observable<List<Gunung>> getGunung();
}
