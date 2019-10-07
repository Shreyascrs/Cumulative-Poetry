import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPoetry {

    @Test
    void givenDayOne_WhenPoem_ThenProvidesDayOnePoem() {
        Poetry poetry = new Poetry();
        Assertions.assertEquals("This is the house that Jack built." + "\n", poetry.poem(1));
    }

    @Test
    void givenDayTwo_WhenPoem_ThenProvidesDayTwoPoem() {
        Poetry poetry = new Poetry();
        String result = "This is the malt that lay in \n" +
                "the house that Jack built.\n";
        Assertions.assertEquals(result, poetry.poem(2));
    }

    @Test
    void givenDayTwelve_WhenPoem_ThenProvidesDayTwelvePoem() {
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
        Assertions.assertEquals(result, poetry.poem(12));
    }
}