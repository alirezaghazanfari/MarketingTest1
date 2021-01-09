public class Advertiser extends BaseAdvertising {
    private int id;
    private String name;
    private int clicks;
    private int views;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public String help(){
        String helpInfo = "id is unique number of advertiser ***\nname is advertiser's name ***\nclciks is number of its clicks ***\nviews is number of its views ***\n";
        return helpInfo;
    }
    public String describeMe(){
        String classTask = "this class is implemented for advertisers and companies who want to advertise";
        return classTask;
    }
    public static int getTotalClicks(){

    }



}
