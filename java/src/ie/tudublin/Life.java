package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet {

    int size = 100;
    float cellSize;
    boolean[][] board = new boolean[size][size];

    public int countCellsAround(int row,int col){

      int count = 0;
      for(int r = row - 1; r < row; r++){
        for (int c = col - 1; c < col; c++){

              getCell(board,r, c);
              count++;
        }
        count++;
      }

      return count;
    }


    public boolean setCell(boolean board[][],int row,int col,boolean b){
      if(row > 0 && row < size - 1 && col > 0 && col < size -1){
        return board[row][col];
      }
      else
        return false;
    }

    public boolean getCell(boolean board[][],int row,int col){
      return board[row][col];
    }

    public void drawBoard(boolean[][] board){
      for (int row = 0; row < size; row++ )
      {
        for (int col =0; col < size; col++)
        {
          float x = map(col,0,size,0,width);
          float y = map(row,0,size,0,height);
          if(board[row][col]){
            rect(x,y,cellSize,cellSize);
          }
        }
      }
    }

    private void printBoard(boolean[][] board){
      for (int row = 0; row < size; row++){
        for(int col = 0; col < size; col++){
          print(board[row][col] ? 1 : 0);
        }
        println();
      }
    }


    public void randomize(){
      for (int row = 0; row < size; row++){
        for(int col = 0; col < size; col++){
          float dice = random(0.0f, 1.0f);
          // if(dice >0.5){
          //   board[row][col] = true;
          // }
          // else{
          //   board[row][col] = false;
          // }
          board[row][col] = (dice < 0.5f) ? true :false;
        }
      }
    }

    public void settings(){
              size(500, 500);
    }
    int mode = 0;
    public void keyPressed() {
        // the value of mode will be the number of the
        // number key pressed
        if (keyCode >= '0' && keyCode <= '9')
            mode = keyCode - '0';
    }

    public void setup() {
        colorMode(RGB);
        // randomize();
        board[0][1] = true;
        board[0][2] = true;
        board[0][3] = true;
        board[1][1] = true;
        board[1][2] = true;
        board[1][3] = true;
        board[2][1] = true;
        board[2][2] = true;
        board[2][3] = true;
        cellSize = width / (size);
        // printBoard(board);
        println(countCellsAround(1 , 2));
    }

    public void draw() {
        background(0);
        drawBoard(board);
    }
}
