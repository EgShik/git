import java.util.ArrayList;
import java.util.Scanner;
public class Sasha2{
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0);
        Controller controller = new Controller();
        controller.readCommands(10);
        ArrayList<String> cmd = controller.getCommands();
        robot.execute(cmd);
        System.out.println("x: " + robot.getX().toString());
        System.out.println("y: " + robot.getY().toString());
    }
}


