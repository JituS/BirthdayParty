public class Person {
    private Name name;
    private Address address;
    private Age age;

    public Person(Name name, Address address, Age age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public boolean belongsFromCountry(Country country){
        return address.isSameCountry(country);
    }

    public boolean ageGreaterThan(Age anotherAge) {
        return age.isGreaterThan(anotherAge);
    }

    public String formal() {
        return name.getFormalName();
    }

    public String inFormal() {
        return name.getInformalName();
    }

    public String country() {
        return address + "";
    }

    public String age() {
        return age.toString();
    }
}