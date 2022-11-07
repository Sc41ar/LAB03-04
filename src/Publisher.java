public class Publisher {
    private String name;

    Publisher() {
        name = "PublisherName.Zarya";
    }

    Publisher(String name) {
        this.name = name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }
}
