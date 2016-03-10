package com.bigbirthday.invitation;

public class Name{
    private String firstName;
    private String lastName;
    private String gender;

    @Override
    public String toString() {
        return  getFormalName();
    }

    public Name(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getInformalName() {
        String prefix = gender.equalsIgnoreCase("female") ? Gender.FEMALE.getPrefix() : Gender.MALE.getPrefix();
        return prefix + " " + firstName +" "+ lastName ;
    }

    public String getFormalName() {
        String prefix = gender.equalsIgnoreCase("female") ? Gender.FEMALE.getPrefix() : Gender.MALE.getPrefix();
        return prefix + " " + lastName +", "+ firstName;
    }
}
