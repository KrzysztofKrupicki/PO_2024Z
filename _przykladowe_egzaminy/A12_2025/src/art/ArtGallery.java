package art;

public class ArtGallery {
    private String name;
    private static ArtGallery instance;

    private ArtGallery(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static ArtGallery getInstance(String name) {
        if (instance == null) {
            instance = new ArtGallery(name);
        }
        return instance;
    }
}
