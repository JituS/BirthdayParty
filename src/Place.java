public class Place {

    private String city;
    private String state;
    private String country;

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return city + ", " + state + ", " + country;
    }

    public Place(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
