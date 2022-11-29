import java.util.HashMap;
import java.util.Set;

public class TestHash {
    public static void main(String[] args) {
        // Create a new hashmap
        HashMap<String, String> trackList = new HashMap<String, String>();
        // Add track titles as keys with lyrics as their values
        trackList.put("I Want It That Way","You are my fire, The one desire, Believe when I say, I want it that way...");
        trackList.put("Sk8er Boi","He was a boy. She was a girl. Can I make it anymore obvious?...");
        trackList.put("Anti-Hero","I have this thing where I get older, but just never wiser, Midnights become my afternoons...");
        trackList.put("Lose Yourself","Look, if you had one shot, or one opportunity, To seize everything you ever wanted, in one moment...");

        System.out.println("\n----- Get Song by Title Test -----");
        // Pull out a song by its track title
        System.out.println(trackList.get("Sk8er Boi"));
        
        System.out.println("\n----- Print All Tracks Test -----");
        // Get track titles
        Set<String> trackTitles = trackList.keySet();
        // Print out a list of the track names and lyrics in the format [Track: Lyrics]
        for(String trackTitle : trackTitles) {
            System.out.printf("%s : %s%n",trackTitle,trackList.get(trackTitle));
        }
    }
}