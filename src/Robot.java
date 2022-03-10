import javax.swing.*;
import java.util.ArrayList;

class Robot {
    private Integer x;
    private Integer y;

    public Robot(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void execute(ArrayList<String> commands){
        for (String command : commands) {
            if(command.equals("move_left")){
                x-=1;
            }
            if(command.equals("move_right")){
                x+=1;
            }
            if(command.equals("move_up")){
                y+=1;
            }
            if(command.equals("move_down")){
                y-=1;
            }
        }
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }
}
