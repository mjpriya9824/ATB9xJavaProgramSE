package Nov.ex14112024_ENUM;

public enum APIConstantsEndPoints {

    BASE_URL("https:app.vwp.com"),
    LOGIN_URL("https:app.vwp.com/login");

    private  String name;
    APIConstantsEndPoints(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


}
