package BoardGame;

import BoardGame.Board;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        Board board1 = new Board(5);
        board1.print();
        board1.findMaxInRow(2);
    }
}
