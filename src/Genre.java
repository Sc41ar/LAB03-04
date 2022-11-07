public class Genre {
    private String genreName;

    Genre() {
        genreName = "Детектив";
    }

    Genre(String name) {
        genreName = name;
    }

    public void SetName(String name) {
        this.genreName = name;
    }

    public String GetName() {
        return genreName;
    }
}
