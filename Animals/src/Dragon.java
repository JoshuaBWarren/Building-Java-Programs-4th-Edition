
public class Dragon extends Critter{

    private int moves;
    private static boolean hungry;
    
    public void Skunk() {  // constructor
        hungry = false;
    }
    public boolean eat() {
        hungry = true;
        return true;
    }
    public Direction getmoves() {
        moves++;
        if (moves >= 3) {
            moves = 0;
        }
        if (moves == 1 && moves == 2) {
            return Direction.WEST;
        } else if (hungry) {
            return Direction.NORTH;
        } else if (!hungry) {
            return Direction.SOUTH;
        } else {
        	return Direction.EAST;
        }
    }
}
