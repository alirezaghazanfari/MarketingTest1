public class Ad extends BaseAdvertising {

    private String title;
    private String imgUrl;
    private String link;
    private Advertiser advertiser;

    public Ad(int id, String title, String imgUrl, String link, Advertiser advertiser) {
        super(id);
        this.title = title;
        this.imgUrl = imgUrl;
        this.link = link;
        this.advertiser = advertiser;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Advertiser getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(Advertiser advertiser) {
        this.advertiser = advertiser;
    }

    @Override
    public void incClicks() {
        super.incClicks();
        advertiser.incClicks();
    }

    @Override
    public void incViews() {
        super.incViews();
        advertiser.incViews();
    }

    @Override
    public String describeMe() {
        String description = "this is class of Ads:))";
        return description;
    }

}
