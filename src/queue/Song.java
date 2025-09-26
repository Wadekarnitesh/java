public class Song {

    String name;
    String singer;
    String lyrics;
    String movie;

    public Song() {
    }

    public Song(String name, String singer, String lyrics, String movie) {
        super();
        this.name = name;
        this.singer = singer;
        this.lyrics = lyrics;
        this.movie = movie;
    }

   public String toString() {
		return "[ name: "+ name +" singer: "+singer+ " lyrics: "+lyrics+" movie: "+movie+ " ]" ;
	}

    
    
    
}
