# basic-scrapper
This is an example in java how to do scrapping.
Here i have used imdb site and find out the name and rating.
to find the exact value fo row you need to do inspect(right click >inspect) and get the id for respective field.
in this exampel name and rating is used :
 
 ```final String title = row.select(".titleColumn a").text();
            final String rating = row.select(".imdbRating").text();
            ```
