package Data;

public record Review(Rating rating, String comments) {
    public String toString(){
        return rating.getStars() + "\n" + comments;
    }
}
