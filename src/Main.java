import media.ContinuousMedia;
import media.SegmentedMedia;
import media.audio.Album;
import media.audio.Audiobook;
import media.audio.Podcast;
import media.visual.Movie;

public class Main {

    public static void main(String[] args) {
        String input = "";
        SegmentedMedia segMed;
        ContinuousMedia conMed;
        ConsoleInput in = new ConsoleInput();
        while (!input.equalsIgnoreCase("e")) {
            System.out.println("Please specify which media you would like to consume: ");
            System.out.println("A. Album\nB. Audiobook\nC. Podcast\nD. Movie\nE. Quit");
            input = in.getInput();
            switch (input.toUpperCase()) {
                case "A":
                    segMed = new Album("Freedom Goblin");
                    conMed = null;
                    break;
                case "B":
                    segMed = new Audiobook("Head First Design Patterns");
                    conMed = null;
                    break;
                case "C":
                    conMed = new Podcast("Hello Internet");
                    segMed = null;
                    break;
                case "D":
                    conMed = new Movie("Arrival");
                    segMed = null;
                    break;
                case "E":
                    continue;
                default:
                    System.out.println("Please enter valid input.");
                    continue;
            }

            if (segMed != null && conMed == null)
                segMed.printInstructions();
            else if (segMed == null && conMed != null)
                conMed.printInstructions();
            System.out.println("E. Quit");

            while (!input.equalsIgnoreCase("e")) {
                input = in.getInput();
                switch (input.toUpperCase()) {
                    case "W":
                        if (segMed != null && conMed == null)
                            segMed.play();
                        else if (segMed == null && conMed != null)
                            conMed.play();
                        break;
                    case "A":
                        if (segMed != null && conMed == null)
                            segMed.previousSegment();
                        else if (segMed == null && conMed != null)
                            conMed.jumpBackward();
                        break;
                    case "S":
                        if (segMed != null && conMed == null)
                            segMed.pause();
                        else if (segMed == null && conMed != null)
                            conMed.pause();
                        break;
                    case "D":
                        if (segMed != null && conMed == null)
                            segMed.nextSegment();
                        else if (segMed == null && conMed != null)
                            conMed.jumpForward();
                        break;
                    case "E":
                        continue;
                    default:
                            System.out.println("Please enter valid input");
                            break;
                }
            }
            System.out.println("Do you desire to play a new form of media? (y/n)");
            input = in.getInput().equalsIgnoreCase("n") ? "e" : "";
        }
    }
}
