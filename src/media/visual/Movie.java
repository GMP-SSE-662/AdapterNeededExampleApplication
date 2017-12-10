package media.visual;

import media.ContinuousMedia;

public class Movie implements ContinuousMedia {
    String name;

    public Movie(String name) {
        this.name = name;
    }

    @Override
    public void printInstructions() {
        System.out.println("Movie instructions:\nW: Play\nS: Pause\n" +
                "A: 15 Minutes Back\nD: 15 Minutes Forward");
    }

    @Override
    public void play() {
        System.out.println(String.format("Playing movie: %s.", name));
    }

    @Override
    public void pause() {
        System.out.println(String.format("Pausing movie: %s.", name));
    }

    @Override
    public void jumpForward() {
        System.out.println("Jumping 15 minutes forward.");
    }

    @Override
    public void jumpBackward() {
        System.out.println("Jumping 15 minutes backward.");
    }
}
