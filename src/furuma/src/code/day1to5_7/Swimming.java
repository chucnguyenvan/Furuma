package code.day1to5_7;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Swimming {
    Date date = new Date();
    private int timeOpen=9;
    public Swimming() {
    }
//    if((cal.HOUR_OF_DAY<9)||cal.HOUR_OF_DAY>22){
//        System.out.println("Ho Boi se mo cua luc 9H00");
//    }else {
//        System.out.println("WELCOME");
//    }
    public void disPlayOpenTime(){
        System.out.println("Ho boi mo cua luc 9H00 va dong luc 22h00 hang ngay");
    }
}
