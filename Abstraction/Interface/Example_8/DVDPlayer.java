package Abstraction.Interface.Example_8;

public class DVDPlayer implements Player {
        public void play() {
        System.out.println("DVD playing...");
    }

    public void stop() {
        System.out.println("DVD stopped.");
    }

    public void pause() {
        System.out.println("DVD paused.");
    }

    public void reverse() {
        System.out.println("DVD reversing...");
    }

    public void video() {
        System.out.println("DVD video output.");
    }
}
