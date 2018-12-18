package com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.data.rest;

import com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.data.model.Repo;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by ruhul on 18,December,2018
 */
public interface RepoService {
    @GET("orgs/Google/repos")
    Single<List<Repo>> getRepositories();

    @GET("repos/{owner}/{name}")
    Single<Repo> getRepo(@Path("owner") String owner, @Path("name") String name);
}
