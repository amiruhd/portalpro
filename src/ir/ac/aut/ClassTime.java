package ir.ac.aut;

public class ClassTime {
    private Day day;
    private Hour hour;

    public static ClassTime getTime(){
        return null;
    }

}

enum Hour {
    FIRST("8-10"), SECOND("10-12"), THIRD("14-16");
    private String time;

    Hour(String time) {
        this.time = time;
    }

    public static void choose() {

    }
}
