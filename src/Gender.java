public enum Gender {
    MALE("Mr"),
    FEMALE("Ms");

    public String getPrefix() {
        return prefix;
    }

    private final String prefix;
    Gender(String prefix) {
        this.prefix = prefix;
    }
}
