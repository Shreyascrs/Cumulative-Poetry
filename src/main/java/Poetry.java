import java.util.ArrayList;
import java.util.List;

public class Poetry {

    String result = "This is ";

    List<String> poemLines = new ArrayList<>();

    Poetry() {

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
        for (int i = day; i > 0; i--) {
            result += poemLines.get(--day) + "\n";
        }
        return result;
    }
}
