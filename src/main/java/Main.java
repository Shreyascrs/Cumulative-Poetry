public class Main {
    public static void main(String[] args) {

        String option = args[0];
        int day = Integer.parseInt(args[1]);
        if(day>0 && day<=12) {
            Poetry poetry = new Poetry();
            if (option.equals("--reveal-for-day")) {
                System.out.println(poetry.poem(day));
                System.exit(0);
            }
        }
        System.out.println("invalid selection of days");
    }
}
