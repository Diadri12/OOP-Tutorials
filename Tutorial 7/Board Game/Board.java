package BoardGame;

import java.util.Random;

class Board {
    int ar[][];
    int i = 0;
    // creates a nxn size board
    public Board(int n) {
        ar = new int[n][n];
// fill in array with random ints in the range [0, 100]
        Random generator = new Random();
        for (int i=0; i < n; i++)
            for (int j=0; j < n; j++)
                ar[i][j] = generator.nextInt(101);
    }
    // display the contents of the board
    public void print() {
        for (int[] r : ar) { // for all rows
            for (int c : r) // for every element in current row
                System.out.print(c + " ");
            System.out.println();
        }
    }

    public void findMaxInRow(int row) {
        int max = this.ar[row][0];
        for (int Row:this.ar[row] ){
           if(Row > max){
               max = Row;
               System.out.println();
           }
        }
        System.out.println("The maximum number is: ");
    }

    public void MaxInColumn(int column){
        int max = 0;

    }

    public void findMaxInDiagonal(){
        int max = 0;
        for(int i = 0; i < ar.length;i++){
            if(ar[i][i]> max){
                max = ar[i][i];
            }
        }

    }
}



