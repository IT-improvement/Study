package list.bronze;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Q10699 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
        String today = sdf.format(date);
        System.out.println(sdf.format(date));
    }
}
