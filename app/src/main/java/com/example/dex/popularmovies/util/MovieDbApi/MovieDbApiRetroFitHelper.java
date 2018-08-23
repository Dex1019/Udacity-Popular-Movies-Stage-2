package com.example.dex.popularmovies.util.MovieDbApi;


import com.example.dex.popularmovies.BuildConfig;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface MovieDbApiRetroFitHelper {
    String baseUrl = "https://api.themoviedb.org/";

    @GET("/3/movie/popular?api_key=" + BuildConfig.TMDBApiKey)
    Call<com.example.dex.popularmovies.model.data.MovieList> getPopularMovies(@Query("page") long page);

    @GET("/3/movie/top_rated?api_key=" + BuildConfig.TMDBApiKey)
    Call<com.example.dex.popularmovies.model.data.MovieList> getHighestRatedMovies(@Query("page") long page);

    @GET("/3/movie/{movieId}?api_key=" + BuildConfig.TMDBApiKey + "&append_to_response=videos,images,reviews,recommendations,similar_movies")
    Call<com.example.dex.popularmovies.model.data.MovieDetails> getMovieDetails(@Path("movieId") long movieId);

}
