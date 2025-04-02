class Musician{
    String name;
    String instrument;

    public Musician(String name, String instrument){
        this.name=name;
        this.instrument=instrument;
    }
    public void playMusic(){
        System.out.println("Musician "+ name+" is playing "+instrument);
    }
}
class Guitarist extends Musician{
    String genre;

    public Guitarist(String name, String instrument, String genre){
        super(name, instrument);
        this.genre=genre;
    }
    @Override
    public void playMusic(){
        super.playMusic();
        System.out.println(name +" is a "+ genre+ " guitarist.");
    }
}

public class MusicianAndGuitarist {
    public static void main(String [] args){
        Musician musician= new Musician("nisa", "piano");
        Guitarist guitarist= new Guitarist("Nisa", "guitar", "pop");
        musician.playMusic();
        guitarist.playMusic();
    }
}
