package com.example.dex.popularmovies.eventlistener;


public interface OnFragmentInteractionListener {
    String TAG_MOVIE = "MOVIE";
    String TAG_FAVORITE = "FAVORITE";
    String TAG_UNFAVORITE = "UNFAVORITE";

    void onFragmentInteraction(String message);
}
