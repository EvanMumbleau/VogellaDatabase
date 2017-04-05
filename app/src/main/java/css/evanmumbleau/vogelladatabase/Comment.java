package css.evanmumbleau.vogelladatabase;

/**
 * Created by emumbleau on 4/3/2017.
 */

public class Comment{
    private long id;
    private String comment;
    private String rating;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    //retrieves and returns comment id
    public long getId() {
        return id;
    }

    //sets the id
    public void setId(long id) {
        this.id = id;
    }

    //retrieves and returns comment
    public String getComment() {
        return comment;
    }

    //sets the comment to a string
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     *used by the ArrayAdapter in the ListView
     *returns comment
     */
    @Override
    public String toString() {
        return (comment + "The rating is " + rating);  //displays the rating along with the comment text
    }
}
