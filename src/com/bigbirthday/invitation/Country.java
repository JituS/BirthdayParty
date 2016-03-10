package com.bigbirthday.invitation;

public class Country {
    private final String country;
    public Country(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return this.country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country1 = (Country) o;
        return country != null ? country.equals(country1.country) : country1.country == null;
    }

}
