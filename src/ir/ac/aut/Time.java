package ir.ac.aut;

public enum Time {
    MORNING, AFTER_NOON, NIGHT;

    public static void showTime() {
        System.out.println("--------- Pick Time ---------");
        System.out.println("1 -> " + Time.MORNING);
        System.out.println("2 -> " + Time.AFTER_NOON);
        System.out.println("3 -> " + Time.NIGHT);
    }

    public static Time when() {
        int option;
        while (true) {
            showTime();
            option = Sc.nextBetWeenInt(1, 3);
            switch (option) {
                case 1:
                    return Time.MORNING;
                case 2:
                    return Time.AFTER_NOON;
                case 3:
                    return Time.NIGHT;
                default:
            }
        }
    }
}
