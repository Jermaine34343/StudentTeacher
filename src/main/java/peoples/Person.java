package peoples;

public class Person {
    private final long iD;
    private String name;

    public Person(long iD, String name) {
        this.iD = iD;
        this.name = name;
    }

    public long getiD() {
        return iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
