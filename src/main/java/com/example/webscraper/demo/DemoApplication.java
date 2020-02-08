package com.example.webscraper.demo;

import java.io.IOException;

public class DemoApplication {

    public static void main(String[] args) throws IOException {
        ImdbScrapper scrapper = new ImdbScrapper("http://www.imdb.com/chart/top");
        scrapper.scrapeRatingAndTitle();
    }

}
