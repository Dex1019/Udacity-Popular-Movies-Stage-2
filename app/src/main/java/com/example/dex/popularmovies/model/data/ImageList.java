package com.example.dex.popularmovies.model.data;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public final class ImageList {
    @Expose
    @SerializedName("backdrops")
    private ArrayList<Image> backdrops;
    @Expose
    @SerializedName("posters")
    private ArrayList<Image> posters;

    /**
     * Public no-args constructor for serialization
     */
    public ImageList() {

    }

    /**
     * @param backdrops
     * @param posters
     */
    public ImageList(final ArrayList<Image> backdrops, final ArrayList<Image> posters) {
        this.backdrops = backdrops;
        this.posters = posters;
    }

    public ArrayList<Image> getBackdrops() {
        return backdrops;
    }

    public ArrayList<Image> getPosters() {
        return posters;
    }

    @Override
    public String toString() {
        return (new Gson()).toJson(this);
    }
}
