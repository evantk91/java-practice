import java.util.ArrayList;

public class Playlist {

   public static void main(String[] args) {
      ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
      
      //add songs to the playlist
      desertIslandPlaylist.add("Fresh Static Snow");
      desertIslandPlaylist.add("Divinity");
      desertIslandPlaylist.add("Language");
      desertIslandPlaylist.add("Disarm You");
      desertIslandPlaylist.add("Still Sleeping");
      desertIslandPlaylist.add("Take You Down");
      desertIslandPlaylist.add("Ocean Drive");

      System.out.println(desertIslandPlaylist);
      
      System.out.println(desertIslandPlaylist.size());

      //remove songs from playlist
      desertIslandPlaylist.remove("Disarm You");
      desertIslandPlaylist.remove("Ocean Drive");

      //swap songs in playlist
      int idx1 = desertIslandPlaylist.indexOf("Fresh Static Snow");
      int idx2 = desertIslandPlaylist.indexOf("Still Sleeping");
      String tmpSong = desertIslandPlaylist.get(idx1);

      desertIslandPlaylist.set(idx1, desertIslandPlaylist.get(idx2));
      desertIslandPlaylist.set(idx2, tmpSong);
      System.out.println(desertIslandPlaylist);
   }
}
