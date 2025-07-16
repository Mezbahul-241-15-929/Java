package Access_Modifiers;

public class B {
    private int secret = 123;

    private void displaySecret() {
        System.out.println("Private: " + secret);
    }

    public void accessPrivate() {
        // Private members are accessible here
        displaySecret();
    }
}