public class Person{
    private Name name;
    private Place place;
    private int age;

    @Override
    public String toString() {
        return  name.toString() + "\n"+ place.toString();
    }

    public Person(Name name, Place place, int age) {
        this.name = name;
        this.place = place;
        this.age = age;
    }

    public String getFirstLastName(){
        return name.getFirstLastName();
    }

    public String getLastFirstName(){
        return getLastFirstName();
    }

    public boolean belongsFromCountry(String country){
        return country.toUpperCase().equals(this.place.getCountry().toUpperCase());
    }
}