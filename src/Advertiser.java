import java.util.ArrayList;

public class Advertiser extends BaseAdvertising {

    private String name;

    private static ArrayList<Advertiser> advertisers = new ArrayList<>();

    public Advertiser(int id, String name) {
        super(id);
        this.name = name;
        advertisers.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String help(){
        String helpInfo = "id is unique number of advertiser ***\nname is advertiser's name ***\nclciks is number of its clicks ***\nviews is number of its views ***";
        return helpInfo;
    }

    @Override
    public String describeMe() {
        String classTask = "this class is implemented for advertisers and companies who want to advertise //// advertiser class";
        return classTask;
    }

    public static int getTotalClicks(){
        int totalClicks = 0;
        for (Advertiser advertiser : advertisers) {
            totalClicks+=advertiser.getClicks();
        }
        return totalClicks;
    }



}
