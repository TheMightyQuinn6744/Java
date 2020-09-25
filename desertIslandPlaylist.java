import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Trouble");
    desertIslandPlaylist.add("Practice");
    desertIslandPlaylist.add("Peep Hole");
    desertIslandPlaylist.add("Call It Even");
    desertIslandPlaylist.add("TLC (feat. Gunna)");
    desertIslandPlaylist.add("Can't Stop");

    //System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
    //System.out.println(desertIslandPlaylist.remove(0));
    System.out.println(desertIslandPlaylist.size());
    //System.out.println(desertIslandPlaylist);

    String troubleIndex = desertIslandPlaylist.indexOf("Trouble");
    String practiceIndex = desertIslandPlaylist.indexOf("Practice");

    String tempA = "Trouble";

    desertIslandPlaylist.set(troubleIndex, "Practice");
    desertIslandPlaylist.set(practiceIndex, "Trouble");

    //System.out.println(desertIslandPlaylist);
  }
  
}
