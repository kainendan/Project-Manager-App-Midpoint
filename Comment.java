public class Comment {
    private String commentAuthor;
    private String commentText;
    private String commentDate;

    public Comment(String commentAuthor, String commentText, String commentDate) {
        this.commentAuthor = commentAuthor;
        this.commentText = commentText;
        this.commentDate = commentDate;
    }

    public String getAuthor() {
        return commentAuthor;
    }

    public String getText() {
        return commentText;
    }

    public String GetDate() {
        return commentDate;
    }
    
}