package com.example.deepakrattan.retrofit2demo.network;

import com.example.deepakrattan.retrofit2demo.model.EmployeeList;
import com.example.deepakrattan.retrofit2demo.model.LoginData;
import com.example.deepakrattan.retrofit2demo.model.LoginResponse;
import com.example.deepakrattan.retrofit2demo.model.ProjectListResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by deepak.rattan on 5/2/2018.
 */

public interface APIInterface {

    @POST("AccountAPI/GetLoginUser")
    Call<LoginResponse> getLogin(@Body LoginData loginData);

    //Inside the @Get annotation we need to pass the end point
    // to get the JSON Data
    @GET("ProjectAPI/GetProjectListing")
    Call<ProjectListResponse> getProjects();


}
