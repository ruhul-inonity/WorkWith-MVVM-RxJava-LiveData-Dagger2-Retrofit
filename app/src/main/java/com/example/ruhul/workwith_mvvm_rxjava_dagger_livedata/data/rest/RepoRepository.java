package com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.data.rest;

import com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.data.model.Repo;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

/**
 * Created by ruhul on 18,December,2018
 */
public class RepoRepository {
    private final RepoService repoService;

    @Inject
    public RepoRepository(RepoService repoService) {
        this.repoService = repoService;
    }

    public Single<List<Repo>> getRepositories() {
        return repoService.getRepositories();
    }

    public Single<Repo> getRepo(String owner, String name) {
        return repoService.getRepo(owner, name);
    }
}
