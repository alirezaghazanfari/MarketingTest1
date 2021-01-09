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

    /**
     * this method set link of this ad
     * @param link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * this method return an ad's advertiser
     * @return
     */
    public Advertiser getAdvertiser() {
        return advertiser;
    }

    /**
     * this method set advertiser of an ad
     * @param advertiser
     */
    public void setAdvertiser(Advertiser advertiser) {
        this.advertiser = advertiser;
    }

    /**
     * this method increment ad's clicks and its advertiser's clicks
     */
    @Override
    public void incClicks() {
        super.incClicks();
        advertiser.incClicks();
    }

    /**
     * this method increment number of ad's views and its advertiser's views
     */
    @Override
    public void incViews() {
        super.incViews();
        advertiser.incViews();
    }

    /**
     * this method is for identifying target of this class
     * @return
     */
    @Override
    public String describeMe() {
        String description = "this is class of Ads:))";
        return description;
    }

}
