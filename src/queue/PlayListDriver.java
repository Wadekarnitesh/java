public class PlayListDriver {

    public static void main(String[] args) {
        
        PlayList p1 = new PlayList("favourite");

        p1.addSong("Jai Ho!", "A. R. Rehma", "A. R. Rehma", "Slumdog Millenaire");
        p1.addSong("Ek Chatur Naar", "Kishor Kumar", "Himanshu Tripathi", "Padosan");
        p1.showCurrentSong();
        
    }


    
}
