package formatter;

public class ToUpperFormatter implements Formatter {
    private Formatter format;

    public ToUpperFormatter(Formatter format) {
        this.format = format;
    }

    public ToUpperFormatter() {
    }

    @Override
    public String format(String input) {
        if (format == null) {
            return input.toUpperCase() + "\n";
        }
        return format.format(input.toUpperCase());
    }
}
