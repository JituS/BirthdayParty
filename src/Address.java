public class Address {

    private City city;
    private State state;
    private Country country;

    public String toString() {
        return country + "";
    }

    public Address(City city, State state, Country country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public boolean isSameCountry(Country anotherCountry) {
        return country.equals(anotherCountry);
    }
}
