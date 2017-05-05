package com.retrofit.fixtergeek.retrofit;

import retrofit2.Call;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubClient {

    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> reposForUser(@Path("user") String user);

}
