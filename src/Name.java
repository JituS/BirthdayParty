public class Name{
    private String firstName;
    private String lastName;
    private String prefix;

    @Override
    public String toString() {
        return prefix + " " + firstName +" "+ lastName;
    }

    private String getPrefix(String gender){
        return gender.toUpperCase().equals("FEMALE") ? Gender.FEMALE.getPrefix() : Gender.MALE.getPrefix();
    }

    public Name(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.prefix = getPrefix(gender);
    }
}
