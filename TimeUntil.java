import java.util.Scanner;
import java.time.LocalDateTime;
public class TimeUntil {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        int h;
        int m;
        int s;
        int lh;
        int lm;
        int ls;
        int dh;
        int dm;
        int ds;

        h = LocalDateTime.now().getHour();
        m = LocalDateTime.now().getMinute();
        s = LocalDateTime.now().getSecond();

        System.out.println("Input Hour");
        lh = scan.nextInt();
        System.out.println("Input Minutes");
        lm = scan.nextInt();
        System.out.println("Input Seconds");
        ls = scan.nextInt();

        dh = lh - h;
        dm = lm - m;
        ds = ls - s;

        if (dm < 0) {
            dh = dh - 1;
            dm = dm + 60;
        }
         if (ds < 0) {
            dm = dm - 1;
            ds = ds + 60;
        }


        System.out.println(dh + " Hours until time entered");
        System.out.println(dm + " Minutes until time entered");
        System.out.println(ds + " Seconds until time entered");



    
    }   


}