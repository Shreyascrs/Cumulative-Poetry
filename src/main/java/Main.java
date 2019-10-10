import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Poetry poetry = new Poetry();
        int day;
        List<String> arguments;
        arguments= Arrays.asList(args);

        if (arguments.contains("--reveal-for-day")) {
            day = Integer.parseInt(args[1]);
            System.out.println(poetry.poem(day));
            System.exit(0);
        }
        if (args.length == 3 && args[0].equals("--echo") && args[1].equals("--reveal-for-day")) {
            day = Integer.parseInt(args[2]);
            System.out.println(poetry.poem(day));
            System.exit(0);
        }
    }
}
