import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestPoetry {


    String[] args={"--reveal-for-day","--echo"};
    @Test
    void givenDayOne_WhenPoemLines_ThenProvidesDayOnePoem() {
        Poetry poetry = new Poetry();
        Assertions.assertEquals("This is the house that Jack built." + "\n", poetry.poem(args, 1));
    }

    @Test
    void givenDayTwo_WhenPoemLines_ThenProvidesDayTwoPoem() {
        Poetry poetry = new Poetry();
        String result = "This is the malt that lay in \n" +
                "the house that Jack built.\n";
        Assertions.assertEquals(result, poetry.poem(args, 2));
    }

    @Test
    void givenDayTwelve_WhenPoemLines_ThenProvidesDayTwelvePoem() {
        Poetry poetry = new Poetry();
        String result = "This is the horse and the hound and the horn that belonged to \n" +
                "the farmer sowing his corn that kept \n" +
                "the rooster that crowed in the morn that woke \n" +
                "the priest all shaven and shorn that married \n" +
                "the man all tattered and torn that kissed \n" +
                "the maiden all forlorn that milked \n" +
                "that cow with the crumpled horn that tossed \n" +
                "the dog that worried \n" +
                "the cat that killed \n" +
                "the rat that ate \n" +
                "the malt that lay in \n" +
                "the house that Jack built.\n";
        Assertions.assertEquals(result, poetry.poem(args, 12));
    }
    @Test
    void givenDayTwoWithEchoFlag_WhenPoemLines_ThenProvidesDayTwoPoem() {
        String[] args={"--reveal-for-day","--echo",""};
        Poetry poetry = new Poetry();
        String result = "This is the malt that lay in \n" +
                "the malt that lay in \n"+
                "the house that Jack built.\n"+
                "the house that Jack built.\n";
        Assertions.assertEquals(result, poetry.poem(args, 2));
    }
}
