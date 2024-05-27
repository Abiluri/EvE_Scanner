import java.awt.event.InputEvent;
import java.lang.Thread;
import java.awt.*;
import java.util.Random;

public class MouseMovement {
    Point[] pointChain;
    Point point = new Point();

    private int rnd(int x, int y) {
        Random random = new Random();
        int result = random.nextInt(x, y);
        return result;
    }StringBuilder

    public MouseMovement(int x, int y) {
        Point point = new Point(x, y);
        this.point = point;
    }

    public MouseMovement(Point point) {
        this.point = point;
    }

    public void setPointChain(Point[] pointChain) {
        this.pointChain = pointChain;
    }

    public void moveToChain() throws InterruptedException {
        for (int i = 0; i < pointChain.length; i++) {
            moveTo(pointChain[i]);
            Thread.sleep(1000);
        }
    }

    public void moveTo(Point point) {
        try {
            Robot robot = new Robot();
            robot.mouseMove(point.x, point.y);
        } catch (AWTException e) {
        }
    }

    public void moveTo() {
        try {
            Robot robot = new Robot();
            robot.mouseMove(this.point.x, this.point.y);
        } catch (AWTException e) {
        }
    }

    public void getPosition(){
        this.point = MouseInfo.getPointerInfo().getLocation();
    }

    public void leftClick() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(rnd(100, 1500));
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }


}


