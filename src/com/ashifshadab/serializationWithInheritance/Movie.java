package com.ashifshadab.serializationWithInheritance;

public class Movie {
    private int movieId;
    private String movieName;

    public Movie() {
    }
    public Movie(int movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                '}';
    }
}
