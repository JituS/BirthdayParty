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

    public boolean belongsFromCity(String city){
        return city.equals(this.place.getCity());
    }
}