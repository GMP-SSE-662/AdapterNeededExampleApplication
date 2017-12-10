import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {
    private BufferedReader in;

    public ConsoleInput() {
        in = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getInput() {
        String input = "";
        try {
            input = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
}
