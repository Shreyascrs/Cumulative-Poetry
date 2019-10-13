package formatter;

public class AlternateEchoFormatter implements Formatter {
    private int count = 0;
    private String result;
    private Formatter formatter;


    public AlternateEchoFormatter(Formatter formatter) {

        this.formatter = formatter;
    }

    @Override
    public String format(String input) {
        result = "";
        count++;
        if (count % 2 == 0) {

            return formatter.format(input);
        }
        result += input + "\n";
        return result;
    }
}
