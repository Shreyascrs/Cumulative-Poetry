public class Main {
    public static void main(String[] args) {

        int day = 0;
        if (args.length == 2 && args[0].equals("--reveal-for-day")) {
            day = Integer.parseInt(args[1]);
        }
        if (args.length == 3 && args[0].equals("--echo") && args[1].equals("--reveal-for-day")) {
            day = Integer.parseInt(args[2]);
        }
        if(day>0 && day<=12) {
            Poetry poetry = new Poetry();
            System.out.println(poetry.poem(args.length, day));
                System.exit(0);
        }
        System.out.println("invalid selection of days");
    }
}
