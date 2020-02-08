# basic-scrapper
This is an example in java how to do scrapping.
Here i have used imdb site and find out the name and rating.
to find the exact value fo row you need to do inspect(right click >inspect) and get the id for respective field.
in this exampel name and rating is used :
 
 ```java
  final String title = row.select(".titleColumn a").text(); 
     final String rating = row.select(".imdbRating").text(); 
  ```
        
eg:
For Rating: 
<td class="ratingColumn imdbRating">
            <strong title="9.2 based on 2,187,658 user ratings">9.2</strong>
    </td>
    
 For Title Columd:
 <a href="/title/tt0111161/?pf_rd_m=A2FGELUUNOQJNL&amp;pf_rd_p=e31d89dd-322d-4646-8962-327b42fe94b1&amp;pf_rd_r=D458C171A1KKK9YNEN9S&amp;pf_rd_s=center-1&amp;pf_rd_t=15506&amp;pf_rd_i=top&amp;ref_=chttp_tt_1" title="Frank Darabont (dir.), Tim Robbins, Morgan Freeman">The Shawshank Redemption</a>
    
