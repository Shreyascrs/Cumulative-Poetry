package formatter;

public class EchoFormatter implements Formatter {
    private int noOfTimesToRepete;
    private Formatter formatter;
    private String result = "";

    public EchoFormatter(int noOfTimesToRepete) {
        this.noOfTimesToRepete = noOfTimesToRepete;
    }

    public EchoFormatter(int noOfTimesToRepete, Formatter formatter) {
        this.noOfTimesToRepete = noOfTimesToRepete;
        this.formatter = formatter;
    }


    @Override
    public String format(String input) {
//        if (formatter != null) {
        result="";
        for (int i = 0; i < noOfTimesToRepete; i++) {
            result = result + input + "\n";
        }
        //}

        return result;
    }
}
