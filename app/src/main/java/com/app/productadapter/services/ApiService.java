package com.app.productadapter.services;

import com.app.productadapter.DTO.ApiResponseDTO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("newmobile/glavnaya/super_top.php")
    Call<ApiResponseDTO> getSections(@Query("action") String action);
}