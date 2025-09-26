public class PlayListDriver {

    public static void main(String[] args) {
        
        PlayList p1 = new PlayList("favourite");

            p1.addSong("Jai Ho!", "A. R. Rahman", "A. R. Rahman", "Slumdog Millionaire");
            p1.addSong("Tum Hi Ho", "Arijit Singh", "Mithoon", "Aashiqui 2");
            p1.addSong("Kun Faya Kun", "A. R. Rahman", "A. R. Rahman", "Rockstar");
            p1.addSong("Senorita", "Shankar-Ehsaan-Loy", "Javed Akhtar", "Zindagi Na Milegi Dobara");
            p1.addSong("Dil Dhadakne Do", "Shankar-Ehsaan-Loy", "Javed Akhtar", "Zindagi Na Milegi Dobara");
            p1.addSong("Tera Ban Jaunga", "Akhil Sachdeva & Tulsi Kumar", "Kumaar", "Kabir Singh");
            p1.addSong("Kal Ho Naa Ho", "Sonu Nigam", "Javed Akhtar", "Kal Ho Naa Ho");
            p1.addSong("Channa Mereya", "Arijit Singh", "Amitabh Bhattacharya", "Ae Dil Hai Mushkil");
            p1.addSong("Zinda", "Siddharth Mahadevan", "Prasoon Joshi", "Bhaag Milkha Bhaag");
            p1.addSong("Ghungroo", "Arijit Singh & Shilpa Rao", "Kumaar", "War");

        System.out.println(p1);
        p1.playNext();   
    }    
}
