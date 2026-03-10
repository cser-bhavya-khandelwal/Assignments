package Feb_20.entity_relationship_association;

public class JavaApp {

    public static void execution() {

        
        Engine engine = new Engine(1500, "Water Based", 4);

        Car car = new Car("Hyundai", "Creta", "Made in India", 963963.96, engine);

       
        MediaPlayer mediaPlayer = new MediaPlayer("Boat", "Music Player", 369369.36);

        
        car.setMediaPlayer(mediaPlayer);

        
        car.displayCarDetails();
    }
}