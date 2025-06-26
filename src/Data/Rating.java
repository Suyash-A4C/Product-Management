package Data;

public enum Rating {
    // \u2606 is a blank star and \u2605 is a filled in star

    NOT_RATED ("\u2606\u2606\u2606\u2606\u2606"),

    ONE_STAR ("\u2605\u2606\u2606\u2606\u2606"),

    TWO_STAR ("\u2605\u2605\u2606\u2606\u2606"),

    THREE_STAR ("\u2605\u2605\u2605\u2606\u2606"),

    FOUR_STAR ("\u2605\u2605\u2605\u2605\u2606"),

    FIVE_STAR ("\u2605\u2605\u2605\u2605\u2605");

    private  String Stars;
    Rating(String Stars){
        this.Stars=Stars;
    }
    public String getStars(){
        return Stars;
    }

}
