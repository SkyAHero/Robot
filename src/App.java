import java.awt.*;
import java.awt.event.InputEvent;
public class App {
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(60000);
                    } catch (Exception e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }
        }).start();
    }
}
