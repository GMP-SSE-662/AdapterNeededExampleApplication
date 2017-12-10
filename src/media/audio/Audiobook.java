package media.audio;

import media.SegmentedMedia;

public class Audiobook implements SegmentedMedia {
    String name;

    public Audiobook(String name) {
        this.name = name;
    }

    @Override
    public void printInstructions() {
        System.out.println("Audiobook instructions:\nW: Play\nS: Pause\n" +
                "A: Previous Chapter\nD: Next Chapter");
    }

    @Override
    public void play() {
        System.out.println(String.format("Playing audiobook: %s.", name));
    }

    @Override
    public void pause() {
        System.out.println(String.format("Pausing audiobook: %s.", name));
    }

    @Override
    public void nextSegment() {
        System.out.println(String.format("Playing next chapter of %s.", name));
    }

    @Override
    public void previousSegment() {
        System.out.println(String.format("Playing previous chapter of %s", name));
    }
}
