package com.example.srija.githubapp.api;

//this class is a dataclass ("Java bean")
//no methods, just stores data
//all fields private & have getters
//POJO = "Plain Old Java Object"

import com.google.gson.annotations.SerializedName;

public class GitHubUser {
    @SerializedName("login") //to "serialize" = converting it into JSON. "deserialize" = other way around
    private String username; //called "login" in the Github API
    private String name;
    private String bio; //these two don't need to be serialized
    private int public_repos;
    private int followers;
    private int following;

    public GitHubUser(String username, String name, String bio, int public_repos, int followers, int following){
        this.username = username;
        this.name = name;
        this.bio = bio;
        this.public_repos = public_repos;
        this.followers = followers;
        this.following = following;
    }

    public String getUsername(){
        return username;
    }

    public String getName(){
        return name;
    }

    public String getBio(){
        return bio;
    }

    public int getRepos(){
        return public_repos;
    }

    public int getFollowers(){
        return followers;
    }

    public int getFollowing(){
        return following;
    }

}
