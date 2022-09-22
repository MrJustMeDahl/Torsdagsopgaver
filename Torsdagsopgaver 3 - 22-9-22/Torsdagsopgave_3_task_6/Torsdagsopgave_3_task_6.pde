int[][] board = new int[8][8];

void setup(){
  size(800, 800);
  for(int i = 0; i < board.length; i++){
    for(int j = 0; j < board[i].length; j++){
      if((i+j)%2 == 0){
        board[i][j] = 0;
      } else {
        board [i][j] = 1;
      }
    }
  }
  println(board[5][5]);
  println(board[5][6]);
}

void draw(){
  for(int i = 0; i < board.length; i++){
    for(int j = 0; j < board[i].length; j++){
      int sidelength = 40;
      if(board[i][j] == 0){
        fill(0);
      } else if(board[i][j] == 1){
        fill(255);
      }
      rect(i*sidelength, j*sidelength, sidelength, sidelength);
    }
  }
}
