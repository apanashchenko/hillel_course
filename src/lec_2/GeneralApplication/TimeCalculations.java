package lec_2.GeneralApplication;

public class TimeCalculations {
    public static void main(String[] args) {
        double seconds = 3485673;
        double secondsToMin = seconds/60;
        double secondsToHours =seconds/(60*60);
        double secondsToDays =seconds/(60*60*24);

        System.out.println(seconds+ " seconds equal "+secondsToMin+" minutes");
        System.out.println(seconds+ " seconds equal "+secondsToHours+" hours");
        System.out.println(seconds+ " seconds equal "+secondsToDays+" days");
    }
}
