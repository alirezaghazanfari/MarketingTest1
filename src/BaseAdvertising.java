public class BaseAdvertising {
    private int id;
    private int clicks;
    private int views;
    public String describeMe(){
        String description = "this class is father of Ad and Advertiser classes.";
        return description;
    }

    public int getClicks() {
        return clicks;
    }

    public int getViews() {
        return views;
    }

    public void incClicks(){
        clicks++;
    }
    public void incViews(){
        views++;
    }
}
