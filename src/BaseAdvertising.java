public class BaseAdvertising {
    private int id;
    private int clicks;
    private int views;

    public BaseAdvertising() {
    }

    public BaseAdvertising(int id) {
        this.id = id;
    }

    public String describeMe(){
        String description = "this class is father of Ad and Advertiser classes. I am BaseAdvertising Class";
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
