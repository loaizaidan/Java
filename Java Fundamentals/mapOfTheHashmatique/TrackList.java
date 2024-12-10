import java.util.HashMap;
import java.util.Map;

public class TrackList {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();

        trackList.put("Kid Charlemagne", "Is there gas in the car?...");
        trackList.put("Surf's Up", "A love that's so deep...");
        trackList.put("Cloudbusting", "You're like my yo-yo");
        trackList.put("Once In A Lifetime", "And you may ask yourself, 'Well, how did I get here?'");
        trackList.put("Sindibad", "Shabjdeed had ana, malik el a7wal...");

        String trackTitle = "Kid Charlemagne";
        String lyrics = trackList.get(trackTitle);
        System.out.println("The lyrics for " + trackTitle + " are: " + lyrics);

        System.out.println("Tracks: ");
        for (Map.Entry<String, String> track : trackList.entrySet()) {
            System.out.println("Track: " + track.getKey() + " / " + track.getValue() + ", and you have " + trackList.size() + " songs in your library.");
        }
    }
}