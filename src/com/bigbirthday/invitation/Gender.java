package com.bigbirthday.invitation;

public enum Gender {
    MALE("Mr"),
    FEMALE("Ms");

    Gender(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }

    private final String prefix;

}
