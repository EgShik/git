import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    String command;
    public ArrayList<String> comands = new ArrayList<>();
    public ArrayList<String> transcomands = new ArrayList<String>();
    Scanner in = new Scanner(System.in);

    public void readCommands(int ammount) {
        for (int i = 0; i < ammount; i++) {
            System.out.println("введите команду");
            command = in.nextLine();
            if (command.equals("w")) {
                comands.add(command);
            } else {
                if (command.equals("a")) {
                    comands.add(command);
                } else {
                    if (command.equals("s")) {
                        comands.add(command);
                    } else {
                        if (command.equals("d")) {
                            comands.add(command);
                        }
                    }
                }
            }
        }
    }

    public ArrayList<String> getCommands() {

        for (int i = 0; i < comands.size(); i++) {
            String comand = comands.get(i);
            if (comand.equals("w")) {
                transcomands.add( "move_up");
            } else {
                if (comand.equals("a")) {
                    transcomands.add( "move_left");
                } else {
                    if (comand.equals("s")) {
                        transcomands.add( "move_down");
                    } else {
                        if (comand.equals("d")) {
                            transcomands.add("move_right");
                        }
                    }
                }
            }
        }
        return transcomands;
    }
}

