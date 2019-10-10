import java.util.ArrayList;
import java.util.List;

public class EchoFlag extends Poetry {
    private int echoTimes = 1;

    public void setEchoTimes(int echoTimes) {
        this.echoTimes = echoTimes;
    }

    private String result = "This is ";


    private List<String> poemLines = new ArrayList<>();

    EchoFlag() {
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

    @Override
    public String poem(int day) {
        for (int i = day; i > 0; i--) {
            day = --day;
            for (int j = 0; j < echoTimes; j++) {
                result += poemLines.get(day) + "\n";
            }
        }
        return result;
    }
}
