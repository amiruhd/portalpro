package ir.ac.aut;

public enum Day {
    SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;


    public static void showDay() {
        System.out.println("1 --> " + Day.SATURDAY);
        System.out.println("2 --> " + Day.SUNDAY);
        System.out.println("3 --> " + Day.MONDAY);
        System.out.println("4 --> " + Day.TUESDAY);
        System.out.println("5 --> " + Day.WEDNESDAY);
        System.out.println("6 --> " + Day.THURSDAY);
        System.out.println("7 --> " + Day.FRIDAY);
    }

    public static Day whichDay() {
        System.out.println("Pick a day ");
        showDay();
        int choose;
        while (true) {
            choose = Sc.nextBetWeenInt(1, 7);
            switch (choose) {
                case 1:
                    return Day.SATURDAY;
                case 2:
                    return Day.SUNDAY;
                case 3:
                    return Day.MONDAY;
                case 4:
                    return Day.TUESDAY;
                case 5:
                    return Day.WEDNESDAY;
                case 6:
                    return Day.THURSDAY;
                case 7:
                    return Day.FRIDAY;
                default:
            }
        }
    }

}