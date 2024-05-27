import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MouseMovement mouse = new MouseMovement(500, 500);
        Point point = new Point(1000, 500);
        mouse.moveTo(point);
        System.out.println(MouseInfo.getPointerInfo().getLocation());
        mouse.moveTo();
        System.out.println(MouseInfo.getPointerInfo().getLocation());
    }
}