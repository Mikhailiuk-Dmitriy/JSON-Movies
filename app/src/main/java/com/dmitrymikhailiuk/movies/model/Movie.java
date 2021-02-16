package com.dmitrymikhailiuk.movies.model;

public class Movie {

    private final String posterURL;
    private final String title;
    private final String year;

    public Movie(String posterURL, String title, String year) {
        this.posterURL = posterURL;
        this.title = title;
        this.year = year;
    }

    public String getPosterURL() {
        return posterURL;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }
}
