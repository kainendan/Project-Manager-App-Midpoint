public class Comment {
    private User commentAuthor;
    private String commentText;
    private String commentDate;

    public Comment(User commentAuthor, String commentText, String commentDate) {
        this.commentAuthor = commentAuthor;
        this.commentText = commentText;
        this.commentDate = commentDate;
    }

    
}