package Greenlight.Util;

public class WebDriverWait {
    public static void driverwait(int sec){
        try {
            Thread.sleep(1000 * sec);
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception caught");
        }
    }
}
