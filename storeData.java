package music_system;

public class storeData {
    String songName;
    String artist;
    String category;
    String type;
    int numberOfItems;
    double price;

    public storeData(String songName, String artist, String category, String type, int numberOfItems,double price) {
        this.songName = songName;
        this.artist = artist;
        this.category = category;
        this.type = type;
        this.numberOfItems = numberOfItems;
        this.price = price;
    }
}
