import java.util.ArrayList;

public class MusicOrganizer {
    private ArrayList<Track> tracks;

    public MusicOrganizer() {
        tracks = new ArrayList<>();
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public void removeTrack(int index) {
        if(index >= 0 && index < tracks.size()) {
            tracks.remove(index); 
        }
    }

    public int findTitle(String title) {
        for(int i = 0; i < tracks.size(); i++) {
            Track track = track.get(i);
            String titleString = track.getTitle(); 
            
            if(titleString.contains(title)) {
                return i;
            }
        }
        return -1; 
    }

    public void listTrack(int index){
        if(index >= 0 && index < tracks.size()) {
            Track track = tracks.get(index); 
            System.out.println(track.getDetails()); 
        }
    }

    public Track tracksToTitle(String title) {
        ArrayList<Track> trackTitle = new ArrayList<>();
        for(Track track : tracks) {
            if(track.contains(title)) {
                 trackTitle.add(track);
            }
        }
        return trackTitle; 
    }

    public Track tracksToArtist(String artist) {
        ArrayList<Track> trackArtist = new ArrayList<>();
        for(Track track : tracks) {
            if(track.contains(artist)) {
                trackArtist.add(track); 
            }
        }
        return trackArtist; 
    }

    public int sizeTracks() {
        return tracks.size(); 
    }

    public void listAllTracks() {
        for (String file : tracks) {
            System.out.println(file); 
        }
    }
}