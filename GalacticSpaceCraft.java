import java.util.*;
public class GalacticSpaceCraft {
    private int x;
    private int y;
    private int z;
    private Direction direction;

    public GalacticSpaceCraft(int x, int y, int z, Direction direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public void executeCommands(String[] commands) {
        for (String command : commands) {
            executeCommand(command);
        }
    }

    private void executeCommand(String command) {
        switch (command) {
            case "f":
                moveForward();
                break;
            case "b":
                moveBackward();
                break;
            case "r":
                turnRight();
                break;
            case "l":
                turnLeft();
                break;
            case "u":
                turnUp();
                break;
            case "d":
                turnDown();
                break;
            default:
               
                break;
        }
    }

    private void moveForward() {
        switch (direction) {
            case N:
                y++;
                break;
            case S:
                y--;
                break;
            case E:
                x++;
                break;
            case W:
                x--;
                break;
            case Up:
                z--;
                break;
            case Down:
                z++;
                break;
        }
    }

    private void moveBackward() {
        switch (direction) {
            case N:
                y--;
                break;
            case S:
                y++;
                break;
            case E:
                x--;
                break;
            case W:
                x++;
                break;
            case Up:
                z++;
                break;
            case Down:
                z--;
                break;
        }
    }

    private void turnRight() {
        switch (direction) {
            case N:
                direction = Direction.E;
                break;
            case S:
                direction = Direction.W;
                break;
            case E:
                direction = Direction.S;
                break;
            case W:
                direction = Direction.N;
                break;
            case Up:
            case Down:
                
                break;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case N:
                direction = Direction.W;
                break;
            case S:
                direction = Direction.E;
                break;
            case E:
                direction = Direction.N;
                break;
            case W:
                direction = Direction.S;
                break;
            case Up:
            case Down:
               
                break;
        }
    }

    private void turnUp() {
        switch (direction) {
            case N:
                direction = Direction.Up;
                break;
            case S:
                direction = Direction.Down;
                break;
            case E:
            case W:
               
                break;
            case Up:
            case Down:
                
                break;
        }
    }

    private void turnDown() {
        switch (direction) {
            case N:
                direction = Direction.Down;
                break;
            case S:
                direction = Direction.Up;
                break;
            case E:
            case W:
                
                break;
            case Up:
            case Down:
                
                break;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Direction getDirection() {
        return direction;
    }

    public static void main(String[] args) {
        GalacticSpaceCraft spaceCraft = new GalacticSpaceCraft(0, 0, 0, Direction.N);
        
        String[] commands = {"f", "r", "u", "b", "l"};
        spaceCraft.executeCommands(commands);
        
        System.out.println("Final Position: (" + spaceCraft.getZ() + ", " + spaceCraft.getY() + ", " + spaceCraft.getX() + ")");
        System.out.println("Final Direction: " + spaceCraft.getDirection());
    }
}

enum Direction {
    N, S, E, W, Up, Down
}
