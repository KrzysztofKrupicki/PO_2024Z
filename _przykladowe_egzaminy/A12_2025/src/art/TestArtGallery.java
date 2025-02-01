package art;

public class TestArtGallery {
    public static void main(String[] args) {
        ArtGallery artGallery1 = ArtGallery.getInstance("Gallery 1");
        ArtGallery artGallery2 = ArtGallery.getInstance("Gallery");
        System.out.println(artGallery1.getName());
        System.out.println(artGallery2.getName());
    }
}
