import formatter.AlternateEchoFormatter;
import formatter.EchoFormatter;
import formatter.RevealForDayFormatter;
import formatter.ToUpperFormatter;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        int day;
        List<String> arguments;
        arguments= Arrays.asList(args);


        if (args.length == 2 && arguments.contains("--reveal-for-day")) {
            day = Integer.parseInt(arguments.get(1));
            Poetry poetry = new Poetry(new RevealForDayFormatter());
            System.out.println(poetry.poem(day));
        }
        if (args.length == 4 && arguments.contains("--echo") && arguments.contains("--reveal-for-day")) {
            day = Integer.parseInt(arguments.get(3));
            Poetry poetry = new Poetry(new EchoFormatter(Integer.parseInt(args[1]), new RevealForDayFormatter()));
            System.out.println(poetry.poem(day));
        }
        if (args.length == 5 && arguments.contains("--alternative") && arguments.contains("--echo") && arguments.contains("--reveal-for-day")) {
            day = Integer.parseInt(arguments.get(4));
            Poetry poetry = new Poetry(new AlternateEchoFormatter(new EchoFormatter(Integer.parseInt(args[2]), new RevealForDayFormatter())));
            System.out.println(poetry.poem(day));
        }
        if (args.length == 5 && arguments.contains("--uppercase") && arguments.contains("--echo") && arguments.contains("--reveal-for-day")) {
            day = Integer.parseInt(arguments.get(4));
            Poetry poetry = new Poetry(new ToUpperFormatter(new EchoFormatter(Integer.parseInt(args[2]), new RevealForDayFormatter())));
            System.out.println(poetry.poem(day));
        }
    }
}
