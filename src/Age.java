public class Age {
    private int age;
    public Age(int age) {
        this.age = age;
    }
    public boolean isGreaterThan(Age anotherAge) {
        return age > anotherAge.age;
    }

    @Override
    public String toString() {
        return age+"";
    }
}
