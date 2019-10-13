import formatter.AlternateEchoFormatter;
import formatter.EchoFormatter;
import formatter.RevealForDayFormatter;
import formatter.ToUpperFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestPoetry {


    @Test
    void givenDayOneWithEchoFlagOne_WhenPoemLines_ThenProvidesDayOnePoem() {
        EchoFormatter formatter = new EchoFormatter(1);
        Poetry poetry = new Poetry(formatter);
        assertEquals("This is the house that Jack built." + "\n", poetry.poem(1));
    }

    @Test
    void givenDayOneWithEchoFlagFlagTwo_WhenPoemLines_ThenProvidesDayOnePoem() {
        EchoFormatter formatter = new EchoFormatter(2);
        Poetry poetry = new Poetry(formatter);
        assertEquals("This is the house that Jack built." + "\n"
                + "the house that Jack built." + "\n", poetry.poem(1));
    }

    @Test
    void givenDayOneToUpperCase_WhenPoemLines_ThenProvidesDayPoemInUpperCase() {
        Poetry poetry = new Poetry(new ToUpperFormatter());
        assertEquals("THIS IS THE HOUSE THAT JACK BUILT.\n", poetry.poem(1));
    }

    @Test
    void givenDayTwoToUpperCase_WhenPoemLines_ThenProvidesDayPoemInUpperCase() {
        Poetry poetry = new Poetry(new ToUpperFormatter());
        assertEquals("THIS IS THE MALT THAT LAY IN \n" +
                "THE HOUSE THAT JACK BUILT.\n", poetry.poem(2));
    }

    @Test
    void givenDayTwoWithALternateAndEchoFlag_WhenPoemLines_ThenProvidesDayPoemInUpperCase() {
        Poetry poetry = new Poetry(new AlternateEchoFormatter(new EchoFormatter(2)));
        assertEquals("This is the malt that lay in \n" +
                "the house that Jack built.\n" +
                "the house that Jack built.\n", poetry.poem(2));
    }

    @Test
    void givenDayTwoWithALternateAndToUpperCaseFlag_WhenPoemLines_ThenProvidesDayPoemInUpperCaseWithAlternativeFlag() {
        Poetry poetry = new Poetry(new AlternateEchoFormatter(new ToUpperFormatter()));
        assertEquals("This is the malt that lay in \n" +
                "THE HOUSE THAT JACK BUILT.\n", poetry.poem(2));
    }

    @Test
    void givendayTwoWithEchoFlagAndReveleForTheDay_WhenPoemLines_ThenProvidesDayPoemInUpperCaseWithAlternativeFlag() {
        Poetry poetry = new Poetry(new EchoFormatter(4, new RevealForDayFormatter()));
        assertEquals("This is the malt that lay in \n" +
                "the malt that lay in \n" +
                "the malt that lay in \n" +
                "the malt that lay in \n" +
                "the house that Jack built.\n" +
                "the house that Jack built.\n" +
                "the house that Jack built.\n" +
                "the house that Jack built.\n", poetry.poem(2));
    }

    @Test
    void givendayTwoWithALternateAndEchoFlag_WhenPoemLines_ThenProvidesDayPoemInUpperCaseWithAlternativeFlag() {
        Poetry poetry = new Poetry(new AlternateEchoFormatter(new EchoFormatter(2,new RevealForDayFormatter())));
        assertEquals("This is the malt that lay in \n" +
                "the house that Jack built.\n" +
                "the house that Jack built.\n", poetry.poem(2));
    }

    @Test
    void givendayTwoWithUppercaseAndEchoFlag_WhenPoemLines_ThenProvidesDayPoemInUpperCaseWithAlternativeFlag() {
        Poetry poetry = new Poetry(new ToUpperFormatter(new EchoFormatter(2,new RevealForDayFormatter())));
        assertEquals("THIS IS THE MALT THAT LAY IN \n" +
                "THE MALT THAT LAY IN \n" +
                "THE HOUSE THAT JACK BUILT.\n" +
                "THE HOUSE THAT JACK BUILT.\n", poetry.poem(2));
    }
}

