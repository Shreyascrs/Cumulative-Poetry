import formatter.Formatter;
import formatter.ToUpperFormatter;

import java.util.ArrayList;
import java.util.List;

public class Poetry {

    private String result = "This is ";

    private List<String> poemLines = new ArrayList<>();
    private Formatter formatter;

    Poetry(Formatter formatter) {
        this.formatter = formatter;
        poemLines.add("the house that Jack built.");
        poemLines.add("the malt that lay in ");
        poemLines.add("the rat that ate ");
        poemLines.add("the cat that killed ");
        poemLines.add("the dog that worried ");
        poemLines.add("that cow with the crumpled horn that tossed ");
        poemLines.add("the maiden all forlorn that milked ");
        poemLines.add("the man all tattered and torn that kissed ");
        poemLines.add("the priest all shaven and shorn that married ");
        poemLines.add("the rooster that crowed in the morn that woke ");
        poemLines.add("the farmer sowing his corn that kept ");
        poemLines.add("the horse and the hound and the horn that belonged to ");
    }

    public String poem(int day) {

        if (formatter instanceof ToUpperFormatter) {
            result = result.toUpperCase();
        }
        for (int i = day - 1; i >= 0; i--) { // TODO - very complicated logic.

            result += formatter.format(poemLines.get(i));
        }

        return result;
    }
}
