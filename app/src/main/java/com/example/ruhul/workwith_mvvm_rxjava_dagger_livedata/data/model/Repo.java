package com.example.ruhul.workwith_mvvm_rxjava_dagger_livedata.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ruhul on 18,December,2018
 */
public class Repo {
    public final long id;
    public final String name;
    public final String description;
    public final User owner;
    @SerializedName("stargazers_count")
    public final long stars;
    @SerializedName("forks_count")
    public final long forks;

    public Repo(long id, String name, String description, User owner, long stars, long forks) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.owner = owner;
        this.stars = stars;
        this.forks = forks;
    }
}
