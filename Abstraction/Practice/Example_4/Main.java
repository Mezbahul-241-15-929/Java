package Abstraction.Practice.Example_4;

public class Main {
    public static void main(String[] args) {
        CDPlayer cd= new CDPlayer();
        DVDPlayer dvd = new DVDPlayer();

        cd.play();
        cd.stop();
        cd.pause();
        cd.reverse();
        cd.audio();

        dvd.play();
        dvd.stop();
        dvd.pause();
        dvd.reverse();
        dvd.video();


    }
}
