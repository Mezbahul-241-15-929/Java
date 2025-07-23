package Abstraction.Abstract_Class.Interface.Example_8;

public class CDPlayer implements Player {
    public void play() {
        System.out.println("CD playing...");
    }

    public void stop() {
        System.out.println("CD stopped.");
    }

    public void pause() {
        System.out.println("CD paused.");
    }

    public void reverse() {
        System.out.println("CD reversing...");
    }

    public void audio() {
        System.out.println("CD audio output.");
    }
}
