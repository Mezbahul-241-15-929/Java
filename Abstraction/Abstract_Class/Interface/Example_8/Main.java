package Abstraction.Abstract_Class.Interface.Example_8;

public class Main {
    public static void main(String[] args) {

        CDPlayer cd = new CDPlayer();
        cd.play();
        cd.stop();
        cd.pause();
        cd.reverse();
        cd.audio();

        DVDPlayer dvd = new DVDPlayer();
        dvd.play();
        dvd.stop();
        dvd.pause();
        dvd.reverse();
        dvd.video();    
    }
}

