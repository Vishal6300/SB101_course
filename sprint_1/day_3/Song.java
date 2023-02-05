package vishal_fw20_0280.unit_4.sprint_1.day_3;

public class Song {

    String artist;
    String title;

    void play(){
        System.out.println(artist +" is singing "+ title);
    }

    public static void main(String[] args){

        Song track1= new Song();
        track1.artist="Lata";
        track1.title="Vande Mantaram";
        track1.play();

        Song track2=new Song();
        track2.artist="Arijit";
        track2.title="Kesariya";
        track2.play();
    }
}
