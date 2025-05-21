public class Track {
    private String title; 
    private String artist; 
    private String filename; 

    public Track(String title, String artist, String filename) {
        this.artist = artist;
        this.title = title; 
        this.filename = filename; 
    }

    public String getArtist() {
        return artist; 
    }

    public String getTitle() {
        return title; 
    }

    public String getFilename() {
        return filename; 
    }

    public String getDetails() {
        return artist + ": " + title + " (file: " + filename + ")"; 
    }
}